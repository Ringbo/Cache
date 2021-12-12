diff --git a/graylog2-server/src/main/java/org/graylog2/dashboards/widgets/FieldChartWidget.java b/graylog2-server/src/main/java/org/graylog2/dashboards/widgets/FieldChartWidget.java
index 91da2c4..c2d9da8 100644
--- a/graylog2-server/src/main/java/org/graylog2/dashboards/widgets/FieldChartWidget.java
+++ b/graylog2-server/src/main/java/org/graylog2/dashboards/widgets/FieldChartWidget.java
@@ -87,7 +87,7 @@
     protected ComputationResult compute() {
         String filter = null;
         if (streamId != null && !streamId.isEmpty()) {
-            filter = "streams:" + filter;
+            filter = "streams:" + streamId;
         }
 
         try {
