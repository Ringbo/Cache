diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/util/MultiThreadedReader.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/util/MultiThreadedReader.java
index e6d4807..df0d3f8 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/util/MultiThreadedReader.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/util/MultiThreadedReader.java
@@ -206,7 +206,7 @@
           numKeys++;
         } while (numKeys < batchSize);
 
-        if (numKeys > 1) { //meaning there is some key to read
+        if (numKeys > 0) { //meaning there is some key to read
           readKey(keysForThisReader);
           // We have verified some unique key(s).
           numUniqueKeysVerified.getAndAdd(readingRandomKeyStartIndex == -1 ?
