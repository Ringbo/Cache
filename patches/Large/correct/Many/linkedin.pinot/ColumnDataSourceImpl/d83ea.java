diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/data/source/ColumnDataSourceImpl.java b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/data/source/ColumnDataSourceImpl.java
index 2cee869..cafe4c3 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/data/source/ColumnDataSourceImpl.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/data/source/ColumnDataSourceImpl.java
@@ -207,7 +207,7 @@
 
         final MutableRoaringBitmap rangeBitmapHolder = invertedIndex.getMutable(rangeStartIndex);
         for (int i = (rangeStartIndex + 1); i <= rangeEndIndex; i++) {
-          rangeBitmapHolder.or(invertedIndex.getImmutable(i));
+          rangeBitmapHolder.or(invertedIndex.getMutable(i));
         }
         filteredBitmap = rangeBitmapHolder;
         break;
