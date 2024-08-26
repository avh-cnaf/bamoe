Jé fé ssa:
```
$incubator-kie-kogito-runtimes-main ../apache-maven-3.9.9/bin/mvn install -DskipTests

mvn io.quarkus:quarkus-maven-plugin:create -DprojectGroupId=fr.cnaf -DprojectArtifactId=hello-world -DprojectVersion=1.0.0-SNAPSHOT
cd hello-world

màj pom.xml:
  dep managnmt: org.kie.kogito:kogito-bom:999-SNAPSHOT,type=pom,scope=import
  dep:
    org.kie:kie-addons-quarkus-messaging
    io.quarkus:quarkus-smallrye-reactive-messaging-kafka
    io.quarkus:quarkus-resteasy-reactive
    io.quarkus:quarkus-resteasy-reactive-jackson
    org.kie:kie-quarkus-predictions

mvn compile
mvn install
mvn quarkus:dev
```









https://docs.kogito.kie.org/latest/html_single/#chap-kogito-creating-running


##### Create Kogito maven app
```
$ mvn io.quarkus:quarkus-maven-plugin:create \
    -DprojectGroupId=fr.cnaf -DprojectArtifactId=hello-world -DprojectVersion=1.0.0-SNAPSHOT \
    -Dextensions=kogito-quarkus
```
one liner:
```
mvn io.quarkus:quarkus-maven-plugin:create -DprojectGroupId=fr.cnaf -DprojectArtifactId=hello-world -DprojectVersion=1.0.0-SNAPSHOT -Dextensions=kogito-quarkus
```



##### Kogito add-ons for messaging support
```
<dependency>
  <groupId>org.kie.kogito</groupId>
  <artifactId>kogito-addons-quarkus-messaging</artifactId>
  <version>1.43</version>
</dependency>
```

##### Quarkus add-ons for providing messaging support
```
<dependency>
   <groupId>io.quarkus</groupId>
   <artifactId>quarkus-smallrye-reactive-messaging-kafka</artifactId>
</dependency>
```




##### Kogito add-ons for messaging from DMN support
```
<dependency>
  <groupId>org.kie.kogito</groupId>
  <artifactId>kogito-addons-quarkus-events-decisions</artifactId>
  <version>1.43</version>
</dependency>
```

##### Kogito add-ons for explainability support
```
<dependency>
  <groupId>org.kie.kogito</groupId>
  <artifactId>kogito-addons-quarkus-explainability</artifactId>
  <version>1.43</version>
</dependency>
```


##### Kogito add-ons for knative messaging support
```
<dependency>
  <groupId>org.kie.kogito</groupId>
  <artifactId>kogito-addons-quarkus-knative-eventing</artifactId>
  <version>1.43</version>
</dependency>

<dependency>
  <groupId>io.quarkus</groupId>
  <artifactId>quarkus-kubernetes</artifactId>
</dependency>
```




##### Kogito add-ons for persistence support
```
<dependency>
  <groupId>org.kie.kogito</groupId>
  <artifactId>kogito-addons-quarkus-persistence-filesystem</artifactId>
  <version>1.43</version>
</dependency>
```


##### Kogito add-ons for task management support (see kogito task console)
```
<dependency>
  <groupId>org.kie.kogito</groupId>
  <artifactId>kogito-addons-quarkus-task-management</artifactId>
  <version>1.43</version>
</dependency>
```



