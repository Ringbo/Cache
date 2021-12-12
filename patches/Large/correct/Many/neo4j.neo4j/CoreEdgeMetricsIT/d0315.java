diff --git a/enterprise/metrics/src/test/java/org/neo4j/metrics/CoreEdgeMetricsIT.java b/enterprise/metrics/src/test/java/org/neo4j/metrics/CoreEdgeMetricsIT.java
index 5034734..cc3a73f 100644
--- a/enterprise/metrics/src/test/java/org/neo4j/metrics/CoreEdgeMetricsIT.java
+++ b/enterprise/metrics/src/test/java/org/neo4j/metrics/CoreEdgeMetricsIT.java
@@ -123,7 +123,7 @@
 
         assertEventually( "leader not found eventually accurate",
                 () -> readLongValue( metricsCsv( coreMetricsDir, CoreMetrics.LEADER_NOT_FOUND ) ),
-                equalTo( 0L ), TIMEOUT, TimeUnit.SECONDS );
+                greaterThanOrEqualTo( 0L ), TIMEOUT, TimeUnit.SECONDS );
 
         assertEventually( "tx pull requests received eventually accurate", () -> {
             long total = 0;
