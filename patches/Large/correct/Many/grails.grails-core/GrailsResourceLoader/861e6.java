diff --git a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceLoader.java b/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceLoader.java
index 4ab8f01..134b25a 100644
--- a/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceLoader.java
+++ b/src/commons/org/codehaus/groovy/grails/commons/GrailsResourceLoader.java
@@ -49,7 +49,7 @@
         String groovyFile = resource.replace('.', '/') + ".groovy";
         Resource foundResource = null;
         for (int i = 0; resources != null && i < resources.length; i++) {
-            if (resources[i].getFilename().endsWith(groovyFile)) {
+            if (resources[i].getFilename().equals(groovyFile)) {
                 if (foundResource == null) {
                     foundResource = resources[i];
                 } else {
