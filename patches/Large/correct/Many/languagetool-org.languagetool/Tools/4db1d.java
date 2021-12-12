diff --git a/languagetool-gui-commons/src/main/java/org/languagetool/gui/Tools.java b/languagetool-gui-commons/src/main/java/org/languagetool/gui/Tools.java
index d88566d..8a8401c 100644
--- a/languagetool-gui-commons/src/main/java/org/languagetool/gui/Tools.java
+++ b/languagetool-gui-commons/src/main/java/org/languagetool/gui/Tools.java
@@ -140,12 +140,12 @@
       while (shortComment.lastIndexOf(" [") > 0
               && shortComment.lastIndexOf(']') > shortComment.lastIndexOf(" [")
               && shortComment.length() > maxCommentLength) {
-        shortComment = shortComment.substring(0, shortComment.lastIndexOf(" [")) + shortComment.substring(comment.lastIndexOf(']')+1);
+        shortComment = shortComment.substring(0, shortComment.lastIndexOf(" [")) + shortComment.substring(shortComment.lastIndexOf(']')+1);
       }
       while (shortComment.lastIndexOf(" (") > 0
               && shortComment.lastIndexOf(')') > shortComment.lastIndexOf(" (")
               && shortComment.length() > maxCommentLength) {
-        shortComment = shortComment.substring(0, shortComment.lastIndexOf(" (")) + shortComment.substring(comment.lastIndexOf(')')+1);
+        shortComment = shortComment.substring(0, shortComment.lastIndexOf(" (")) + shortComment.substring(shortComment.lastIndexOf(')')+1);
       }
       // in case it's still not short enough, shorten at the end
       if (shortComment.length() > maxCommentLength) {
