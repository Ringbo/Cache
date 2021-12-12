diff --git a/platform/lang-api/src/com/intellij/codeInsight/completion/util/ParenthesesInsertHandler.java b/platform/lang-api/src/com/intellij/codeInsight/completion/util/ParenthesesInsertHandler.java
index 7f781ba..b5e6ff9 100644
--- a/platform/lang-api/src/com/intellij/codeInsight/completion/util/ParenthesesInsertHandler.java
+++ b/platform/lang-api/src/com/intellij/codeInsight/completion/util/ParenthesesInsertHandler.java
@@ -159,7 +159,7 @@
     if (!putCaretInside) {
       editor.getCaretModel().moveToOffset(context.getTailOffset());
     }
-    else if (!mySpaceBeforeParentheses) {
+    else if (!mySpaceBetweenParentheses) {
       TabOutScopesTracker.getInstance().registerEmptyScopeAtCaret(editor);
     }
   }
