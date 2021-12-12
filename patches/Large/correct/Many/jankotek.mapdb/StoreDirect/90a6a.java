diff --git a/src/main/java/org/mapdb/StoreDirect.java b/src/main/java/org/mapdb/StoreDirect.java
index eb880f7..7050920 100644
--- a/src/main/java/org/mapdb/StoreDirect.java
+++ b/src/main/java/org/mapdb/StoreDirect.java
@@ -815,7 +815,7 @@
 
 
     protected long longStackTake(final long ioList, boolean recursive) {
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         assert(ioList>=IO_FREE_RECID && ioList<IO_USER_START) :"wrong ioList: "+ioList;
 
         long dataOffset = index.getLong(ioList);
@@ -865,7 +865,7 @@
 
 
     protected void longStackPut(final long ioList, long offset, boolean recursive){
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         assert(offset>>>48==0);
         assert(ioList>=IO_FREE_RECID && ioList<=IO_USER_START): "wrong ioList: "+ioList;
 
@@ -951,7 +951,7 @@
     }
 
     protected long freePhysTake(int size, boolean ensureAvail, boolean recursive) {
-        assert(structuralLock.isLocked());
+        assert(structuralLock.isHeldByCurrentThread());
         assert(size>0);
         //check free space
         if(spaceReclaimReuse){
