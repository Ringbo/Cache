diff --git a/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java b/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java
index c9ef9de..cb3ae88 100644
--- a/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java
@@ -124,17 +124,17 @@
             perform(null);
         }
 
-        private void onFailure(ShardRouting shardRouting, Exception e) {
+        private void onFailure(ShardRouting shardRouting, Throwable e) {
             if (logger.isTraceEnabled() && e != null) {
                 logger.trace("{}: failed to execute [{}]", e, shardRouting, request);
             }
             perform(e);
         }
 
-        private void perform(@Nullable final Exception lastException) {
+        private void perform(@Nullable final Throwable lastException) {
             final ShardRouting shardRouting = shardIt.nextOrNull();
             if (shardRouting == null) {
-                Exception failure = lastException;
+                Throwable failure = lastException;
                 if (failure == null) {
                     failure = new NoShardAvailableActionException(shardIt.shardId(), "No shard available for [" + request + "]");
                 } else {
@@ -155,7 +155,7 @@
                             try {
                                 Response response = shardOperation(request, shardRouting.id());
                                 listener.onResponse(response);
-                            } catch (Exception e) {
+                            } catch (Throwable e) {
                                 onFailure(shardRouting, e);
                             }
                         }
@@ -164,7 +164,7 @@
                     try {
                         final Response response = shardOperation(request, shardRouting.id());
                         listener.onResponse(response);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(shardRouting, e);
                     }
                 }
@@ -219,7 +219,7 @@
                 public void onResponse(Response result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
