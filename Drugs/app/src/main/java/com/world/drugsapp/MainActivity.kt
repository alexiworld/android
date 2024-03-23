package com.world.drugsapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.world.drugsapp.ui.theme.DrugsTheme
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            DrugsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    DrugsLayout()
                }
            }
        }
    }
}

fun randNotIn(range: IntRange, used: MutableSet<Int>): Int {
    var ret: Int
    do {
        ret = range.random()
    } while (ret in used)
    used.add(ret)
    return ret
}

class QnAData(val answerExpected: Int, val questionText: String,
              val answerIndexes: MutableList<Int>, val answerTexts: MutableList<String>) {}

fun nextQnAData(): QnAData {
    val used = mutableSetOf<Int>()

    //val numDrugs = QnAProvider.GENERICS.size
    val numOptions = 4

    var questionCategory = (1..QnAProvider.CATEGORIES.size).random()-1

    //var answerExpected = randNotIn((1..numDrugs), used)
    var answerExpected = randNotIn(QnAProvider.CATEGORIES[questionCategory], used)
    var questionText = QnAProvider.GENERICS[answerExpected-1]

    var answerIndexes = mutableListOf<Int>()
    var answerTexts = mutableListOf<String>()

    (1..numOptions - 1).forEach{
        //var answerIndex = randNotIn((1..numDrugs), used)
        var answerIndex = randNotIn(QnAProvider.CATEGORIES[questionCategory], used)
        var answerText = QnAProvider.BRANDS[answerIndex-1]
        answerIndexes.add(answerIndex)
        answerTexts.add(answerText)
    }

    var insertIndex = (0..numOptions - 1).random()
    answerIndexes.add(insertIndex, answerExpected)
    answerTexts.add(insertIndex, QnAProvider.BRANDS[answerExpected-1])

    return QnAData(answerExpected, questionText, answerIndexes, answerTexts)
}

@Composable
fun DrugsLayout() {
    var answerExpected by remember { mutableStateOf(-1) }
    var answerSelected by remember { mutableStateOf(-1) }
    var answerSubmitted by remember { mutableStateOf(false) }

    var questionText by remember { mutableStateOf("") }
    var answerIndexes by remember { mutableStateOf(mutableListOf<Int>()) }
    var answerTexts by remember { mutableStateOf(mutableListOf<String>()) }

    val result = if (answerSubmitted) (
        if (answerExpected == answerSelected) "Passed" else "Failed"
    ) else "Please select one!"


    if (answerExpected == -1) {
        val qnaData = nextQnAData()
        answerExpected = qnaData.answerExpected
        questionText = qnaData.questionText
        answerIndexes = qnaData.answerIndexes
        answerTexts = qnaData.answerTexts
    }

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = questionText + "?",
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        answerIndexes.zip(answerTexts) { answerIndex, answerText ->
            Row(
                modifier = Modifier.padding(bottom = 32.dp)
                    .fillMaxWidth()
                    .size(48.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = (answerSelected == answerIndex),
                    onClick = { answerSelected = answerIndex })
                Text(text = answerText,
                    style = MaterialTheme.typography.displaySmall)
            }
        }
        Text(
            text = result,
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            answerSubmitted = !answerSubmitted
            if (!answerSubmitted) {
                answerSelected = -1
                val qnaData = nextQnAData()
                answerExpected = qnaData.answerExpected
                questionText = qnaData.questionText
                answerIndexes = qnaData.answerIndexes
                answerTexts = qnaData.answerTexts
            }
        }) {
            Text(
                text = if (answerSubmitted) "Next" else "Submit",
                style = MaterialTheme.typography.displaySmall
            )
        }
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun AnswerRow(
    answerIndex: Int,
    answerText: String,
    onAnswerSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .size(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = false, onClick = {
            onAnswerSelected(answerIndex)
        })
        Text(text = answerText,
            style = MaterialTheme.typography.displaySmall)
    }
}

@Composable
fun CalculateTipsLayout() {
    var amountInput by remember { mutableStateOf("") }
    var tipInput by remember { mutableStateOf("") }
    var roundUp by remember { mutableStateOf(false) }

    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount, tipPercent, roundUp)

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        EditNumberField(
            label = R.string.bill_amount,
            leadingIcon = R.drawable.money,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            value = amountInput,
            onValueChanged = { amountInput = it },
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth(),
        )
        EditNumberField(
            label = R.string.how_was_the_service,
            leadingIcon = R.drawable.percent,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            value = tipInput,
            onValueChanged = { tipInput = it },
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth(),
        )
        RoundTheTipRow(
            roundUp = roundUp,
            onRoundUpChanged = { roundUp = it },
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Text(
            text = stringResource(R.string.tip_amount, tip),
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun EditNumberField(
    @StringRes label: Int,
    @DrawableRes leadingIcon: Int,
    keyboardOptions: KeyboardOptions,
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = value,
        singleLine = true,
        leadingIcon = { Icon(painter = painterResource(id = leadingIcon), null) },
        modifier = modifier,
        onValueChange = onValueChanged,
        label = { Text(stringResource(label)) },
        keyboardOptions = keyboardOptions
    )
}

@Composable
fun RoundTheTipRow(
    roundUp: Boolean,
    onRoundUpChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .size(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(R.string.round_up_tip))
        Switch(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End),
            checked = roundUp,
            onCheckedChange = onRoundUpChanged
        )
    }
}

/**
 * Calculates the tip based on the user input and format the tip amount
 * according to the local currency.
 * Example would be "$10.00".
 */
private fun calculateTip(amount: Double, tipPercent: Double = 15.0, roundUp: Boolean): String {
    var tip = tipPercent / 100 * amount
    if (roundUp) {
        tip = ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Preview(showBackground = true)
@Composable
fun DrugsLayoutPreview() {
    DrugsTheme {
        DrugsLayout()
    }
}