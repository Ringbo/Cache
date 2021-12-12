diff --git a/javamelody-core/src/main/java/net/bull/javamelody/internal/model/Collector.java b/javamelody-core/src/main/java/net/bull/javamelody/internal/model/Collector.java
index 7b3feea..01d417a 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/internal/model/Collector.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/internal/model/Collector.java
@@ -629,8 +629,9 @@
 
 	private void addJRobinValue(JRobin jRobin, double value) throws IOException {
 		jRobin.addValue(value);
-		// if value == -1, then do not publish that metric
-		if (value >= 0) {
+		// if value == -1, then do not publish that metric,
+		// and metricsPublishers may be null (#735)
+		if (value >= 0 && metricsPublishers != null) {
 			for (final MetricsPublisher metricsPublisher : metricsPublishers) {
 				metricsPublisher.addValue(jRobin.getName(), value);
 			}
