diff --git a/src/main/java/org/elasticsearch/action/support/broadcast/TransportBroadcastOperationAction.java b/src/main/java/org/elasticsearch/action/support/broadcast/TransportBroadcastOperationAction.java
index faf33a8..ed1b1bb 100644
--- a/src/main/java/org/elasticsearch/action/support/broadcast/TransportBroadcastOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/broadcast/TransportBroadcastOperationAction.java
@@ -395,7 +395,7 @@
                 public void onResponse(Response response) {
                     try {
                         channel.sendResponse(response);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
