diff --git a/plugin/src/main/java/org/elasticsearch/xpack/persistent/PersistentTasksCustomMetaData.java b/plugin/src/main/java/org/elasticsearch/xpack/persistent/PersistentTasksCustomMetaData.java
index c42160d..70a4855 100644
--- a/plugin/src/main/java/org/elasticsearch/xpack/persistent/PersistentTasksCustomMetaData.java
+++ b/plugin/src/main/java/org/elasticsearch/xpack/persistent/PersistentTasksCustomMetaData.java
@@ -253,12 +253,12 @@
     /**
      * A record that represents a single running persistent task
      */
-    public static class PersistentTask<Params extends PersistentTaskParams> implements Writeable, ToXContent {
+    public static class PersistentTask<P extends PersistentTaskParams> implements Writeable, ToXContent {
         private final String id;
         private final long allocationId;
         private final String taskName;
         @Nullable
-        private final Params params;
+        private final P params;
         @Nullable
         private final Status status;
         private final Assignment assignment;
@@ -266,21 +266,21 @@
         private final Long allocationIdOnLastStatusUpdate;
 
 
-        public PersistentTask(String id, String taskName, Params params, long allocationId, Assignment assignment) {
+        public PersistentTask(String id, String taskName, P params, long allocationId, Assignment assignment) {
             this(id, allocationId, taskName, params, null, assignment, null);
         }
 
-        public PersistentTask(PersistentTask<Params> task, long allocationId, Assignment assignment) {
+        public PersistentTask(PersistentTask<P> task, long allocationId, Assignment assignment) {
             this(task.id, allocationId, task.taskName, task.params, task.status,
                     assignment, task.allocationId);
         }
 
-        public PersistentTask(PersistentTask<Params> task, Status status) {
+        public PersistentTask(PersistentTask<P> task, Status status) {
             this(task.id, task.allocationId, task.taskName, task.params, status,
                     task.assignment, task.allocationId);
         }
 
-        private PersistentTask(String id, long allocationId, String taskName, Params params,
+        private PersistentTask(String id, long allocationId, String taskName, P params,
                                Status status, Assignment assignment, Long allocationIdOnLastStatusUpdate) {
             this.id = id;
             this.allocationId = allocationId;
@@ -308,7 +308,7 @@
             id = in.readString();
             allocationId = in.readLong();
             taskName = in.readString();
-            params = (Params) in.readOptionalNamedWriteable(PersistentTaskParams.class);
+            params = (P) in.readOptionalNamedWriteable(PersistentTaskParams.class);
             status = in.readOptionalNamedWriteable(Task.Status.class);
             assignment = new Assignment(in.readOptionalString(), in.readString());
             allocationIdOnLastStatusUpdate = in.readOptionalLong();
@@ -364,7 +364,7 @@
         }
 
         @Nullable
-        public Params getParams() {
+        public P getParams() {
             return params;
         }
 
