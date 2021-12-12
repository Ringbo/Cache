diff --git a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/actions/AddNoInspectionJavaCommentFix.java b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/actions/AddNoInspectionJavaCommentFix.java
index 3a7207e..ab0b009 100644
--- a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/actions/AddNoInspectionJavaCommentFix.java
+++ b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/actions/AddNoInspectionJavaCommentFix.java
@@ -21,7 +21,7 @@
   @Nullable
   protected PsiElement getContainer(PsiElement context) {
     if (context == null || PsiTreeUtil.getParentOfType(context, JspMethodCall.class) != null) return null;
-    return PsiTreeUtil.getParentOfType(context, PsiStatement.class);
+    return PsiTreeUtil.getParentOfType(context, PsiStatement.class, false);
   }
 
   @Override
