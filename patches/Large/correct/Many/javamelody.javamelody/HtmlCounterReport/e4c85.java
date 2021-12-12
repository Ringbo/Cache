diff --git a/javamelody-core/src/main/java/net/bull/javamelody/HtmlCounterReport.java b/javamelody-core/src/main/java/net/bull/javamelody/HtmlCounterReport.java
index 88aee27..b31d22f 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/HtmlCounterReport.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/HtmlCounterReport.java
@@ -88,7 +88,7 @@
 
 		void writeRequestAndGraphDetail(Collector collector, CollectorServer collectorServer,
 				String graphName) throws IOException {
-			counters = collector.getRangeCountersToBeDisplayed(range);
+			counters = collector.getRangeCounters(range);
 			requestsById = mapAllRequestsById();
 			final CounterRequest request = requestsById.get(graphName);
 			if (request != null) {
@@ -159,7 +159,7 @@
 
 		void writeRequestUsages(Collector collector, String requestId) throws IOException {
 			assert requestId != null;
-			counters = collector.getRangeCountersToBeDisplayed(range);
+			counters = collector.getRangeCounters(range);
 			CounterRequest myRequest = null;
 			final List<CounterRequest> requests = new ArrayList<CounterRequest>();
 			for (final Counter counter : counters) {
