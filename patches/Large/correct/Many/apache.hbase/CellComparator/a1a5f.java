diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java
index 2e02ad2..4978387 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java
@@ -86,7 +86,7 @@
     if (c != 0) return c;
 
     //type
-    c = (0xff & a.getTypeByte()) - (0xff & b.getTypeByte());
+    c = (0xff & b.getTypeByte()) - (0xff & a.getTypeByte());
     if (c != 0) return c;
 
     //mvccVersion: later sorts first
