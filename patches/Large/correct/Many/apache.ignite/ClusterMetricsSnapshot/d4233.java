diff --git a/modules/core/src/main/java/org/apache/ignite/internal/ClusterMetricsSnapshot.java b/modules/core/src/main/java/org/apache/ignite/internal/ClusterMetricsSnapshot.java
index 5f29167..60f26a3 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/ClusterMetricsSnapshot.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/ClusterMetricsSnapshot.java
@@ -353,7 +353,7 @@
             maxRejectedJobs = max(maxRejectedJobs, m.getCurrentRejectedJobs());
             avgRejectedJobs += m.getCurrentRejectedJobs();
 
-            curWaitingJobs += m.getCurrentJobWaitTime();
+            curWaitingJobs += m.getCurrentWaitingJobs();
             maxWaitingJobs = max(maxWaitingJobs, m.getCurrentWaitingJobs());
             avgWaitingJobs += m.getCurrentWaitingJobs();
 
@@ -363,7 +363,7 @@
 
             curJobWaitTime = min(curJobWaitTime, m.getCurrentJobWaitTime());
             maxJobWaitTime = max(maxJobWaitTime, m.getCurrentJobWaitTime());
-            avgJobWaitTime += m.getCurrentJobWaitTime();
+            avgJobWaitTime += m.getAverageJobWaitTime();
 
             daemonThreadCnt += m.getCurrentDaemonThreadCount();
 
