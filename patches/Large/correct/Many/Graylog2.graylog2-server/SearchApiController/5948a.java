diff --git a/app/controllers/api/SearchApiController.java b/app/controllers/api/SearchApiController.java
index 93cfe7d..c1384f8 100644
--- a/app/controllers/api/SearchApiController.java
+++ b/app/controllers/api/SearchApiController.java
@@ -258,7 +258,7 @@
         DateTime from;
         if (allQuery) {
             String firstTimestamp = histogramResults.entrySet().iterator().next().getKey();
-            from = new DateTime(Long.parseLong(firstTimestamp) * 1000);
+            from = new DateTime(Long.parseLong(firstTimestamp) * 1000, DateTimeZone.UTC);
         } else {
             from = DateTime.parse(histogram.getHistogramBoundaries().getFrom());
         }
