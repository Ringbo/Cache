diff --git a/services/core/java/com/android/server/job/JobStore.java b/services/core/java/com/android/server/job/JobStore.java
index 3ea7171..5f22b34 100644
--- a/services/core/java/com/android/server/job/JobStore.java
+++ b/services/core/java/com/android/server/job/JobStore.java
@@ -207,7 +207,7 @@
         Iterator<JobStatus> it = mJobSet.iterator();
         while (it.hasNext()) {
             JobStatus ts = it.next();
-            if (ts.getUid() == uid && ts.getJobId() == jobid) {
+            if (ts.getUid() == uid && ts.getJobId() == jobId) {
                 return ts;
             }
         }
