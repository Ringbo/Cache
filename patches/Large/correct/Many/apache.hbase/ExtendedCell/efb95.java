diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/ExtendedCell.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/ExtendedCell.java
index 7ed4dc0..4d16fca 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/ExtendedCell.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/ExtendedCell.java
@@ -73,7 +73,7 @@
    * Does a deep copy of the contents to a new memory area and returns it as a new cell.
    * @return The deep cloned cell
    */
-  Cell deepClone();
+  ExtendedCell deepClone();
 
   /**
    * Extracts the id of the backing bytebuffer of this cell if it was obtained from fixed sized
