[![Build Status](https://jenkins.vincinator.de/buildStatus/icon?job=BP-Common)](https://jenkins.vincinator.de/job/BP-Common)

# Anleitung

## Maven

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
import bp.common.model.Obstacle;
```
.. oder über Alt+Enter von Intelij den import hinschreiben lassen ;)
