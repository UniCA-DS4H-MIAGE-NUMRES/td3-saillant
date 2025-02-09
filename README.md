PizzAppMP - Projet Multiplateforme
=== 

# Description

PizzAppMP est une application de commande de pizzas développée dans le cadre du TD3 du cours de Programmation Mobile du Master MIAGE NUMRES à l'Université Côte d'Azur. L'objectif de ce projet était de transformer l'application initiale en une solution multiplateforme fonctionnant sur Android, iOS, Web et Desktop (Windows, macOS, Linux)

# Binôme
- LESSATINI Morgane
- SAILLANT Nicolas

[Lien vers la video](https://drive.google.com/file/d/1yw5zf0aJRN03O4ElaIJXiaHQojtay9uk/view?usp=sharing) 
# Déploiement

```sh
git clone https://github.com/UniCA-DS4H-MIAGE-NUMRES/td3-saillant.git
cd PizzAppMP
```

- Android
    - Lancer le projet dans un emulateur android (exemple android studio)

- Desktop
```sh
.\gradlew :composeApp:run  
```

- Web
```sh
./gradlew :composeApp:wasmJsBrowserDevelopmentRun
```

# Difficultés rencontrées

Lors du développement de la version multiplateforme, des défis ont été rencontrés, en particulier avec la version Web. Voici les principales difficultés :

- Problèmes de compatibilité avec certaines bibliothèques : Certaines dépendances utilisées pour Android ne fonctionnaient pas directement sur Web et desktop.
- Des problèmes avec la partie WEB du projet fini par être résolu
- L'affichage des images a pu possé problèmes en fonction de la platformes
