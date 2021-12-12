diff --git a/cas-server-webapp-reports/src/main/java/org/jasig/cas/web/report/StatisticsController.java b/cas-server-webapp-reports/src/main/java/org/jasig/cas/web/report/StatisticsController.java
index becf6b2..9ed5120 100644
--- a/cas-server-webapp-reports/src/main/java/org/jasig/cas/web/report/StatisticsController.java
+++ b/cas-server-webapp-reports/src/main/java/org/jasig/cas/web/report/StatisticsController.java
@@ -135,7 +135,7 @@
      * @param bytes the total number of bytes
      * @return value converted to MB
      */
-    private double convertToMegaBytes(final double bytes) {
+    private static double convertToMegaBytes(final double bytes) {
         return bytes / NUMBER_OF_BYTES_IN_A_KILOBYTE / NUMBER_OF_BYTES_IN_A_KILOBYTE;
     }
     /**
