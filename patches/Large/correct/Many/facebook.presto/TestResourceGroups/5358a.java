diff --git a/presto-main/src/test/java/com/facebook/presto/execution/resourceGroups/TestResourceGroups.java b/presto-main/src/test/java/com/facebook/presto/execution/resourceGroups/TestResourceGroups.java
index cbf9437..1cc024e 100644
--- a/presto-main/src/test/java/com/facebook/presto/execution/resourceGroups/TestResourceGroups.java
+++ b/presto-main/src/test/java/com/facebook/presto/execution/resourceGroups/TestResourceGroups.java
@@ -177,7 +177,7 @@
         root.setSoftMemoryLimit(new DataSize(1, BYTE));
         root.setMaxQueuedQueries(4);
         root.setMaxRunningQueries(3);
-        MockQueryExecution query1 = new MockQueryExecution(1);
+        MockQueryExecution query1 = new MockQueryExecution(2);
         root.run(query1);
         // Process the group to refresh stats
         root.processQueuedQueries();
@@ -207,7 +207,7 @@
         subgroup.setMaxQueuedQueries(4);
         subgroup.setMaxRunningQueries(3);
 
-        MockQueryExecution query1 = new MockQueryExecution(1);
+        MockQueryExecution query1 = new MockQueryExecution(2);
         subgroup.run(query1);
         // Process the group to refresh stats
         root.processQueuedQueries();
