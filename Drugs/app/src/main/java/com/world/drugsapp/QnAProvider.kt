package com.world.drugsapp

class QnAProvider {

    companion object {
        val GENERICS =
            //listOf("Gen1", "Gen2", "Gen3", "Gen4", "Gen5", "Gen6", "Gen7", "Gen8", "Gen9", "Gen10")
            listOf(
                "brimonidine (ophthalmic)",
                "timolol 1/2 (ophthalmic)",
                "timolol 2/2 (ophthalmic)",
                "bimatoprost 1/2 (ophthalmic)",
                "bimatoprost 2/2 (ophthalmic)",
                "latanoprost (ophthalmic)",
                "travoprost (ophthalmic)",
                "cyclosporine (ophthalmic)",
                "prednisolone 1/3 (ophthalmic)",
                "prednisolone 2/3 (ophthalmic)",
                "prednisolone 3/3 (ophthalmic)",
                "permethrin 1/2 (topical) OTC",
                "permethrin 2/2 (topical) OTC",
                "adapalene (topical) OTC",
                "chlorhexidine 1/2 (topical, PO)",
                "chlorhexidine 2/2 (topical, PO)",
                "clobetasol 1/2 (topical)",
                "clobetasol 2/2 (topical)",
                "triamcinolone (topical)",
                "pseudoephedrine (PO) OTC",
                "fluticasone (intranasal) OTC",
                "triamcinolone (intranasal) OTC",
                "azelastine (intranasal) OTC",
                "diphenhydramine (PO OTC, IV)",
                "hydroxyzine (PO, IV)",
                "cetirizine (PO) OTC",
                "loratadine (PO) OTC",
                "fexofenadine (PO) OTC",
                "olopatadine 1/2 (ophthalmic) OTC",
                "olopatadine 2/2 (ophthalmic) OTC",
                "promethazine and codeine (PO)",
                "codeine and guaifenesin 1/2 (PO)",
                "codeine and guaifenesin 2/2 (PO)",
                "dextromethorphan (PO) OTC",
                "benzonatate (PO)",
                "dutasteride (PO)",
                "finasteride BPH 1/2 (PO)",
                "finasteride Alopecia 2/2 (PO)",
                "doxazosin (PO)",
                "terazosin (PO)",
                "tamsulosin (PO)",
                "solifenacin (PO)",
                "tolterodine  (PO)",
                "oxybutynin (PO) OTC",
                "phenazopyridine 1/2 (PO)OTC",
                "phenazopyridine 2/2 (PO)OTC",
                "calcium gluconate (IV)",
                "magnesium sulfate (IV, IM)",
                "potassium chloride 1/3 (PO) ",
                "potassium chloride 2/2 (PO)",
                "potassium chloride 3/3 (PO)",
                "ergocalciferol (VitD2) (PO)",
                "albumin, 5% or 25% (IV)",
                "0.9% sodium chloride (IV)",
                "lactated ringers (IV)",
                "5% dextrose in water (IV)",
                "benazepril (PO)",
                "enalapril (PO)",
                "lisinopril 1/2 (PO)",
                "lisinopril 2/2 (PO)",
                "quinapril (PO)",
                "ramipril (PO)",
                "irbesartan (PO)",
                "losartan (PO)",
                "olmesartan (PO)",
                "valsartan (PO)",
                "valsartan and sacubitril (PO)",
                "amlodipine (PO)",
                "nifedipine 1/3 (PO)",
                "nifedipine 2/3 (PO)",
                "nifedipine 3/3 (PO)",
                "nicardipine (PO, IV)",
                "diltiazem (PO, IV)",
                "verapamil 1/2 (PO)",
                "verapamil 2/2 (PO)",
                "hydrochlorothiazide (PO) ",
                "chlorthalidone (PO)",
                "metolazone (PO)",
                "amlodipine and benazepril (PO)",
                "lisinopril and hydrochlorothiazide (PO)",
                "losartan and hydrochlorothiazide (PO)",
                "olmesartan and hydrochlorothiazide (PO)",
                "triamterene and hydrochlorothiazide 1/2 (PO)",
                "triamterene and hydrochlorothiazide 2/2 (PO)",
                "valsartan and hydrochlorothiazide (PO)",
                "spironolactone (PO)",
                "bumetanide (PO, IV)",
                "furosemide (PO, IV)",
                "torsemide (PO)",
                "atenolol (PO)",
                "metoprolol tartrate (PO, IV)",
                "metoprolol succinate (PO)",
                "nebivolol (PO)",
                "carvedilol (PO)",
                "labetalol (PO, IV)",
                "propranolol (PO)",
                "clonidine (PO)",
                "clonidine (transdermal)",
                "hydralazine (PO, IV)",
                "epinephrine (IV, IM, SQ)",
                "norepinephrine (IV)",
                "dabigatran (PO)",
                "apixaban (PO)",
                "rivaroxaban (PO)",
                "warfarin 1/2 (PO)",
                "warfarin 2/2 (PO)",
                "enoxaparin (SQ)",
                "heparin (IV, SQ)",
                "clopidogrel (PO)",
                "dipyridamole and aspirin (PO)",
                "ticagrelor (PO)",
                "prasugrel (PO)",
                "alteplase (intracatheter)",
                "alteplase (IV)",
                "amiodarone (PO)",
                "amiodarone (IV)",
                "digoxin (IV)",
                "digoxin (PO) 1/2",
                "digoxin (PO) 2/2",
                "ezetimibe (PO)",
                "fenofibrate 1/2 (PO)",
                "fenofibrate 2/2 (PO)",
                "gemfibrozil (PO)",
                "atorvastatin (PO)",
                "lovastatin (PO)",
                "pravastatin (PO)",
                "rosuvastatin (PO)",
                "simvastatin (PO)",
                "omega-3 fatty acids 1/2 (PO) OTC",
                "omega-3 fatty acids 2/2 (PO) OTC",
                "niacin (extended release) (PO) OTC",
                "beclomethasone (INH)",
                "budesonide (INH)",
                "fluticasone propionate (INH) 1/2",
                "fluticasone propionate (INH) 2/2",
                "fluticasone and salmeterol (INH) 1/2",
                "fluticasone and salmeterol (INH) 2/2",
                "budesonide and formoterol (INH)",
                "mometasone and formoterol (INH)",
                "tiotropium (INH)",
                "theophylline 1/2 (PO)",
                "theophylline 2/2 (PO)",
                "albuterol (INH) 1/3",
                "albuterol (INH) 2/3",
                "albuterol (INH) 3/3",
                "levalbuterol (INH)",
                "ipratropium (INH)",
                "montelukast (PO)",
                "varenicline (PO)",
                "ipratropium and albuterol (INH)",
                "penicillin VK (PO)",
                "penicillin-G potassium (IV)",
                "amoxicillin (PO)",
                "ampicillin (PO, IV)",
                "amoxicillin and clavulanate (PO)",
                "ampicillin and sulbactam (IV)",
                "piperacillin and tazobactam (IV)",
                "nafcillin (IV)",
                "oxacillin (IV)",
                "cephalexin (PO) ",
                "linezolid  (PO,IV)",
                "daptomycin  (IV)",
                "ceftazidime avibactam (IV)",
                "aztreonam (IV)",
                "cefazolin (IV)",
                "cefuroxime (IV)",
                "cefuroxime (PO)",
                "cefdinir (PO)",
                "ceftriaxone (IV, IM)",
                "cefepime (IV)",
                "meropenem (IV)",
                "ertapenem (IV)",
                "ciprofloxacin (PO, IV)",
                "levofloxacin  (PO, IV)",
                "moxifloxacin (ophthalmic)",
                "moxifloxacin (PO, IV)",
                "azithromycin 1/3 (PO, IV)",
                "azithromycin 2/3 (PO, IV)",
                "azithromycin 3/3 (PO, IV)",
                "clarithromycin (PO, IV)",
                "fidaxomicin (PO)",
                "doxycycline (PO, IV)",
                "minocycline (PO, IV) ",
                "clindamycin (PO, IV)",
                "sulfamethoxazole and trimethoprim 400/80 mg (PO, IV)",
                "sulfamethoxazole and trimethoprim 800/160 mg (PO, IV)",
                "nitrofurantoin (PO)",
                "gentamicin (IV)",
                "vancomycin (IV, PO)",
                "metronidazole (PO, IV)",
                "mupirocin (topical)",
                "terbinafine (PO, topical OTC)",
                "ganciclovir (IV)",
                "foscarnet (IV)",
                "acyclovir (PO, IV)",
                "valacyclovir (PO)",
                "amphotericin B liposomal (IV)",
                "voriconazole (PO, IV)",
                "fluconazole (PO, IV)",
                "ketoconazole (PO, topical OTC)",
                "oseltamivir (PO)",
                "nystatin (PO)",
                "nystatin (topical)",
                "micafungin (IV)",
                "betamethasone and clotrimazole (topical)",
                "tizanidine (PO)",
                "hydroxychloroquine (PO)",
                "colchicine (PO)",
                "diclofenac (PO)",
                "ibuprofen 1/2 (PO) OTC",
                "ibuprofen 2/2 (PO) OTC",
                "meloxicam (PO)",
                "indomethacin (PO)",
                "naproxen (PO) OTC 1/3",
                "naproxen (PO) OTC 2/3",
                "naproxen (PO) OTC 3/3",
                "ketorolac (PO, IV)",
                "celecoxib (PO)",
                "diclofenac (topical) OTC",
                "cyclobenzaprine (PO)",
                "baclofen (PO)",
                "carisoprodol (PO)",
                "methocarbamol (PO)",
                "metaxalone (PO)",
                "lidocaine (transdermal OTC)",
                "lidocaine (IV)",
                "allopurinol (PO)",
                "succinylcholine (IV)",
                "metformin (PO)",
                "sitagliptin (PO)",
                "empagliflozin (PO)",
                "glimepiride (PO)",
                "glipizide (PO)",
                "glyburide (PO)",
                "pioglitazone (PO)",
                "liraglutide 1/2 (SQ)",
                "liraglutide 2/2 (SQ)",
                "insulin detemir (SQ)",
                "insulin glargine (SQ)  1/3",
                "insulin glargine (SQ)  2/3",
                "insulin glargine (SQ)  3/3",
                "insulin NPH 1/2 (SQ)",
                "insulin NPH 2/2 (SQ)",
                "insulin aspart (SQ)",
                "insulin lispro (SQ)",
                "insulin regular 1/2 (SQ, IV)",
                "insulin regular 2/2 (SQ, IV)",
                "levothyroxine 1/2 (PO, IV)",
                "levothyroxine 2/2 (PO, IV)",
                "liothyronine",
                "thyroid, dessicated (PO)",
                "sitagliptin and metformin (PO)",
                "drospirenone and ethinyl estradiol (PO) 1/2",
                "drospirenone and ethinyl estradiol (PO) 2/2",
                "levonorgestrel and ethinyl estradiol (PO) 1/3",
                "levonorgestrel and ethinyl estradiol (PO) 2/3",
                "levonorgestrel and ethinyl estradiol (PO) 3/3",
                "norethindrone and ethinyl estradiol (PO) 1/3",
                "norethindrone and ethinyl estradiol (PO) 2/3",
                "norethindrone and ethinyl estradiol (PO) 3/3",
                "norethindrone, ethinyl estradiol, and ferrous fumarate (PO) 1/2",
                "norethindrone, ethinyl estradiol, and ferrous fumarate (PO) 2/2",
                "norgestimate and ethinyl estradiol (PO) 1/3",
                "norgestimate and ethinyl estradiol (PO) 2/3",
                "norgestimate and ethinyl estradiol (PO) 3/3",
                "norgestrel and ethinyl estradiol (PO) 1/2",
                "norgestrel and ethinyl estradiol (PO) 2/2",
                "estrogens, conjugated (equine) (PO, topical)",
                "estradiol (transdermal)",
                "estradiol (PO)",
                "medroxyprogesterone (PO)",
                "testosterone gel (topical) 1/3",
                "testosterone gel (topical) 2/3",
                "testosterone gel (topical) 3/3",
                "alendronate (PO)",
                "zolendronic acid  (IV)",
                "ibandronate (PO, IV)",
                "raloxifene (PO)",
                "sildenafil (PO)",
                "tadalafil (PO)",
                "mirtazapine (PO)",
                "bupropion (PO) ",
                "atomoxetine (PO)",
                "desvenlafaxine (PO)",
                "duloxetine (PO)",
                "venlafaxine (PO) ",
                "citalopram (PO)",
                "fluoxetine (PO)",
                "escitalopram (PO)",
                "paroxetine (PO)",
                "sertraline (PO)",
                "trazodone (PO)",
                "vilazodone (PO)",
                "amitriptyline (PO)",
                "nortriptyline (PO)",
                "doxepin (PO)",
                "benztropine (PO)",
                "dexmethylphenidate (PO)",
                "dextroamphetamine and amphetamine (PO)",
                "lisdexamfetamine (PO)",
                "methylphenidate (PO) 1/3",
                "methylphenidate (PO) 2/3",
                "methylphenidate (PO) 3/3",
                "guanfacine (PO)",
                "pramipexole (PO)",
                "ropinirole (PO)",
                "carbidopa and levodopa (PO)",
                "memantine (PO)",
                "donepezil (PO)",
                "lithium (PO)",
                "sumatriptan (PO, intranasal, SQ)",
                "haloperidol (PO, IV, IM)",
                "clozapine (PO)",
                "aripiprazole (PO, IM)",
                "quetiapine (PO)",
                "olanzapine (PO, IM)",
                "risperidone (PO)",
                "risperidone (IM)",
                "ziprasidone (PO, IM)",
                "carbamazepine (PO)",
                "lamotrigine (PO)",
                "divalproex (valproic acid derivative) (PO) 1/2",
                "divalproex (valproic acid derivative) (PO) 2/2",
                "topiramate (PO)",
                "levetiracetam (PO, IV)",
                "oxcarbazepine (PO)",
                "phenobarbital (PO, IM, IV) ",
                "phenytoin (PO, IV)",
                "gabapentin (PO)",
                "pregabalin (PO)",
                "buspirone (PO)",
                "alprazolam (PO)",
                "clonazepam (PO)",
                "diazepam (PO, IV)",
                "lorazepam (PO, IV)",
                "midazolam (IV, IM)",
                "temazepam (PO)",
                "eszopiclone (PO)",
                "zolpidem (PO)",
                "zolpidem (SL)",
                "propofol (IV)",
                "dexmedetomidine (IV)",
                "dicyclomine (PO)",
                "lubiprostone (PO)",
                "dexamethasone (PO, IV) 1/2",
                "dexamethasone (PO, IV) 2/2",
                "methylprednisolone (PO, IV)",
                "prednisolone (PO)",
                "prednisone (PO)",
                "hydrocortisone (topical) OTC 1/2",
                "hydrocortisone (topical) OTC 2/2",
                "hydrocortisone (IV)",
                "metoclopramide (PO, IV)",
                "prochlorperazine (PO, PR, IM, IV)",
                "ondansetron (PO, IV)",
                "promethazine (PO, IM, IV, PR)",
                "lactulose 1/2 (PO)",
                "lactulose 2/2 (PO)",
                "diphenoxylate and atropine (PO)",
                "famotidine (PO, IV) OTC",
                "dexlansoprazole (PO)",
                "esomeprazole (PO, IV) OTC",
                "lansoprazole (PO) OTC",
                "omeprazole (PO) OTC",
                "pantoprazole (PO, IV)",
                "sucralfate (PO)",
                "fentanyl  (transdermal)",
                "fentanyl  (IV)",
                "hydromorphone (PO, IV)",
                "morphine (extended release) (PO) 1/2",
                "morphine (extended release) (PO) 2/2",
                "morphine (immediate release) (IV) 1/2",
                "morphine (immediate release) (IV) 2/2",
                "oxycodone (PO) 1/2",
                "oxycodone (PO) 2/2",
                "methadone (PO, IV)",
                "acetaminophen (PO, PR) OTC",
                "acetaminophen (IV)",
                "tramadol (PO)",
                "hydrocodone and acetaminophen (PO) 1/3",
                "hydrocodone and acetaminophen (PO) 2/3",
                "hydrocodone and acetaminophen (PO) 3/3",
                "oxycodone and acetaminophen (PO) 1/3",
                "oxycodone and acetaminophen (PO) 2/3",
                "oxycodone and acetaminophen (PO) 3/3",
                "codeine and acetaminophen (PO) 1/2",
                "codeine and acetaminophen (PO) 2/2",
                "naloxone (IV, IM, SQ, intranasal)",
                "buprenorphine",
                "ketamine (IV)",
                "buprenorphine and naloxone (SL)",
                "methotrexate (PO)",
                "anastrozole (PO)",
                "phentermine (PO)",
                "ferrous sulfate (PO) OTC 1/2",
                "ferrous sulfate (PO) OTC 2/2",
                "ferrous sucrose (IV) ",
                "ferrous gluconate (IV) ",
                "cyanocobalamin (VitB12) (PO, IM, SL, intranasal) ",
                "folic acid (PO) OTC"
                )
        val BRANDS =
            //listOf("Brand1", "Brand2", "Brand3", "Brand4", "Brand5", "Brand6", "Brand7", "Brand8", "Brand9", "Brand10")
            listOf(
                "Alphagan P",
                "Timoptic",
                "Istalol",
                "Lumigan",
                "Latisse",
                "Xalatan",
                "Travatan Z",
                "Restasis",
                "Pred Forte",
                "Pred Mild",
                "Omnipred",
                "Nix",
                "Elimite",
                "Differin",
                "Hibiclens",
                "Peridex",
                "Temovate",
                "Clobex",
                "Kenalog",
                "Sudafed",
                "Flonase",
                "Nasacort",
                "Astepro",
                "Benadryl",
                "Vistaril",
                "Zyrtec",
                "Claritin",
                "Allegra",
                "Pataday",
                "Patanol",
                "Phenergan with Codeine",
                "Robitussin AC",
                "Cheratussin AC",
                "Delsym",
                "Tessalon Perles",
                "Avodart",
                "Proscar",
                "Propecia",
                "Cardura",
                "Hytrin",
                "Flomax",
                "Vesicare",
                "Detrol",
                "Ditropan",
                "Azo Urinary Pain Relief",
                "Pyridium",
                "Neut",
                "N/A",
                "K-Tab",
                "Klor-Con",
                "Micro-K",
                "Calciferol/Drisdol",
                "Colloid",
                "Normal saline",
                "LR",
                "D5W",
                "Lotensin",
                "Vasotec",
                "Prinivil",
                "Zestril",
                "Accupril",
                "Altace",
                "Avapro",
                "Cozaar",
                "Benicar",
                "Diovan",
                "Entresto",
                "Norvasc",
                "Procardia XL",
                "Nifedical XL",
                "Adalat CC",
                "Cardene",
                "Cardizem (LA)",
                "Calan",
                "Verelan",
                "Microzide",
                "Thalitone",
                "Zaroxolyn",
                "Lotrel",
                "Prinzide",
                "Hyzaar",
                "Benicar-HCT",
                "Dyazide",
                "Maxzide",
                "Diovan-HCT",
                "Aldactone",
                "Bumex",
                "Lasix",
                "Demadex",
                "Tenormin",
                "Lopressor",
                "Toprol-XL",
                "Bystolic",
                "Coreg",
                "Trandate",
                "Inderal (LA)",
                "Catapres",
                "Catapres-TTS",
                "Apresoline",
                "Adrenalin",
                "Levophed",
                "Pradaxa",
                "Eliquis",
                "Xarelto",
                "Coumadin",
                "Jantoven",
                "Lovenox",
                "N/A",
                "Plavix",
                "Aggrenox",
                "Brillinta",
                "Effient",
                "Cathflo",
                "Activase",
                "Pacerone",
                "Nexterone",
                "Lanoxin",
                "Digitek",
                "Digox",
                "Zetia",
                "Tricor",
                "Trilipix",
                "Lopid",
                "Lipitor",
                "Mevacor",
                "Pravachol",
                "Crestor",
                "Zocor",
                "Lovaza",
                "Vascepa",
                "Niaspan",
                "Qvar",
                "Pulmicort",
                "Flovent",
                "Arnuity Ellipta",
                "Advair",
                "Wixela",
                "Symbicort",
                "Dulera",
                "Spiriva",
                "Theo-24",
                "Theochron",
                "Proventil",
                "Ventolin",
                "ProAir",
                "Xopenex",
                "Atrovent HFA",
                "Singulair",
                "Chantix",
                "Combivent",
                "Pen-VK",
                "Pfizerpen",
                "Amoxil",
                "N/A",
                "Augmentin",
                "Unasyn",
                "Zosyn",
                "N/A",
                "N/A",
                "Keflex",
                "Zyvox",
                "Cubicin",
                "Avycaz",
                "Azactam",
                "Ancef",
                "Zinacef",
                "Ceftin",
                "Omnicef",
                "Rocephin",
                "Maxipime",
                "Merrem",
                "Invanz",
                "Cipro",
                "Levaquin",
                "Vigamox",
                "Avelox",
                "Zithromax",
                "Z-Pak",
                "Zmax",
                "Biaxin (XL)",
                "Dificid",
                "Vibramycin",
                "Minocin",
                "Cleocin",
                "Bactrim",
                "Bactrim DS",
                "Macrobid",
                "N/A",
                "Vancocin",
                "Flagyl",
                "Bactroban",
                "Lamisil",
                "Cytovene",
                "Foscavir",
                "Zovirax",
                "Valtrex",
                "AmBiosome",
                "Vfend",
                "Diflucan",
                "Nizoral",
                "Tamiflu",
                "N/A",
                "Nystop",
                "Mycamine",
                "Lotrisone",
                "Zanaflex",
                "Plaquenil",
                "Colcrys",
                "Voltaren",
                "Motrin",
                "Advil",
                "Mobic",
                "Indocin",
                "Naprosyn",
                "Anaprox",
                "Aleve",
                "Toradol",
                "Celebrex",
                "Voltaren Gel",
                "Flexeril",
                "baclofen (PO)",
                "Soma",
                "Robaxin",
                "Skelaxin",
                "Lidoderm",
                "Xylocaine",
                "Zyloprim",
                "Anectine",
                "Glucophage",
                "Januvia",
                "Jardiance",
                "Amaryl",
                "Glucotrol (XL)",
                "Glynase",
                "Actos",
                "Victoza",
                "Saxenda",
                "Levemir",
                "Lantus",
                "Toujeo",
                "Basaglar",
                "Humulin N",
                "Novolin N",
                "Novolog",
                "Humalog",
                "Humulin R",
                "Novolin R",
                "Synthroid",
                "Levoxyl",
                "Cytomel",
                "Armour Thyroid",
                "Janumet",
                "Yasmin",
                "Yaz",
                "Lutera",
                "Levora",
                "Seasonique",
                "Junel",
                "Loestrin",
                "Microgestin",
                "Lo Loestrin Fe",
                "Microgestin Fe",
                "Ortho Tri-Cyclen Lo",
                "Tri-Sprintec",
                "Sprintec",
                "Crysell-28",
                "Low-Ogestrel",
                "Premarin",
                "Vivelle Dot",
                "Estrace",
                "Provera",
                "AndroGel",
                "Fortesta",
                "Vogelxo",
                "Fosamax",
                "Rclast;Zometa",
                "Boniva",
                "Evista",
                "Viagra",
                "Cialis",
                "Remeron",
                "Wellbutrin SR/XL",
                "Strattera",
                "Pristiq",
                "Cymbalta",
                "Effexor (XL)",
                "Celexa",
                "Prozac",
                "Lexapro",
                "Paxil",
                "Zoloft",
                "Desyrel",
                "Viibryd",
                "Elavil",
                "Pamelor",
                "Silenor",
                "Cogentin",
                "Focalin XR",
                "Adderall (XR)",
                "Vyvanse",
                "Concerta",
                "Metadate",
                "Ritalin",
                "Intuniv",
                "Mirapex",
                "Requip",
                "Sinemet (CR)",
                "Namenda",
                "Aricept",
                "Lithobid",
                "Imitrex",
                "Haldol",
                "Clozaril",
                "Abilify",
                "Seroquel (XR)",
                "Zyprexa",
                "Risperdal",
                "Risperdal Consta",
                "Geodon",
                "Tegretol",
                "Lamictal",
                "Depakote",
                "Depakene",
                "Topamax",
                "Keppra",
                "Trileptal",
                "N/A",
                "Dilantin",
                "Neurontin",
                "Lyrica",
                "Buspar",
                "Xanax",
                "Klonopin",
                "Valium",
                "Ativan",
                "Versed",
                "Restoril",
                "Lunesta",
                "Ambien",
                "Intermezzo",
                "Diprivan",
                "Precedex",
                "Bentyl",
                "Amitiza",
                "DexPak",
                "Decadron",
                "Medrol",
                "Orapred",
                "Deltasone",
                "Cortisone",
                "Cortaid",
                "Solu-Cortef",
                "Reglan",
                "Compazine",
                "Zofran (ODT)",
                "Phenergan",
                "Constulose",
                "Enulose",
                "Lomotil",
                "Pepcid",
                "Dexilant",
                "Nexium",
                "Prevacid",
                "Prilosec",
                "Protonix",
                "Carafate",
                "Duragesic",
                "Sublimaze",
                "Dilaudid",
                "MS Contin",
                "Kadian",
                "Duramorph",
                "Infumorph",
                "Oxycontin",
                "Roxicodone",
                "Dolophine",
                "Tylenol",
                "Ofirmev",
                "Ultram (ER)",
                "Lortab",
                "Vicodin",
                "Norco CII",
                "Percocet",
                "Endocet",
                "Roxicet CII",
                "Tylenol with Codeine #3",
                "Tylenol with Codeine #4 (CIII tabs; CV:liquids)",
                "Narcan",
                "Buprenex",
                "Ketalar (CIII)",
                "Suboxone",
                "Trexall",
                "Arimidex",
                "Adipex-P (CIV)",
                "FeroSul",
                "SlowFe",
                "Venofet",
                "Ferrlecit",
                "N/A",
                "N/A"
                )
        val CATEGORIES = listOf(
            (1 .. 35),
            (36 .. 56),
            (57 .. 131),
            (132 .. 150),
            (151 .. 204),
            (205 .. 220),
            (221 .. 252),
            (253 .. 280),
            (281 .. 342),
            (343 .. 366),
            (367 .. 400)
        )
    }
}