
Utilisation d'IBM BAMOE ( business automation manager open edition )

Images utilisées:
quay.io/bamoe/canvas             9.1.0-ibm-0001
quay.io/bamoe/extended-services  9.1.0-ibm-0001
quay.io/bamoe/cors-proxy         9.1.0-ibm-0001
quay.io/bamoe/maven-repository   9.1.0-ibm-0001


Essayées sur:
debian stable
debian testing 
avec docker 
avec podman
avec maven des debian
avec maven actuel (3.9.9)



-Incompatible firefox
-Incompatible gitlab
-Incompatible maven:
    -maven veut exclusivement des dépôts https, bamoe repository ne l'est pas.
    -le workaround empêche l'install de certains autres projets (ex. kogito) en raison de "enforcers" plus stricts.
    -il faut modifier la configuration de maven pour jongler, ce n'est pas jouable.

-Via l'interface web Canvas les conflits de versions sont gérés en créant automatiquement des branches aux noms incompréhensibles (x_wrty87) et surtout ne permettant aucune identification (auteur, sujet). 
-Via l'interface web Canvas les propriétés contenant des objets ne sont pas/peu/mal supportées sur l'outillage graphique ( impossible de créer un test sur une "personne" qui aurait des "personne.ressources[]", ou de créer ces personnes par la fonctionalité "relation" par ex. )
-L'interface web Canvas est défectueuse sur beaucoup de points ( des noeuds "result" dont le contenu se met parfois à remplacer la ligne précédente dans un node "context", les "included models" qui ne fonctionnent pas, les noms par défaut rendant les messages d'erreur inexploitables (ex.: "FAILED_XML_VALIDATION: Failed XML validation of DMN file: src/main/resources/Jeux de donnees de test AVVC.dmn - cvc-id.2: There are multiple occurrences of ID value '_8E9C4E35-D645-4EF1-8A46-B6B41DD020DE'"), etc... )
-L'interface web Canvas est d'une ergonomie pour le moins discutable ( les menus qui ne se ferment pas quand on clic ailleurs par ex., cela se "remarque" vite, les selection/édition/complétion des cellules..c'est "compliqué".. )

-Les éditeurs: pas de completion/liaison au reste du projet, chaque fichier ne connaît rien de ce qui l'entoure, aucun moyen de "voir les utilisations" ( renommer/déplacer quoique ce soit se fait dans le noir absolu )
-Les erreurs générées lors du fonctionnement de "mvn quarkus:dev" sont inutilisables, elles ne contiennent pas d'information sur l'origine de l'erreur.
-Les erreurs dans l'interface web ne sont guère mieux (ex.: IMPORT_NOT_FOUND: Required import not found: https://kie.org/dmn/_03C7B6E4-637F-4300-8574-9A4AAB0674EA for node '').
-BAMOE ne fonctionne pas:
    mvn quarkus:dev: --> error, Caused by: jakarta.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type org.kie.kogito.process.Processes and qualifiers [@Default]

Face à l'ocean de paquets drools/kie/kogito/quarkus il n'a pas été possible de faire tourner une version sur laquelle l'ensemble des fonctionnalités (drl,dmn,bpm,sw) soient stables/utilisables en dépit d'essais avec plusieurs dépôts et branches ( kie kogito, apache incubator kogito, main, stable, nightly, kogito examples, kogito runtimes, ...).

Sur notre plateforme quarkus s'installe et fonctionne, ou du moins semble fonctionner, correctement.

Nous aimerions avoir une liste ( distribution & version linux, dépôt et branche, version outillage si besoin (maven, docker, podman,..)) permettant de faire fonctionner BAMOE.

```
systemctl start container-bamoe_canvas
http://localhost:9090
```

------------------ fin de l'utilisation ---------------------------------------











# bamoe-canvas-quarkus-accelerator
This is the BAMOE Canvas Quarkus Accelerator for Decisions and Workflows

Apply it to you repository inside BAMOE Canvas to build and run your decisions.

*NOTE: Docker is required to run this image with all its dependencies.*

## Running

Start the Quarkus server with:
- `mvn quarkus:dev`

Your application will up at http://localhost:8080.

The OpenAPI spec will be available at http://localhost:8080/q/openapi or http://localhost:8080/q/openapi?format=json.

The Swagger interface will be at http://localhost:8080/q/swagger-ui.

More tools available via Quarkus Dev UI http://localhost:8080/q/dev.
