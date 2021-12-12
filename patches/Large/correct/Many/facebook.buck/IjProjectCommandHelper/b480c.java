diff --git a/src/com/facebook/buck/ide/intellij/IjProjectCommandHelper.java b/src/com/facebook/buck/ide/intellij/IjProjectCommandHelper.java
index 244767b..b9a7c41 100644
--- a/src/com/facebook/buck/ide/intellij/IjProjectCommandHelper.java
+++ b/src/com/facebook/buck/ide/intellij/IjProjectCommandHelper.java
@@ -335,7 +335,7 @@
     ProjectTestsMode parameterMode = ProjectTestsMode.WITH_TESTS;
 
     // TODO(shemitz) Just refactoring the existing incoherence ... really need to clean this up
-    if (!projectGeneratorParameters.isWithoutTests()) {
+    if (projectGeneratorParameters.isWithoutTests()) {
       parameterMode = ProjectTestsMode.WITHOUT_TESTS;
     } else if (projectGeneratorParameters.isWithoutDependenciesTests()) {
       parameterMode = ProjectTestsMode.WITHOUT_DEPENDENCIES_TESTS;
