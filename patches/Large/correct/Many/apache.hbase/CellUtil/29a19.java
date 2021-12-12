diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java
index 7242791..85b3913 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellUtil.java
@@ -460,7 +460,7 @@
 
   public static boolean matchingRow(final Cell left, final byte[] buf) {
     if (buf == null) {
-      return left.getQualifierLength() == 0;
+      return left.getRowLength() == 0;
     }
     return matchingRow(left, buf, 0, buf.length);
   }
