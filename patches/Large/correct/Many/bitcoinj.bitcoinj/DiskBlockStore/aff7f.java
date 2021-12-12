diff --git a/src/com/google/bitcoin/core/DiskBlockStore.java b/src/com/google/bitcoin/core/DiskBlockStore.java
index 12c6cb8..6098828 100644
--- a/src/com/google/bitcoin/core/DiskBlockStore.java
+++ b/src/com/google/bitcoin/core/DiskBlockStore.java
@@ -71,7 +71,7 @@
 
     private void load(File file) throws IOException, BlockStoreException {
         LOG("Reading block store from " + file.getAbsolutePath());
-        FileInputStream input = new FileInputStream(file);
+        InputStream input = new BufferedInputStream(new FileInputStream(file));
         // Read a version byte.
         int version = input.read();
         if (version == -1) {
