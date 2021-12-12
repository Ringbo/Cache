diff --git a/src/main/java/org/elasticsearch/action/support/single/custom/TransportSingleCustomOperationAction.java b/src/main/java/org/elasticsearch/action/support/single/custom/TransportSingleCustomOperationAction.java
index c8263e9..4911912 100644
--- a/src/main/java/org/elasticsearch/action/support/single/custom/TransportSingleCustomOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/single/custom/TransportSingleCustomOperationAction.java
@@ -120,7 +120,7 @@
             performFirst();
         }
 
-        private void onFailure(ShardRouting shardRouting, Exception e) {
+        private void onFailure(ShardRouting shardRouting, Throwable e) {
             if (logger.isTraceEnabled() && e != null) {
                 logger.trace(shardRouting.shortSummary() + ": Failed to execute [" + request + "]", e);
             }
@@ -141,7 +141,7 @@
                             try {
                                 Response response = shardOperation(request, -1);
                                 listener.onResponse(response);
-                            } catch (Exception e) {
+                            } catch (Throwable e) {
                                 onFailure(null, e);
                             }
                         }
@@ -152,7 +152,7 @@
                         final Response response = shardOperation(request, -1);
                         listener.onResponse(response);
                         return;
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(null, e);
                     }
                 }
@@ -174,7 +174,7 @@
                                     try {
                                         Response response = shardOperation(request, shard.id());
                                         listener.onResponse(response);
-                                    } catch (Exception e) {
+                                    } catch (Throwable e) {
                                         shardsIt.reset();
                                         onFailure(shard, e);
                                     }
@@ -186,7 +186,7 @@
                                 final Response response = shardOperation(request, shard.id());
                                 listener.onResponse(response);
                                 return;
-                            } catch (Exception e) {
+                            } catch (Throwable e) {
                                 shardsIt.reset();
                                 onFailure(shard, e);
                             }
@@ -203,10 +203,10 @@
             }
         }
 
-        private void perform(final Exception lastException) {
+        private void perform(final Throwable lastException) {
             final ShardRouting shard = shardsIt == null ? null : shardsIt.nextOrNull();
             if (shard == null) {
-                Exception failure = lastException;
+                Throwable failure = lastException;
                 if (failure == null) {
                     failure = new NoShardAvailableActionException(null, "No shard available for [" + request + "]");
                 } else {
@@ -227,7 +227,7 @@
                                     try {
                                         Response response = shardOperation(request, shard.id());
                                         listener.onResponse(response);
-                                    } catch (Exception e) {
+                                    } catch (Throwable e) {
                                         onFailure(shard, e);
                                     }
                                 }
@@ -236,7 +236,7 @@
                             try {
                                 final Response response = shardOperation(request, shard.id());
                                 listener.onResponse(response);
-                            } catch (Exception e) {
+                            } catch (Throwable e) {
                                 onFailure(shard, e);
                             }
                         }
@@ -289,7 +289,7 @@
                 public void onResponse(Response result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
