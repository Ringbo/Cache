diff --git a/python/src/com/jetbrains/python/sdk/PythonSdkType.java b/python/src/com/jetbrains/python/sdk/PythonSdkType.java
index c790432..bd07967 100644
--- a/python/src/com/jetbrains/python/sdk/PythonSdkType.java
+++ b/python/src/com/jetbrains/python/sdk/PythonSdkType.java
@@ -882,7 +882,7 @@
 
           @Override
           protected void processLanguageContribution(PyCredentialsContribution languageContribution, Object credentials) {
-            result.set(languageContribution.isValid(credentials));
+            result.set(!languageContribution.isValid(credentials));
           }
         }.collectCases(
           PyCredentialsContribution.class,
