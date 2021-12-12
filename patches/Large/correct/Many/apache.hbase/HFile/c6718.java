diff --git a/src/java/org/apache/hadoop/hbase/io/hfile/HFile.java b/src/java/org/apache/hadoop/hbase/io/hfile/HFile.java
index 3bf079a..5c96420 100644
--- a/src/java/org/apache/hadoop/hbase/io/hfile/HFile.java
+++ b/src/java/org/apache/hadoop/hbase/io/hfile/HFile.java
@@ -1167,7 +1167,9 @@
           return false; // key is before the start of the file.
 
         // Question: does this block begin with 'key'?
-        if (this.reader.comparator.compare(reader.blockIndex.blockKeys[b], key) == 0) {
+        if (this.reader.comparator.compare(reader.blockIndex.blockKeys[b],
+            0, reader.blockIndex.blockKeys[b].length,
+            key, offset, length) == 0) {
           // Ok the key we're interested in is the first of the block, so go back one.
           if (b == 0) {
             // we have a 'problem', the key we want is the first of the file.
