diff --git a/idea/src/org/jetbrains/jet/plugin/completion/JetKeywordCompletionContributor.java b/idea/src/org/jetbrains/jet/plugin/completion/JetKeywordCompletionContributor.java
index 0fbf10a..af001ad 100644
--- a/idea/src/org/jetbrains/jet/plugin/completion/JetKeywordCompletionContributor.java
+++ b/idea/src/org/jetbrains/jet/plugin/completion/JetKeywordCompletionContributor.java
@@ -118,7 +118,8 @@
         @Override
         public boolean isAcceptable(Object element, PsiElement context) {
             //noinspection unchecked
-            return PsiTreeUtil.getParentOfType(context, JetClassBody.class, true, JetBlockExpression.class) != null;
+            return PsiTreeUtil.getParentOfType(context, JetClassBody.class, true,
+                                               JetBlockExpression.class, JetProperty.class) != null;
         }
 
         @Override
