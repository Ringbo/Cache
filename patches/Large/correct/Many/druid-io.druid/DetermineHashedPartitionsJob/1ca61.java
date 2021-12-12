diff --git a/indexing-hadoop/src/main/java/io/druid/indexer/DetermineHashedPartitionsJob.java b/indexing-hadoop/src/main/java/io/druid/indexer/DetermineHashedPartitionsJob.java
index 78f1fdd..530d155 100644
--- a/indexing-hadoop/src/main/java/io/druid/indexer/DetermineHashedPartitionsJob.java
+++ b/indexing-hadoop/src/main/java/io/druid/indexer/DetermineHashedPartitionsJob.java
@@ -348,7 +348,7 @@
     {
 
       if (config.get("mapred.job.tracker").equals("local") || determineIntervals) {
-        return 1;
+        return 0;
       } else {
         return reducerLookup.get(interval);
       }
