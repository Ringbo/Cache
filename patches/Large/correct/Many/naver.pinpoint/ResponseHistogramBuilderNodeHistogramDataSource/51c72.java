diff --git a/web/src/main/java/com/navercorp/pinpoint/web/applicationmap/appender/histogram/datasource/ResponseHistogramBuilderNodeHistogramDataSource.java b/web/src/main/java/com/navercorp/pinpoint/web/applicationmap/appender/histogram/datasource/ResponseHistogramBuilderNodeHistogramDataSource.java
index 3cd3347..30633da 100644
--- a/web/src/main/java/com/navercorp/pinpoint/web/applicationmap/appender/histogram/datasource/ResponseHistogramBuilderNodeHistogramDataSource.java
+++ b/web/src/main/java/com/navercorp/pinpoint/web/applicationmap/appender/histogram/datasource/ResponseHistogramBuilderNodeHistogramDataSource.java
@@ -41,7 +41,7 @@
     @Override
     public NodeHistogram createNodeHistogram(Application application, Range range) {
         List<ResponseTime> responseTimes = responseHistogramBuilder.getResponseTimeList(application);
-        final NodeHistogram nodeHistogram = new NodeHistogram(application, range);
+        final NodeHistogram nodeHistogram = new NodeHistogram(application, range, responseTimes);
         return nodeHistogram;
     }
 }
