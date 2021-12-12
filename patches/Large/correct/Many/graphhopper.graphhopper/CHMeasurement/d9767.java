diff --git a/tools/src/main/java/com/graphhopper/tools/CHMeasurement.java b/tools/src/main/java/com/graphhopper/tools/CHMeasurement.java
index ac7353c..2c653e7 100644
--- a/tools/src/main/java/com/graphhopper/tools/CHMeasurement.java
+++ b/tools/src/main/java/com/graphhopper/tools/CHMeasurement.java
@@ -212,7 +212,7 @@
             public int doCalc(boolean warmup, int run) {
                 if (!warmup && run % 100 == 0) {
                     LOGGER.info("Finished {} of {} runs. {}", run, iterations,
-                            run > 0 ? String.format(" CH: %6.2fms, without CH: %6.2fms",
+                            run > 0 ? String.format(Locale.ROOT, " CH: %6.2fms, without CH: %6.2fms",
                                     chTime * 1.e-6 / run, noChTime * 1.e-6 / run) : "");
                 }
                 if (run == iterations - 1) {
@@ -293,7 +293,7 @@
             public int doCalc(boolean warmup, int run) {
                 if (!warmup && run % 100 == 0) {
                     LOGGER.info("Finished {} of {} runs. {}", run, iterations,
-                            run > 0 ? String.format(" Time: %6.2fms", queryTime * 1.e-6 / run) : "");
+                            run > 0 ? String.format(Locale.ROOT, " Time: %6.2fms", queryTime * 1.e-6 / run) : "");
                 }
                 if (run == iterations - 1) {
                     String avg = fmt(queryTime * 1.e-6 / run);
@@ -327,7 +327,7 @@
     }
 
     private static String getWeightDifferenceString(double chWeight, double noChWeight) {
-        return String.format("route weight: %.6f (CH) vs. %.6f (no CH) (diff = %.6f)",
+        return String.format(Locale.ROOT, "route weight: %.6f (CH) vs. %.6f (no CH) (diff = %.6f)",
                 chWeight, noChWeight, (chWeight - noChWeight));
     }
 
@@ -361,7 +361,7 @@
     }
 
     private static String fmt(double number) {
-        return String.format("%.2f", number);
+        return String.format(Locale.ROOT, "%.2f", number);
     }
 
 }
