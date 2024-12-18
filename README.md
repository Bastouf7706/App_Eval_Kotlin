La plupart des fonctionnalités prévuent ou qui devaient être prévuent n'ont pas pu être déployer en raison du matériel que j'ai actuellement...

Récapitulatif du sujet : Crée une application permettant de récupérer des données d'une API existante sur Internet

Pour le choix de l'API, j'ai choisi celle du Café (Lien:https://coffee.alexflipnote.dev/)
Les fonctionnalités qui sont actuellement dans le projet sont : 
  -Toute la partie NavHost (Ne sait pas si ça marche car problème technique)
  -Quelques bases de communication avec l'API même si rien n'est fonctionnel
  -2 écrans fonctionnel grâce à une Preview (Pour éviter de lancer tout le temps l'appli et de faire suer mon PC)
PS: A l'heure ou j'écris ce README, la navigation entre les 2 écrans fait crash l'application de mon coté

Pour les choix techniques, le langage utilisé est Kotlin sur Android Studio
Pour la communication avec l'appli et l'API : Retrofix avec des ViewModels

Architecture du code (En gros) :
  -Un dossier Data contenant les Datasources et les Repositories (Les 2 contiennent un fichier Remote et Repo)
  -Un dossier Domain avec les Models et leurs Repositories
  -Un dossier Ui contenant les Screens (avec 2 screens et un ViewModel) et les Theme
  Et un dossier Network crée pour contenir l'APIService
