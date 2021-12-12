diff --git a/src/main/java/org/mapdb/StoreWAL.java b/src/main/java/org/mapdb/StoreWAL.java
index fa9069e..8bd7c7e 100644
--- a/src/main/java/org/mapdb/StoreWAL.java
+++ b/src/main/java/org/mapdb/StoreWAL.java
@@ -92,7 +92,7 @@
     }
 
     protected void openLogIfNeeded(){
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         if(log !=null) return;
         log = volFac.createTransLogVolume();
         log.ensureAvailable(16);
@@ -241,7 +241,7 @@
 
 
     protected long[] logAllocate(long[] physPos) {
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         openLogIfNeeded();
         logSize+=1+8+8; //space used for index val
 
@@ -261,7 +261,7 @@
 
     protected void checkLogRounding() {
         if((logSize&Volume.BUF_SIZE_MOD_MASK)+MAX_REC_SIZE*2>Volume.BUF_SIZE){
-            assert(structuralLock.isLocked());
+            assert(structuralLock.isHeldByCurrentThread());
             log.ensureAvailable(logSize+1);
             log.putByte(logSize, WAL_SKIP_REST_OF_BLOCK);
             logSize += Volume.BUF_SIZE - (logSize&Volume.BUF_SIZE_MOD_MASK);
@@ -561,7 +561,7 @@
     }
 
     protected void replayLogFile(){
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
 
         logSize = 0;
 
@@ -648,7 +648,7 @@
         log.close();
         log.deleteFile();
         log = null;
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
     }
 
 
@@ -688,7 +688,7 @@
 
     @Override
     protected long longStackTake(long ioList, boolean recursive) {
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         final int ii = ((int) (ioList / 8));
 
         long dataOffset = indexVals[ii];
@@ -742,7 +742,7 @@
 
     @Override
     protected void longStackPut(long ioList, long offset,boolean recursive) {
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         assert(offset>>>48==0);
         assert(ioList>=IO_FREE_RECID && ioList<=IO_USER_START): "wrong ioList: "+ioList;
 
