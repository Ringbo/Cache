diff --git a/metrics-graphite/src/main/java/com/yammer/metrics/reporting/GraphiteReporter.java b/metrics-graphite/src/main/java/com/yammer/metrics/reporting/GraphiteReporter.java
index 1f39cbb..304c503 100644
--- a/metrics-graphite/src/main/java/com/yammer/metrics/reporting/GraphiteReporter.java
+++ b/metrics-graphite/src/main/java/com/yammer/metrics/reporting/GraphiteReporter.java
@@ -298,11 +298,11 @@
     }
 
     private void printDoubleField(String name, double value, long epoch) {
-        sendToGraphite(String.format("%s%s %2.2f %d\n", prefix, sanitizedName(name), value, epoch));
+        sendToGraphite(String.format("%s%s %2.2f %d\n", prefix, sanitizeName(name), value, epoch));
     }
 
     private void printLongField(String name, long value, long epoch) {
-        sendToGraphite(String.format("%s%s %d %d\n", prefix, sanitizedName(name), value, epoch));
+        sendToGraphite(String.format("%s%s %d %d\n", prefix, sanitizeName(name), value, epoch));
     }
 
     private void printVmMetrics(long epoch) throws IOException {
