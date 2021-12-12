diff --git a/plugins/git4idea/src/git4idea/vfs/GitFileTypeFactory.java b/plugins/git4idea/src/git4idea/vfs/GitFileTypeFactory.java
index 83b5ea0..e961cfd 100644
--- a/plugins/git4idea/src/git4idea/vfs/GitFileTypeFactory.java
+++ b/plugins/git4idea/src/git4idea/vfs/GitFileTypeFactory.java
@@ -30,6 +30,6 @@
    * {@inheritDoc}
    */
   public void createFileTypes(@NotNull FileTypeConsumer consumer) {
-    consumer.consume(new PlainTextFileType(), new ExactFileNameMatcher(".gitignore"));
+    consumer.consume(new PlainTextFileType(), new ExactFileNameMatcher(".gitignore"), new ExactFileNameMatcher(".gitmodules"));
   }
 }
