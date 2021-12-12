diff --git a/hbase-client/src/main/java/org/apache/hadoop/hbase/filter/ColumnPaginationFilter.java b/hbase-client/src/main/java/org/apache/hadoop/hbase/filter/ColumnPaginationFilter.java
index 696f868..2ce9746 100644
--- a/hbase-client/src/main/java/org/apache/hadoop/hbase/filter/ColumnPaginationFilter.java
+++ b/hbase-client/src/main/java/org/apache/hadoop/hbase/filter/ColumnPaginationFilter.java
@@ -207,7 +207,7 @@
 
     ColumnPaginationFilter other = (ColumnPaginationFilter)o;
     if (this.columnOffset != null) {
-      return this.getLimit() == this.getLimit() &&
+      return this.getLimit() == other.getLimit() &&
           Bytes.equals(this.getColumnOffset(), other.getColumnOffset());
     }
     return this.getLimit() == other.getLimit() && this.getOffset() == other.getOffset();
