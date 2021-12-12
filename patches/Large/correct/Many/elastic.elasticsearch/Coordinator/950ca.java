diff --git a/server/src/main/java/org/elasticsearch/cluster/coordination/Coordinator.java b/server/src/main/java/org/elasticsearch/cluster/coordination/Coordinator.java
index 4b6fcc6..0dbd56b 100644
--- a/server/src/main/java/org/elasticsearch/cluster/coordination/Coordinator.java
+++ b/server/src/main/java/org/elasticsearch/cluster/coordination/Coordinator.java
@@ -921,7 +921,7 @@
                     ackListener.onNodeAck(getLocalNode(), exception); // other nodes have acked, but not the master.
                     publishListener.onFailure(exception);
                 }
-            }, EsExecutors.newDirectExecutorService());
+            }, EsExecutors.newDirectExecutorService(), transportService.getThreadPool().getThreadContext());
         }
 
         private void handleAssociatedJoin(Join join) {
