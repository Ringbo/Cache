diff --git a/src/main/java/org/mapdb/WriteAheadLog.java b/src/main/java/org/mapdb/WriteAheadLog.java
index 8433d3a..afc4f0f 100644
--- a/src/main/java/org/mapdb/WriteAheadLog.java
+++ b/src/main/java/org/mapdb/WriteAheadLog.java
@@ -830,10 +830,7 @@
     }
 
     //TODO return DataInput
-    public byte[] walGetRecord(long walPointer, long expectedRecid) {
-
-
-
+    synchronized public byte[] walGetRecord(long walPointer, long expectedRecid) {
         long fileNum = walPointerToFileNum(walPointer);
         long dataOffset = (walPointerToOffset(walPointer));
 
@@ -925,7 +922,8 @@
         return val;
     }
 
-    public long walPutRecord(long recid, byte[] buf, int bufPos, int size){
+    //TODO walPutRecord and walGetRecord are both synchronized, that is just broken
+    synchronized public long walPutRecord(long recid, byte[] buf, int bufPos, int size){
         if(CC.ASSERT && buf==null && size!=0)
             throw new AssertionError();
         ensureFileReady(true);
