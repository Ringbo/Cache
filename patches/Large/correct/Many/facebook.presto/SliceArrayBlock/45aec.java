diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java
index 3d2d6de..d2981eb 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java
@@ -131,7 +131,7 @@
             Slice distinct = distinctValues.get(slice);
             if (distinct == null) {
                 distinct = Slices.copyOf(slice);
-                distinctValues.put(distinct, distinct);
+                distinctValues.put(slice, distinct);
             }
             newValues[i] = distinct;
         }
