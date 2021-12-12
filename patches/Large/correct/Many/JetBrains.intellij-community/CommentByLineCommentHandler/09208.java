diff --git a/platform/lang-impl/src/com/intellij/codeInsight/generation/CommentByLineCommentHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/generation/CommentByLineCommentHandler.java
index 012b2e4..71b1d89 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/generation/CommentByLineCommentHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/generation/CommentByLineCommentHandler.java
@@ -224,7 +224,7 @@
     }
 
     boolean allLineCommented = true;
-    boolean commentWithIndent = CodeStyleSettingsManager.getSettings(myProject).LINE_COMMENT_AT_FIRST_COLUMN;
+    boolean commentWithIndent = !CodeStyleSettingsManager.getSettings(myProject).LINE_COMMENT_AT_FIRST_COLUMN;
 
     for (int line = myStartLine; line <= myEndLine; line++) {
       Commenter commenter = blockSuitableCommenter != null ? blockSuitableCommenter : findCommenter(line);
