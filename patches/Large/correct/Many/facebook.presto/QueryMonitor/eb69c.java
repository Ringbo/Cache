diff --git a/presto-main/src/main/java/com/facebook/presto/event/query/QueryMonitor.java b/presto-main/src/main/java/com/facebook/presto/event/query/QueryMonitor.java
index f8ab18c..5bdd4d5 100644
--- a/presto-main/src/main/java/com/facebook/presto/event/query/QueryMonitor.java
+++ b/presto-main/src/main/java/com/facebook/presto/event/query/QueryMonitor.java
@@ -153,7 +153,7 @@
                         input.getSchema(),
                         input.getTable(),
                         input.getColumns().stream()
-                                .map(Column::toString).collect(Collectors.toList()),
+                                .map(Column::getName).collect(Collectors.toList()),
                         input.getConnectorInfo()));
             }
 
