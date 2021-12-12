diff --git a/src/java/org/apache/hadoop/io/SetFile.java b/src/java/org/apache/hadoop/io/SetFile.java
index c7a0446..e4d261a 100644
--- a/src/java/org/apache/hadoop/io/SetFile.java
+++ b/src/java/org/apache/hadoop/io/SetFile.java
@@ -59,7 +59,7 @@
                   SequenceFile.CompressionType compress) throws IOException {
       super(conf, new Path(dirName), 
             comparator(comparator), 
-            keyClass(NullWritable.class), 
+            valueClass(NullWritable.class), 
             compressionType(compress));
     }
 
