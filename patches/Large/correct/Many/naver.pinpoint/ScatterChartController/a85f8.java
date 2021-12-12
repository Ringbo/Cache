diff --git a/src/main/java/com/nhn/pinpoint/web/controller/ScatterChartController.java b/src/main/java/com/nhn/pinpoint/web/controller/ScatterChartController.java
index d5220ea..1f11e68 100644
--- a/src/main/java/com/nhn/pinpoint/web/controller/ScatterChartController.java
+++ b/src/main/java/com/nhn/pinpoint/web/controller/ScatterChartController.java
@@ -88,7 +88,7 @@
 		} else {
 			List<TraceId> traceIds = scatter.selectScatterTraceIdList(applicationName, from, to, limit);
 
-			if (!traceIds.isEmpty()) {
+			if (traceIds.isEmpty()) {
 				model.addAttribute("queryStart", -1);
 				model.addAttribute("queryEnd", -1);
 			} else {
