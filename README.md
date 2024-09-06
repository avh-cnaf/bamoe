
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
avec maven de debian
avec maven actuel (3.9.9)



-Incompatible firefox
-Incompatible gitlab
-Incompatible maven ( maven veut https, bamoe repository ne l'est pas, le workaround empêche l'install de certains autres projets (kogito) en raison de "enforcers" plus stricts )
-Via l'interface web Canvas les conflits de versions sont gérés en créant automatiquement des branches aux noms incompréhensibles (x_wrty87)
-Les propriétés contenant des objets ne sont pas/peu/mal supportées sur l'outillage graphique ( impossible de créer un test sur une "personne" qui aurait des "personne.ressources[]", ou créer ces personnes par la fonctionalité "relation")


-Editeurs: pas de completion/liaison au reste du projet, chaque fichier ne connaît rien de ce qui l'entoure, aucun moyen de "voir les utilisations" ( renommer/déplacer quoique ce soit se fait dans le noir absolu )
-Les erreurs générées lors de "mvn quarkus:dev" sont inutilisables, elles ne contiennent pas d'information sur l'origine de l'erreur.
-Les erreurs dans l'interface web ne sont guère mieux (ex.: IMPORT_NOT_FOUND: Required import not found: https://kie.org/dmn/_03C7B6E4-637F-4300-8574-9A4AAB0674EA for node '').
-Ne fonctionne pas:
mvn quarkus:dev: error, Caused by: jakarta.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type org.kie.kogito.process.Processes and qualifiers [@Default]
(ce qui, d'après mes écueils précédents, signifierai que le pan "Process" (jbpm, les fichiers .bpmn) n'est pas installé)

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
