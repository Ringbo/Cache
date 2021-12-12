diff --git a/python/src/com/jetbrains/python/testing/PythonTestConfigurationProducer.java b/python/src/com/jetbrains/python/testing/PythonTestConfigurationProducer.java
index 5214045..c1dd4dc 100644
--- a/python/src/com/jetbrains/python/testing/PythonTestConfigurationProducer.java
+++ b/python/src/com/jetbrains/python/testing/PythonTestConfigurationProducer.java
@@ -50,7 +50,7 @@
     settings = createConfigurationFromFolder(location);
     if (settings != null) return settings;
 
-    final PyElement pyElement = PsiTreeUtil.getParentOfType(location.getPsiElement(), PyElement.class);
+    final PyElement pyElement = PsiTreeUtil.getParentOfType(location.getPsiElement(), PyElement.class, false);
     if (pyElement != null) {
       settings = createConfigurationFromFunction(location, pyElement);
       if (settings != null) return settings;
