diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/editable/EditablePostfixTemplate.java b/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/editable/EditablePostfixTemplate.java
index 9f2cf3d..7cb87a6 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/editable/EditablePostfixTemplate.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/templates/editable/EditablePostfixTemplate.java
@@ -70,7 +70,7 @@
     }
 
     if (ApplicationManager.getApplication().isUnitTestMode()) {
-      PsiElement item = ContainerUtil.getLastItem(expressions);
+      PsiElement item = ContainerUtil.getFirstItem(expressions);
       assert item != null;
       prepareAndExpandForChooseExpression(item, editor);
       return;
