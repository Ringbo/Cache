diff --git a/src/java/org/apache/cassandra/metrics/EstimatedHistogramReservoir.java b/src/java/org/apache/cassandra/metrics/EstimatedHistogramReservoir.java
index b7266e4..3051711 100644
--- a/src/java/org/apache/cassandra/metrics/EstimatedHistogramReservoir.java
+++ b/src/java/org/apache/cassandra/metrics/EstimatedHistogramReservoir.java
@@ -33,9 +33,10 @@
 {
     EstimatedHistogram histogram;
 
+    // Default to >4 hours of in nanoseconds of buckets
     public EstimatedHistogramReservoir()
     {
-        this(128);
+        this(164);
     }
 
     public EstimatedHistogramReservoir(int numBuckets)
