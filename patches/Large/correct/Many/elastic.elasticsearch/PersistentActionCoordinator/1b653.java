diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinator.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinator.java
index 61ada40..f30f2a2 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinator.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinator.java
@@ -193,7 +193,7 @@
     private class PersistentTaskListener implements ActionListener<Empty> {
         private final RunningPersistentTask task;
 
-        public PersistentTaskListener(final RunningPersistentTask task) {
+        PersistentTaskListener(final RunningPersistentTask task) {
             this.task = task;
         }
 
@@ -221,7 +221,7 @@
     private class PublishedResponseListener implements ActionListener<CompletionPersistentTaskAction.Response> {
         private final RunningPersistentTask task;
 
-        public PublishedResponseListener(final RunningPersistentTask task) {
+        PublishedResponseListener(final RunningPersistentTask task) {
             this.task = task;
         }
 
@@ -256,7 +256,7 @@
         private final long id;
         private final long allocationId;
 
-        public PersistentTaskId(long id, long allocationId) {
+        PersistentTaskId(long id, long allocationId) {
             this.id = id;
             this.allocationId = allocationId;
         }
@@ -284,11 +284,11 @@
         @Nullable
         private Exception failure;
 
-        public RunningPersistentTask(PersistentTask task, long id) {
+        RunningPersistentTask(PersistentTask task, long id) {
             this(task, id, State.STARTED);
         }
 
-        public RunningPersistentTask(PersistentTask task, long id, State state) {
+        RunningPersistentTask(PersistentTask task, long id, State state) {
             this.task = task;
             this.id = id;
             this.state = new AtomicReference<>(state);
