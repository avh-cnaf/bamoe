
Utilisation d'IBM BAMOE ( business automation manager open edition )

Images utilisées:
quay.io/bamoe/canvas             9.1.0-ibm-0001
quay.io/bamoe/extended-services  9.1.0-ibm-0001
quay.io/bamoe/cors-proxy         9.1.0-ibm-0001
quay.io/bamoe/maven-repository   9.1.0-ibm-0001


-Incompatible firefox
-Incompatible gitlab



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
