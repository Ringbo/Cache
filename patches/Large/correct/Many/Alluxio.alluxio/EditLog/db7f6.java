diff --git a/src/main/java/tachyon/EditLog.java b/src/main/java/tachyon/EditLog.java
index 24eca53..5d924bf 100644
--- a/src/main/java/tachyon/EditLog.java
+++ b/src/main/java/tachyon/EditLog.java
@@ -130,7 +130,7 @@
     }
   }
 
-  public void addBlock(int fileId, int blockIndex, long blockLength) {
+  public synchronized void addBlock(int fileId, int blockIndex, long blockLength) {
     if (INACTIVE) {
       return;
     }
@@ -145,7 +145,7 @@
     }
   }
 
-  public void createFile(boolean recursive, String path, boolean directory, int columns,
+  public synchronized void createFile(boolean recursive, String path, boolean directory, int columns,
       ByteBuffer metadata, long blockSizeByte, long creationTimeMs) {
     if (INACTIVE) {
       return;
@@ -165,7 +165,7 @@
     }
   }
 
-  public void delete(int fileId, boolean recursive) {
+  public synchronized void delete(int fileId, boolean recursive) {
     if (INACTIVE) {
       return;
     }
@@ -179,7 +179,7 @@
     }
   }
 
-  public void rename(int fileId, String dstPath) {
+  public synchronized void rename(int fileId, String dstPath) {
     if (INACTIVE) {
       return;
     }
@@ -193,7 +193,7 @@
     }
   }
 
-  public void unpinFile(int fileId) {
+  public synchronized void unpinFile(int fileId) {
     if (INACTIVE) {
       return;
     }
@@ -206,7 +206,7 @@
     }
   }
 
-  public void updateRawTableMetadata(int tableId, ByteBuffer metadata) {
+  public synchronized void updateRawTableMetadata(int tableId, ByteBuffer metadata) {
     if (INACTIVE) {
       return;
     }
@@ -220,7 +220,7 @@
     }
   }
 
-  public void completeFile(int fileId) {
+  public synchronized void completeFile(int fileId) {
     if (INACTIVE) {
       return;
     }
