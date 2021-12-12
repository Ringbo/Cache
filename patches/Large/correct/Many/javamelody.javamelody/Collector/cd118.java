diff --git a/javamelody-core/src/main/java/net/bull/javamelody/Collector.java b/javamelody-core/src/main/java/net/bull/javamelody/Collector.java
index fea8da4..6739c07 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/Collector.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/Collector.java
@@ -159,7 +159,7 @@
 		return estimatedMemorySize;
 	}
 
-	private List<Counter> getRangeCounters(Range range) throws IOException {
+	List<Counter> getRangeCounters(Range range) throws IOException {
 		if (range.getPeriod() == Period.TOUT) {
 			return new ArrayList<Counter>(counters);
 		}
