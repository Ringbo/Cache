diff --git a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/TaskMasterLifecycle.java b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/TaskMasterLifecycle.java
index f0332aa..dcdeff0 100644
--- a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/TaskMasterLifecycle.java
+++ b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/TaskMasterLifecycle.java
@@ -268,7 +268,7 @@
   public Optional<ResourceManagementScheduler> getResourceManagementScheduler()
   {
     if (leading) {
-      return Optional.of(resourceManagementScheduler);
+      return Optional.fromNullable(resourceManagementScheduler);
     } else {
       return Optional.absent();
     }
