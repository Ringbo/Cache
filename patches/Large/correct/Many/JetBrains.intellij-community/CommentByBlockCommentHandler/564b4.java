diff --git a/lang-impl/src/com/intellij/codeInsight/generation/CommentByBlockCommentHandler.java b/lang-impl/src/com/intellij/codeInsight/generation/CommentByBlockCommentHandler.java
index 31d8fb8..bfe96c9 100644
--- a/lang-impl/src/com/intellij/codeInsight/generation/CommentByBlockCommentHandler.java
+++ b/lang-impl/src/com/intellij/codeInsight/generation/CommentByBlockCommentHandler.java
@@ -241,7 +241,7 @@
         --i;
       }
       else {
-        myDocument.insertString(suffixIndex + commentSuffix.length(), commentPrefix);
+        myDocument.insertString(suffixIndex + normalizedSuffix.length(), commentPrefix);
         --j;
       }
     }
