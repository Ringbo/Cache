diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinatorTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinatorTests.java
index 772bcab..54073b2 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinatorTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/persistent/PersistentActionCoordinatorTests.java
@@ -328,7 +328,7 @@
         private final PersistentActionRegistry.PersistentActionHolder<?> holder;
         private final ActionListener<Empty> listener;
 
-        public Execution(PersistentActionRequest request, PersistentTask task, PersistentActionRegistry.PersistentActionHolder<?> holder,
+        Execution(PersistentActionRequest request, PersistentTask task, PersistentActionRegistry.PersistentActionHolder<?> holder,
                          ActionListener<Empty> listener) {
             this.request = request;
             this.task = task;
@@ -340,7 +340,7 @@
     private class MockExecutor extends PersistentActionExecutor {
         private List<Execution> executions = new ArrayList<>();
 
-        public MockExecutor() {
+        MockExecutor() {
             super(null);
         }
 
