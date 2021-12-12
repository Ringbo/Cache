diff --git a/src/main/java/org/elasticsearch/action/support/replication/TransportIndicesReplicationOperationAction.java b/src/main/java/org/elasticsearch/action/support/replication/TransportIndicesReplicationOperationAction.java
index 7083535..64709fc 100644
--- a/src/main/java/org/elasticsearch/action/support/replication/TransportIndicesReplicationOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/replication/TransportIndicesReplicationOperationAction.java
@@ -157,7 +157,7 @@
                 public void onResponse(Response result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
