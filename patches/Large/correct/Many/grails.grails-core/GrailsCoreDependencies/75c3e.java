diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
index 55b8497..155a44a 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/resolve/GrailsCoreDependencies.java
@@ -67,8 +67,7 @@
         );
 
         docDependencies = Arrays.asList(
-            new Dependency("org.grails", "grails-docs", grailsVersion, true),
-            new Dependency("com.lowagie","itext", "2.0.8", true)
+            new Dependency("org.grails", "grails-docs", grailsVersion, true)
         );
 
         providedDependencies = Arrays.asList(
