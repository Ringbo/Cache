diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/CommentSuppressor.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/CommentSuppressor.java
index bf8613c..d281836 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/CommentSuppressor.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/regexp/CommentSuppressor.java
@@ -36,7 +36,7 @@
      * @param currentContents
      *            content of checked file.
      **/
-    public CommentSuppressor(FileContents currentContents) {
+    CommentSuppressor(FileContents currentContents) {
         this.currentContents = currentContents;
     }
 
