diff --git a/services/core/java/com/android/server/job/JobStore.java b/services/core/java/com/android/server/job/JobStore.java
index 2e6cd3f..57b1ccc 100644
--- a/services/core/java/com/android/server/job/JobStore.java
+++ b/services/core/java/com/android/server/job/JobStore.java
@@ -807,7 +807,7 @@
             ArrayList<JobStatus> result = new ArrayList<JobStatus>();
             for (int i = mJobs.size() - 1; i >= 0; i--) {
                 if (UserHandle.getUserId(mJobs.keyAt(i)) == userId) {
-                    ArraySet<JobStatus> jobs = mJobs.get(i);
+                    ArraySet<JobStatus> jobs = mJobs.valueAt(i);
                     if (jobs != null) {
                         result.addAll(jobs);
                     }
