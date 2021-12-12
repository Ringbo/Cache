diff --git a/java/java-psi-api/src/com/intellij/codeInsight/TestFrameworks.java b/java/java-psi-api/src/com/intellij/codeInsight/TestFrameworks.java
index 33ee86b..0e948ca 100644
--- a/java/java-psi-api/src/com/intellij/codeInsight/TestFrameworks.java
+++ b/java/java-psi-api/src/com/intellij/codeInsight/TestFrameworks.java
@@ -40,6 +40,6 @@
   public abstract PsiMethod findTearDownMethod(PsiClass psiClass);
   
   public boolean isTestOrConfig(PsiClass psiClass) {
-    return isTestClass(psiClass) || findTearDownMethod(psiClass) != null || findTearDownMethod(psiClass) != null;
+    return isTestClass(psiClass) || findTearDownMethod(psiClass) != null || findSetUpMethod(psiClass) != null;
   } 
 }
