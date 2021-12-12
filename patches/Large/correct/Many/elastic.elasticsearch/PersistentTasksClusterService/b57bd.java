diff --git a/server/src/main/java/org/elasticsearch/persistent/PersistentTasksClusterService.java b/server/src/main/java/org/elasticsearch/persistent/PersistentTasksClusterService.java
index 83bd1f4..9e064c3 100644
--- a/server/src/main/java/org/elasticsearch/persistent/PersistentTasksClusterService.java
+++ b/server/src/main/java/org/elasticsearch/persistent/PersistentTasksClusterService.java
@@ -312,7 +312,7 @@
     }
 
     /** Returns true if the task is not assigned or is assigned to a non-existing node */
-    static boolean needsReassignment(final Assignment assignment, final DiscoveryNodes nodes) {
+    public static boolean needsReassignment(final Assignment assignment, final DiscoveryNodes nodes) {
         return (assignment.isAssigned() == false || nodes.nodeExists(assignment.getExecutorNode()) == false);
     }
 
