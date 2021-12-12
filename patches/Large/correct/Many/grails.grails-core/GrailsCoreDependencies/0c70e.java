diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
index c31a95b..c39c834 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
@@ -63,7 +63,7 @@
         buildDependencies = Arrays.asList(
             new Dependency("xalan","serializer", "2.7.1", true, "xml-apis:xml-apis"),
             new Dependency("org.grails", "grails-bootstrap", grailsVersion, true ),
-            new Dependency("org.grails", "grails-project-api", grailsVersion, true ),
+            new Dependency("org.grails", "grails-project-api", grailsVersion, true, "org.grails:grails-core"),
             new Dependency("org.grails", "grails-scripts", grailsVersion, true )
         );
 
