diff --git a/h2/src/main/org/h2/table/RegularTable.java b/h2/src/main/org/h2/table/RegularTable.java
index 3a1d0fc..b73d13e 100644
--- a/h2/src/main/org/h2/table/RegularTable.java
+++ b/h2/src/main/org/h2/table/RegularTable.java
@@ -231,7 +231,7 @@
             } else if (!indexType.isSpatial()) {
                 index = new PageBtreeIndex(this, indexId, indexName, cols, indexType, create, session);
             } else {
-                throw new UnsupportedOperationException();
+                throw new UnsupportedOperationException("Spatial index only supported with the MVStore");
             }
         } else {
             if (indexType.isHash() && cols.length <= 1) {
