diff --git a/h2o-algos/src/main/java/hex/tree/DRealHistogram.java b/h2o-algos/src/main/java/hex/tree/DRealHistogram.java
index 0833c2d..1fdcf66 100644
--- a/h2o-algos/src/main/java/hex/tree/DRealHistogram.java
+++ b/h2o-algos/src/main/java/hex/tree/DRealHistogram.java
@@ -193,7 +193,7 @@
       }
       bs = new IcedBitSet(max-min+1,min);
       for( int i=0; i<best; i++ ) bs.set(idxs[i]);
-      equal = (byte)(bs.max() <= 32 ? 2 : 3); // Flag for bitset split; also check max size
+      equal = (byte)(bs.max() < 32 ? 2 : 3); // Flag for bitset split; also check max size
     }
 
     if( best==0 ) return null;  // No place to split
