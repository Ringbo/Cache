diff --git a/h2o-core/src/main/java/water/fvec/FrameCreator.java b/h2o-core/src/main/java/water/fvec/FrameCreator.java
index 64bd372..45b999f 100644
--- a/h2o-core/src/main/java/water/fvec/FrameCreator.java
+++ b/h2o-core/src/main/java/water/fvec/FrameCreator.java
@@ -134,35 +134,35 @@
       for (int r = 0; r < cs[0]._len; r++) {
         setSeed(rng, 0, cs[0]._start + r);
         if (_createFrame.response_factors >1)
-          cs[0].set0(r, (int)(rng.nextDouble() * _createFrame.response_factors)); //classification
+          cs[0].set(r, (int)(rng.nextDouble() * _createFrame.response_factors)); //classification
         else if (_createFrame.positive_response)
-          cs[0].set0(r, _createFrame.real_range * rng.nextDouble()); //regression with positive response
+          cs[0].set(r, _createFrame.real_range * rng.nextDouble()); //regression with positive response
         else
-          cs[0].set0(r, _createFrame.real_range * (1 - 2 * rng.nextDouble())); //regression
+          cs[0].set(r, _createFrame.real_range * (1 - 2 * rng.nextDouble())); //regression
       }
 
       for (int c : _cat_cols) {
         for (int r = 0; r < cs[c]._len; r++) {
           setSeed(rng, c, cs[c]._start + r);
-          cs[c].set0(r, (int)(rng.nextDouble() * _createFrame.factors));
+          cs[c].set(r, (int)(rng.nextDouble() * _createFrame.factors));
         }
       }
       for (int c : _int_cols) {
         for (int r = 0; r < cs[c]._len; r++) {
           setSeed(rng, c, cs[c]._start + r);
-          cs[c].set0(r, (long) ((_createFrame.integer_range+1) * (1 - 2 * rng.nextDouble())));
+          cs[c].set(r, (long) ((_createFrame.integer_range+1) * (1 - 2 * rng.nextDouble())));
         }
       }
       for (int c : _real_cols) {
         for (int r = 0; r < cs[c]._len; r++) {
           setSeed(rng, c, cs[c]._start + r);
-          cs[c].set0(r, _createFrame.real_range * (1 - 2 * rng.nextDouble()));
+          cs[c].set(r, _createFrame.real_range * (1 - 2 * rng.nextDouble()));
         }
       }
       for (int c : _bin_cols) {
         for (int r = 0; r < cs[c]._len; r++) {
           setSeed(rng, c, cs[c]._start + r);
-          cs[c].set0(r, rng.nextFloat() > _createFrame.binary_ones_fraction ? 0 : 1);
+          cs[c].set(r, rng.nextFloat() > _createFrame.binary_ones_fraction ? 0 : 1);
         }
       }
       _createFrame.update(1);
@@ -194,7 +194,7 @@
       for (int c = 0; c < cs.length; c++) {
         for (int r = 0; r < cs[c]._len; r++) {
           rng.setSeed(_seed + 1234 * c ^ 1723 * (cs[c]._start + r)); //row+col-dependent RNG for reproducibility
-          if (rng.nextDouble() < _frac) cs[c].setNA0(r);
+          if (rng.nextDouble() < _frac) cs[c].setNA(r);
         }
       }
     }
