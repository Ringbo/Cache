diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/plugins/BinaryGrailsPlugin.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/plugins/BinaryGrailsPlugin.java
index b0fb58d..eed915b 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/plugins/BinaryGrailsPlugin.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/plugins/BinaryGrailsPlugin.java
@@ -114,9 +114,9 @@
         List<Class> artefacts = new ArrayList<Class>();
         if (descriptor != null) {
             GPathResult resources = (GPathResult) descriptor.getProperty("resources");
-            if (resources.isEmpty()) {
+            if (!resources.isEmpty()) {
                 GPathResult allResources = (GPathResult) resources.getProperty("resource");
-                if (allResources.isEmpty()) {
+                if (!allResources.isEmpty()) {
                     final ClassLoader classLoader = application.getClassLoader();
                     for (Iterator i = allResources.nodeIterator(); i.hasNext(); ) {
                         final String className = ((Node)i.next()).text();
