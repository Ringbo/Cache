diff --git a/codeInsight/impl/com/intellij/codeInsight/javadoc/JavaDocUtil.java b/codeInsight/impl/com/intellij/codeInsight/javadoc/JavaDocUtil.java
index 54a63c3..f42697c 100644
--- a/codeInsight/impl/com/intellij/codeInsight/javadoc/JavaDocUtil.java
+++ b/codeInsight/impl/com/intellij/codeInsight/javadoc/JavaDocUtil.java
@@ -268,7 +268,7 @@
     PsiClass containingClass = aClass.getContainingClass();
     while (containingClass != null) {
       shortName = containingClass.getName() + "." + shortName;
-      containingClass = aClass.getContainingClass();
+      containingClass = containingClass.getContainingClass();
     }
     LOG.assertTrue(shortName != null);
 
