diff --git a/plugins/tasks/tasks-api/src/com/intellij/tasks/TaskRepository.java b/plugins/tasks/tasks-api/src/com/intellij/tasks/TaskRepository.java
index b81b974..5bd7a42 100644
--- a/plugins/tasks/tasks-api/src/com/intellij/tasks/TaskRepository.java
+++ b/plugins/tasks/tasks-api/src/com/intellij/tasks/TaskRepository.java
@@ -119,7 +119,7 @@
    */
   @Deprecated
   public Task[] getIssues(@Nullable String query, int max, long since) throws Exception {
-    throw new AssertionError("Should not be called");
+    throw new UnsupportedOperationException("Deprecated: should not be called");
   }
 
   /**
@@ -149,7 +149,7 @@
 
   public Task[] getIssues(@Nullable String query, int offset, int limit, boolean withClosed, @NotNull ProgressIndicator cancelled)
     throws Exception {
-    return getIssues(query, offset + limit, 0, cancelled);
+    return getIssues(query, offset, limit, withClosed);
   }
 
   /**
