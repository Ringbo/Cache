diff --git a/job/src/main/java/org/apache/kylin/job/dao/ExecutableDao.java b/job/src/main/java/org/apache/kylin/job/dao/ExecutableDao.java
index 8f81973..4862bb1 100644
--- a/job/src/main/java/org/apache/kylin/job/dao/ExecutableDao.java
+++ b/job/src/main/java/org/apache/kylin/job/dao/ExecutableDao.java
@@ -98,7 +98,7 @@
     public List<ExecutableOutputPO> getJobOutputs() throws PersistentException {
         try {
             ArrayList<String> resources = store.listResources(JOB_OUTPUT_ROOT);
-            if (resources == null) {
+            if (resources == null || resources.isEmpty()) {
                 return Collections.emptyList();
             }
             Collections.sort(resources);
@@ -114,7 +114,7 @@
     public List<ExecutablePO> getJobs() throws PersistentException {
         try {
             final List<String> jobIds = store.listResources(JOB_PATH_ROOT);
-            if (jobIds.isEmpty()) {
+            if (jobIds == null || jobIds.isEmpty()) {
                 return Collections.emptyList();
             }
             Collections.sort(jobIds);
