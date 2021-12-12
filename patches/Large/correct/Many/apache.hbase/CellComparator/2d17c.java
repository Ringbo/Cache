diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java
index 4978387..05c19de 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/CellComparator.java
@@ -201,7 +201,7 @@
     if (c != 0) return c;
 
     //type
-    c = (0xff & a.getTypeByte()) - (0xff & b.getTypeByte());
+    c = (0xff & b.getTypeByte()) - (0xff & a.getTypeByte());
     return c;
   }
 
