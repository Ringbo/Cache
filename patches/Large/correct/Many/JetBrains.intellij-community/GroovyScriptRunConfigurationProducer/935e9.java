diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/runner/GroovyScriptRunConfigurationProducer.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/runner/GroovyScriptRunConfigurationProducer.java
index 133d687..67c81ff 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/runner/GroovyScriptRunConfigurationProducer.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/runner/GroovyScriptRunConfigurationProducer.java
@@ -56,7 +56,7 @@
 
     GroovyFile groovyFile = (GroovyFile)file;
     final PsiClass aClass = GroovyRunnerUtil.getRunningClass(location.getPsiElement());
-    if (aClass != null) {
+    if (aClass != null && GroovyRunnerUtil.canBeRunByGroovy(aClass)) {
       final RunnerAndConfigurationSettings settings = createConfiguration(aClass);
       if (settings != null) {
         mySourceElement = element;
