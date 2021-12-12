diff --git a/h2o-core/src/main/java/hex/AUC.java b/h2o-core/src/main/java/hex/AUC.java
index f9492c2..b3c5775 100644
--- a/h2o-core/src/main/java/hex/AUC.java
+++ b/h2o-core/src/main/java/hex/AUC.java
@@ -137,7 +137,7 @@
 
   // Compute CMs for different thresholds via MRTask2
   private static class AUCTask extends MRTask<AUCTask> {
-    /* @OUT CMs */ private final ConfusionMatrix2[] getCMs() { return _cms; }
+    /* @OUT CMs */ private ConfusionMatrix2[] getCMs() { return _cms; }
     private ConfusionMatrix2[] _cms;
     double nullDev;
     double resDev;
@@ -150,7 +150,7 @@
       ymu = mu;
     }
 
-    static final double y_log_y(double y, double mu) {
+    static double y_log_y(double y, double mu) {
       if(y == 0)return 0;
       if(mu < Double.MIN_NORMAL) mu = Double.MIN_NORMAL;
       return y * Math.log(y / mu);
