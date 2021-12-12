diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/PostfixTemplateWithExpressionSelector.java b/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/PostfixTemplateWithExpressionSelector.java
index daafa33..2427cb9 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/PostfixTemplateWithExpressionSelector.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/PostfixTemplateWithExpressionSelector.java
@@ -79,7 +79,7 @@
     }
 
     if (ApplicationManager.getApplication().isUnitTestMode()) {
-      PsiElement item = ContainerUtil.getLastItem(expressions);
+      PsiElement item = ContainerUtil.getFirstItem(expressions);
       assert item != null;
       prepareAndExpandForChooseExpression(item, editor);
       return;
