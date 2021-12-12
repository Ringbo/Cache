diff --git a/server/src/main/java/org/elasticsearch/persistent/PersistentActionCoordinator.java b/server/src/main/java/org/elasticsearch/persistent/PersistentActionCoordinator.java
index 80faf80..c6491a3 100644
--- a/server/src/main/java/org/elasticsearch/persistent/PersistentActionCoordinator.java
+++ b/server/src/main/java/org/elasticsearch/persistent/PersistentActionCoordinator.java
@@ -206,7 +206,7 @@
     private class PersistentTaskListener implements ActionListener<Empty> {
         private final RunningPersistentTask task;
 
-        public PersistentTaskListener(final RunningPersistentTask task) {
+        PersistentTaskListener(final RunningPersistentTask task) {
             this.task = task;
         }
 
@@ -234,7 +234,7 @@
     private class PublishedResponseListener implements ActionListener<CompletionPersistentTaskAction.Response> {
         private final RunningPersistentTask task;
 
-        public PublishedResponseListener(final RunningPersistentTask task) {
+        PublishedResponseListener(final RunningPersistentTask task) {
             this.task = task;
         }
 
@@ -269,7 +269,7 @@
         private final long id;
         private final long allocationId;
 
-        public PersistentTaskId(long id, long allocationId) {
+        PersistentTaskId(long id, long allocationId) {
             this.id = id;
             this.allocationId = allocationId;
         }
@@ -297,11 +297,11 @@
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
