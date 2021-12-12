diff --git a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java
index 37dcb0d..a82a890 100644
--- a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java
+++ b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java
@@ -185,7 +185,7 @@
             configuration.put(CommonConfigurationKeys.MODULE_NAME, JvmAbi.DEFAULT_MODULE_NAME);
 
             ScriptingCompilerConfigurationExtensionKt.configureScriptDefinitions(
-                    scriptTemplates, configuration, messageCollector, new HashMap<>()
+                    scriptTemplates, configuration, this.getClass().getClassLoader(), messageCollector, new HashMap<>()
             );
 
             KotlinCoreEnvironment environment = KotlinCoreEnvironment.createForProduction(rootDisposable, configuration, EnvironmentConfigFiles.JVM_CONFIG_FILES);
