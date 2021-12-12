diff --git a/h2o-algos/src/main/java/hex/tree/DRealHistogram.java b/h2o-algos/src/main/java/hex/tree/DRealHistogram.java
index 46a768a..b24c8fd 100644
--- a/h2o-algos/src/main/java/hex/tree/DRealHistogram.java
+++ b/h2o-algos/src/main/java/hex/tree/DRealHistogram.java
@@ -198,7 +198,7 @@
       }
       bs = new IcedBitSet(max-min+1,min);
       for( int i=best; i<nbins; i++ ) bs.set(idxs[i]);
-      equal = (byte)(bs.max() < 32 ? 2 : 3); // Flag for bitset split; also check max size
+      equal = (byte)(bs.max() <= 32 ? 2 : 3); // Flag for bitset split; also check max size
     }
 
     if( best==0 ) return null;  // No place to split
