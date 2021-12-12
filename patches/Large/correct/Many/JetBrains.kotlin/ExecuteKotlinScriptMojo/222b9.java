diff --git a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java
index 1abeafc..6c17b06 100644
--- a/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java
+++ b/libraries/tools/kotlin-maven-plugin/src/main/java/org/jetbrains/kotlin/maven/ExecuteKotlinScriptMojo.java
@@ -180,7 +180,7 @@
 
             KotlinCoreEnvironment environment = KotlinCoreEnvironment.createForProduction(rootDisposable, configuration, EnvironmentConfigFiles.JVM_CONFIG_FILES);
 
-            GenerationState state = KotlinToJVMBytecodeCompiler.INSTANCE.analyzeAndGenerate(environment, configuration);
+            GenerationState state = KotlinToJVMBytecodeCompiler.INSTANCE.analyzeAndGenerate(environment);
 
             if (state == null) {
                 throw new ScriptExecutionException(scriptFile, "compile error");
