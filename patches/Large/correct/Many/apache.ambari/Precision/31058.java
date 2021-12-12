diff --git a/ambari-metrics/ambari-metrics-common/src/main/java/org/apache/hadoop/metrics2/sink/timeline/Precision.java b/ambari-metrics/ambari-metrics-common/src/main/java/org/apache/hadoop/metrics2/sink/timeline/Precision.java
index 31044cc..e87f06e 100644
--- a/ambari-metrics/ambari-metrics-common/src/main/java/org/apache/hadoop/metrics2/sink/timeline/Precision.java
+++ b/ambari-metrics/ambari-metrics-common/src/main/java/org/apache/hadoop/metrics2/sink/timeline/Precision.java
@@ -35,7 +35,7 @@
   }
 
   public static Precision getPrecision(String precision) throws PrecisionFormatException {
-    if (precision == null ) {
+    if (precision == null || precision.isEmpty()) {
       return null;
     }
     try {
