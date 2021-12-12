diff --git a/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java b/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
index 256d782..5e422be 100644
--- a/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
+++ b/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
@@ -430,7 +430,7 @@
         final Set<Map.Entry<String, VirtualFileImpl>> entries = new HashSet<Map.Entry<String, VirtualFileImpl>>(myUnaccountedFiles.entrySet());
         for (final Map.Entry<String,VirtualFileImpl> entry : entries) {
           final VirtualFileImpl file = entry.getValue();
-          if (file != null) {
+          if (file != null && file.isValid()) {
             if (!file.getPhysicalFile().exists()) {
               final Runnable action = new Runnable() {
                 public void run() {
