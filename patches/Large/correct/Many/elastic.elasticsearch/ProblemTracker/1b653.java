diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/ProblemTracker.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/ProblemTracker.java
index 178cbae..a2072d3 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/ProblemTracker.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/ProblemTracker.java
@@ -35,7 +35,7 @@
 
     private volatile int emptyDataCount;
 
-    public ProblemTracker(Supplier<Auditor> auditor) {
+    ProblemTracker(Supplier<Auditor> auditor) {
         this.auditor = Objects.requireNonNull(auditor);
     }
 
