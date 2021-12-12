diff --git a/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaBasePlugin.java b/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaBasePlugin.java
index 429ba57..7ba5915 100644
--- a/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaBasePlugin.java
+++ b/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaBasePlugin.java
@@ -241,7 +241,7 @@
         Configuration runtimeConfiguration = configurations.maybeCreate(sourceSet.getRuntimeConfigurationName());
         runtimeConfiguration.setVisible(false);
         runtimeConfiguration.extendsFrom(compileConfiguration);
-        runtimeConfiguration.setDescription("Runtime dependencies for " + sourceSet + " (deprecated, use '" + sourceSet.getRuntimeClasspathConfigurationName() + " ' instead).");
+        runtimeConfiguration.setDescription("Runtime dependencies for " + sourceSet + " (deprecated, use '" + sourceSet.getRuntimeOnlyConfigurationName() + " ' instead).");
 
         Configuration compileOnlyConfiguration = configurations.maybeCreate(sourceSet.getCompileOnlyConfigurationName());
         compileOnlyConfiguration.setVisible(false);
