diff --git a/src/org/wordpress/android/ui/reader/adapters/ReaderCommentAdapter.java b/src/org/wordpress/android/ui/reader/adapters/ReaderCommentAdapter.java
index ec09762..63a4606 100644
--- a/src/org/wordpress/android/ui/reader/adapters/ReaderCommentAdapter.java
+++ b/src/org/wordpress/android/ui/reader/adapters/ReaderCommentAdapter.java
@@ -216,7 +216,7 @@
             return;
 
         // skip performance hit of html conversion if content doesn't contain html
-        if (!content.contains("<") && content.contains("&")) {
+        if (!content.contains("<") && !content.contains("&")) {
             textView.setText(content.trim());
             return;
         }
