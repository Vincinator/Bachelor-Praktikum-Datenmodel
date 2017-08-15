[![Build Status](https://jenkins.vincinator.de/buildStatus/icon?job=BP-Common)](https://jenkins.vincinator.de/job/BP-Common)

# Einleitung

Da das Datenmodell Abhängigkeiten zum Server und zur Android Anwendung hat, 
ist das Datenmodell in dieses Projekt ausgelagert.

Über Jitpack wird die Abhängigkeit in dem jeweiligem Projekt aufgelöst, siehe Anleitung weiter unten.


Das Model ist so konfiguriert, dass in Hibernate eine einzige Tabelle für die komplette Vererbungshierarchie verwendet wird.

Desweiterne enthält das Projekt die notwendigen Annotationen um diese über Jackson zu serialisieren, bzw. zu deserialisieren. 





# Anleitung

## Import
### Maven

In der pom.xml jitpack als Repository hinzufügen

```xml
 <repositories>
        ...
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Ebenfalls in der pom.xml die Dependency zu diesem GitHub Projekt hinzufügen

```xml
<dependencies>
  <dependency>
      <groupId>com.github.Vincinator</groupId>
      <artifactId>BP-Common</artifactId>
      <version>master-SNAPSHOT</version>
      <scope>compile</scope>
  </dependency>
  ...
</dependencies>
```


```java
import bp.common.model.obstacles.Obstacle;
```
.. oder über Alt+Enter von Intelij den import hinschreiben lassen ;)

### Gradle


In der build.gradle jitpack hinzufügen

```gradle
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

... und in der build.gradle der app 

```gradle
dependencies {
    ...
    compile 'com.github.Vincinator:BP-Common:master-SNAPSHOT'
}
```



## Serialize / Deserialize

### Serialize

```
    ObjectMapper mapper = new ObjectMapper();
    String jsonString = "";
    try {
        jsonString = mapper.writeValueAsString(obstacle);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
```

### Deserialize
```
ObjectMapper mapper = new ObjectMapper();
mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
List<Obstacle> obstacleList = new LinkedList<Obstacle>();
if (!response.isSuccessful())
    return;
try {
    obstacleList = mapper.readValue(res, new TypeReference<List<Obstacle>>() {
    });
} catch (Exception e) {
    e.printStackTrace();
}
```