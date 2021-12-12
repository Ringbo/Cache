diff --git a/server/src/test/java/org/elasticsearch/persistent/PersistentActionCoordinatorTests.java b/server/src/test/java/org/elasticsearch/persistent/PersistentActionCoordinatorTests.java
index 08aaf9d..2454ac5 100644
--- a/server/src/test/java/org/elasticsearch/persistent/PersistentActionCoordinatorTests.java
+++ b/server/src/test/java/org/elasticsearch/persistent/PersistentActionCoordinatorTests.java
@@ -342,7 +342,7 @@
         private final PersistentActionRegistry.PersistentActionHolder<?> holder;
         private final ActionListener<Empty> listener;
 
-        public Execution(PersistentActionRequest request, PersistentTask task, PersistentActionRegistry.PersistentActionHolder<?> holder,
+        Execution(PersistentActionRequest request, PersistentTask task, PersistentActionRegistry.PersistentActionHolder<?> holder,
                          ActionListener<Empty> listener) {
             this.request = request;
             this.task = task;
@@ -354,7 +354,7 @@
     private class MockExecutor extends PersistentActionExecutor {
         private List<Execution> executions = new ArrayList<>();
 
-        public MockExecutor() {
+        MockExecutor() {
             super(null);
         }
 
