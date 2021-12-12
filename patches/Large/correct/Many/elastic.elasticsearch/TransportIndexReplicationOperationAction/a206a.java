diff --git a/src/main/java/org/elasticsearch/action/support/replication/TransportIndexReplicationOperationAction.java b/src/main/java/org/elasticsearch/action/support/replication/TransportIndexReplicationOperationAction.java
index 7b30c40..269d04f 100644
--- a/src/main/java/org/elasticsearch/action/support/replication/TransportIndexReplicationOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/replication/TransportIndexReplicationOperationAction.java
@@ -76,7 +76,7 @@
         GroupShardsIterator groups;
         try {
             groups = shards(request);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             listener.onFailure(e);
             return;
         }
@@ -153,7 +153,7 @@
                 public void onResponse(Response result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
