# ALTERNATIVES OPA / IBM BAMOE / RETEX POC

***verdict:** l'état actuel du logiciel ne permet pas une utilisation crédible*
___
## La promesse:
Un ensemble complet dédié règles/processus, contemporain, user friendly _et_ tech friendly, basé sur un projet open source amont et disponible auprès d'IBM en open source avec support.

## L'expérience:
Ensemble actuellement instable/lacunaire, au moins en raison de succession de phases de transition / aggrégation / renommage du projet open source amont ([Drools](https://www.drools.org/ "drools") --> [KIE](https://www.kie.org/ "kie") --> [Kogito](https://kogito.kie.org/ "kogito") --> [Red hat decision manager](https://access.redhat.com/products/red-hat-decision-manager "red hat dm") --> [IBM BAMOE](https://www.ibm.com/fr-fr/products/business-automation-manager-open-editions "ibm bamoe" )), phases semblant néanmoins terminées avec l'arrivée dans le giron ibm.

- absence de debugger en raison d'une migration de l'outillage depuis eclipse vers vscode
- absence de support pour l'écriture de règles au format DRL pour la même raison
- bugs primaires dans les interfaces utilisateurs DMN (corruption du fichier de règle)
- inconsistance de l'ensemble, "persone ne connaît personne", ni les outils de workflow ni les outils de règles n'ont connaissance les uns des autres ni même des objets java de base présents dans un projet, ce qui signifie _aucune_ forme d'assistance à la "cohérence" ( déplacer/renommer un quelconque élément du projet est un problème grave car aucun élément du projet ne prendra en compte ce déplacement ou renommage )
- bugs dans les interfaces utilisateurs (complétion effacant du code, erreur de type d'objet à créer (ex.:liste de personnes plutôt que personne), duplicata, ...)
- IBM demande RHEL pour garantir un fonctionnement nominal y compris sur le poste développeur

## Le stop:
L'absence de debugger additionnée au "persone ne connaît personne" rend toute utilisation "illusoire".
Dans l'absolu tout fonctionne, dans la pratique renommer un fichier ou une variable peut se révéler quasi impossible à gérer:

- le renommage introduit une erreur et, pas de chance, on a pas de debugger, bon courage pour remonter au problème..
- le renommage n'est pas répercuté dans les autres éléments du projets et, toujours pas de chance, on a toujours pas de debugger, bonne chasse..

Les messages d'erreur produits sont incompréhensibles
<br/>
<br/>
>Dans ces conditions le développement est peu envisageable.



## Le regret:
Des problèmes que l'on peut présumer techniquement d'ordre mineur et/ou temporaires amènent à se détourner d'une solution sans équivalent amenant pêle-mêle:

- DRL: un language de règle de base complet: variables, fonctions, collections, temporel 
- L'écriture "naturelle" via un DSL superposable au language DRL de base
- DMN: éditeur et représentation graphique de règles/services de décisions (état de l'art)
- BPMN: éditeur et représentation graphique de processus
- Serverless Workflow: éditeur et représentation graphique de processus (état de l'art)
- Utilisation de java à volonté, ou pas. Pas java 8, java 17 à 22, un truc du siècle
- Nativement Quarkus ( à destination de openshift, kubernetes, ...) et bénéficiant de son éco-système (persistence, évènement, service, ...)



## L'espoir:
En tant que DSI de portée nationale j'intègre et corrige le logiciel très attrayant afin de l'exploiter dès que faire ce peut.
