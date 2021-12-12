diff --git a/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java b/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java
index 53d2496..e8fd830 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java
@@ -278,7 +278,7 @@
                 value = project.getProperties().getProperty( expression );
             }
 
-            if ( value == null )
+            if ( value == null && properties != null )
             {
                 // We will attempt to get nab a system property as a way to specify a
                 // parameter to a plugins. My particular case here is allowing the surefire
