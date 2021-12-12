diff --git a/hazelcast/src/main/java/com/hazelcast/impl/partition/MigrationOperation.java b/hazelcast/src/main/java/com/hazelcast/impl/partition/MigrationOperation.java
index 2824628..339135f 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/partition/MigrationOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/partition/MigrationOperation.java
@@ -114,7 +114,7 @@
                         + ", replica: " + replicaIndex);
             }
 //            pm.doMigrate(partitionId, replicaIndex, recordSet, from);
-            final boolean result = pm.runMigrationTasks(this, tasks, partitionId, replicaIndex, from);
+            final boolean result = pm.runMigrationTasks(tasks, partitionId, replicaIndex, from);
             getResponseHandler().sendResponse(result);
 //            getNodeService().send(PartitionManager.PARTITION_SERVICE_NAME, new Response(result), -1, 0, getCallId(), getCaller());
         } catch (Throwable e) {
