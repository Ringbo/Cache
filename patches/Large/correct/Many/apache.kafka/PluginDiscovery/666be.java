diff --git a/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/PluginDiscovery.java b/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/PluginDiscovery.java
index be55daf..d31ce6d 100644
--- a/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/PluginDiscovery.java
+++ b/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/PluginDiscovery.java
@@ -106,7 +106,7 @@
         Collections.sort(transformationPlugins, new Comparator<Class<? extends Transformation>>() {
             @Override
             public int compare(Class<? extends Transformation> a, Class<? extends Transformation> b) {
-                return a.getCanonicalName().compareTo(b.getCanonicalName());
+                return a.getName().compareTo(b.getName());
             }
         });
 
