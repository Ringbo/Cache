diff --git a/h2o-core/src/main/java/hex/quantile/Quantile.java b/h2o-core/src/main/java/hex/quantile/Quantile.java
index cb3eff7..7649ab5 100644
--- a/h2o-core/src/main/java/hex/quantile/Quantile.java
+++ b/h2o-core/src/main/java/hex/quantile/Quantile.java
@@ -303,7 +303,7 @@
     // Unequal, linear interpolation
     double plo = (double)(row+0)/(nrows-1); // Note that row numbers are inclusive on the end point, means we need a -1
     double phi = (double)(row+1)/(nrows-1); // Passed in the row number for the low value, high is the next row, so +1
-    assert plo <= prob && prob < phi;
+    assert plo <= prob && prob <= phi;
     return lo + (hi-lo)*(prob-plo)/(phi-plo); // Classic linear interpolation
   }
 }
