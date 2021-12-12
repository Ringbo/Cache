diff --git a/indexing-service/src/main/java/io/druid/indexing/overlord/scaling/SimpleResourceManagementStrategy.java b/indexing-service/src/main/java/io/druid/indexing/overlord/scaling/SimpleResourceManagementStrategy.java
index fe08fd6..10e084b 100644
--- a/indexing-service/src/main/java/io/druid/indexing/overlord/scaling/SimpleResourceManagementStrategy.java
+++ b/indexing-service/src/main/java/io/druid/indexing/overlord/scaling/SimpleResourceManagementStrategy.java
@@ -203,7 +203,7 @@
                             .toList();
 
           if (laziestWorkerIps.isEmpty()) {
-            log.info("Wanted to terminate %,d workers, but couldn't find any lazy ones!");
+            log.info("Wanted to terminate %,d workers, but couldn't find any lazy ones!", excessWorkers);
           } else {
             log.info(
                 "Terminating %,d workers (wanted %,d): %s",
