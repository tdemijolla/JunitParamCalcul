Projet contenant des tests sans SUT en JUnit Jupiter. Chaque test contient une simple assertion sur un calcul.
Ce projet est composé de 2 classes, le résultat du test est défini selon les paramètres envoyés.
Plusieurs paramètres sont nécessaires (attention : dans Squash TM ces valeurs ne doivent pas contenir les "DS_". Ceci sera automatiquement ajouté lors du transfert de paramètre de Squash TM à Squash TF):

Tests sur les jeux de données :

    - DS_VAR1 : Première valeur du calcul
    - DS_VAR2 : Seconde valeur du calcul
    - DS_RES : Résultat attendu par le calcul
    - DS_VAR1 : Première valeur du calcul

Tests sur les CUFs :

    - CUF_TC_number : Premier chiffre à additioner; Pour le test CheckTestCase, la valeur doit être à 3
    - CUF_CPG_number2 : Second chiffre à additioner
    - CUF_IT_number3 : Troisième chiffre à additioner
    - CUF_TS_number4 : Quatrième chiffre à additioner
    - DSNAME : Cinquième chiffre à additioner
    - DS_expectedResult : Résultat attendu

Calculator.java : - add(displayName = "Addition")
		          - mult

CalcSecondPart.java : - sub(displayName = "Substraction")
                      - checkTCCUF(displayName = "CheckTestCase")
                      - checkPremiumCUF(displayName = "CheckPremiumCUF")