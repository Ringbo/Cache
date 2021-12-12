diff --git a/python/src/com/jetbrains/python/codeInsight/testIntegration/PyTestFinder.java b/python/src/com/jetbrains/python/codeInsight/testIntegration/PyTestFinder.java
index c39e43b..a14961a 100644
--- a/python/src/com/jetbrains/python/codeInsight/testIntegration/PyTestFinder.java
+++ b/python/src/com/jetbrains/python/codeInsight/testIntegration/PyTestFinder.java
@@ -81,7 +81,7 @@
 
   @Override
   public boolean isTest(@NotNull PsiElement element) {
-    PyClass cl = PsiTreeUtil.getParentOfType(element, PyClass.class);
+    PyClass cl = PsiTreeUtil.getParentOfType(element, PyClass.class, false);
     if (cl != null)
       return PyTestUtil.isPyTestClass(cl);
     return false;
