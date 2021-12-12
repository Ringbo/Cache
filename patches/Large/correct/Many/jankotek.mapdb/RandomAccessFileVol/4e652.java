diff --git a/src/main/java/org/mapdb/volume/RandomAccessFileVol.java b/src/main/java/org/mapdb/volume/RandomAccessFileVol.java
index c3ee25e..4af446d 100644
--- a/src/main/java/org/mapdb/volume/RandomAccessFileVol.java
+++ b/src/main/java/org/mapdb/volume/RandomAccessFileVol.java
@@ -343,7 +343,7 @@
     }
 
     @Override
-    public int putPackedLong(long pos, long value) {
+    public synchronized int putPackedLong(long pos, long value) {
         try {
             raf.seek(pos);
 
@@ -367,7 +367,7 @@
 
 
     @Override
-    public long getPackedLong(long pos) {
+    public synchronized long getPackedLong(long pos) {
         try {
             raf.seek(pos);
 
