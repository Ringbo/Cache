diff --git a/h2/src/main/org/h2/store/FileStore.java b/h2/src/main/org/h2/store/FileStore.java
index 1e66d11..74e7af8 100644
--- a/h2/src/main/org/h2/store/FileStore.java
+++ b/h2/src/main/org/h2/store/FileStore.java
@@ -135,7 +135,7 @@
      * @return the random salt or the magic
      */
     protected byte[] generateSalt() {
-        return HEADER.getBytes();
+        return HEADER.getBytes(Constants.UTF8);
     }
 
     /**
@@ -170,7 +170,7 @@
     public void init() {
         int len = Constants.FILE_BLOCK_SIZE;
         byte[] salt;
-        byte[] magic = HEADER.getBytes();
+        byte[] magic = HEADER.getBytes(Constants.UTF8);
         if (length() < HEADER_LENGTH) {
             // write unencrypted
             checkedWriting = false;
