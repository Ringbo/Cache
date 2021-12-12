diff --git a/src/main/java/org/elasticsearch/action/support/replication/TransportShardReplicationOperationAction.java b/src/main/java/org/elasticsearch/action/support/replication/TransportShardReplicationOperationAction.java
index 40c3c50..af51494 100644
--- a/src/main/java/org/elasticsearch/action/support/replication/TransportShardReplicationOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/replication/TransportShardReplicationOperationAction.java
@@ -220,7 +220,7 @@
                 public void onResponse(Response result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
@@ -372,7 +372,7 @@
                     }
                 }
                 shardIt = shards(clusterState, request);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
                 return true;
             }
