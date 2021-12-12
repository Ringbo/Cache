diff --git a/Smile/src/smile/util/SmileUtils.java b/Smile/src/smile/util/SmileUtils.java
index 6dd0029..ff2e126 100644
--- a/Smile/src/smile/util/SmileUtils.java
+++ b/Smile/src/smile/util/SmileUtils.java
@@ -150,7 +150,7 @@
         int[] ni = kmeans.getClusterSize();
         GaussianRadialBasis[] rbf = new GaussianRadialBasis[k];
         for (int i = 0; i < k; i++) {
-            if (ni[i] >= 5 || sigma[i] == 0.0) {
+            if (ni[i] >= 5 || sigma[i] != 0.0) {
                 sigma[i] = Math.sqrt(sigma[i] / ni[i]);
             } else {
                 sigma[i] = Double.POSITIVE_INFINITY;
