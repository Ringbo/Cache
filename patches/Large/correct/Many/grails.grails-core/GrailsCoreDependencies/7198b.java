diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
index c70e992..a417e67 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
@@ -106,7 +106,7 @@
 
         if (java5compatible) {
             compileDependencies = new ArrayList<Dependency>(compileDependencies);
-            runtimeDependencies.add(new Dependency("javax.xml", "jaxb-api", jaxbVersion, true) );
+            compileDependencies.add(new Dependency("javax.xml", "jaxb-api", jaxbVersion, true) );
         }
     }
 
