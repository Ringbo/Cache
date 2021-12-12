diff --git a/src/test/java/org/mapdb/VolumeTest.java b/src/test/java/org/mapdb/VolumeTest.java
index 6c19da3..68d85b7 100644
--- a/src/test/java/org/mapdb/VolumeTest.java
+++ b/src/test/java/org/mapdb/VolumeTest.java
@@ -24,12 +24,12 @@
 
         @Test public void transfer(){
             long max = (long) (Volume.BUF_SIZE*1.5);
-            Volume from = new Volume.MemoryVol(false,0);
+            Volume from = new Volume.MemoryVol(true,0);
             for(long i=0;i<max;i+=8){
                 from.ensureAvailable(i+8);
                 from.putLong(i,i);
             }
-            Volume to = new Volume.MemoryVol(false,0);
+            Volume to = new Volume.MemoryVol(true,0);
             Volume.volumeTransfer(max,from,to);
             for(long i=0;i<max;i+=8){
                 assertEquals(i, to.getLong(i));
