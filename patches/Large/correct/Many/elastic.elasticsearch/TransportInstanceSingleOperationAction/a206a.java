diff --git a/src/main/java/org/elasticsearch/action/support/single/instance/TransportInstanceSingleOperationAction.java b/src/main/java/org/elasticsearch/action/support/single/instance/TransportInstanceSingleOperationAction.java
index c2eadc7..9b788be 100644
--- a/src/main/java/org/elasticsearch/action/support/single/instance/TransportInstanceSingleOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/single/instance/TransportInstanceSingleOperationAction.java
@@ -155,7 +155,7 @@
                     }
                 }
                 shardIt = shards(clusterState, request);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
                 return true;
             }
@@ -306,7 +306,7 @@
                 public void onResponse(Response result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
