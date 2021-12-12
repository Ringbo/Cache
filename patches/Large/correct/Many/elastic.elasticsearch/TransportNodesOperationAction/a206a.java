diff --git a/src/main/java/org/elasticsearch/action/support/nodes/TransportNodesOperationAction.java b/src/main/java/org/elasticsearch/action/support/nodes/TransportNodesOperationAction.java
index 49656f2..2d4d64b 100644
--- a/src/main/java/org/elasticsearch/action/support/nodes/TransportNodesOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/nodes/TransportNodesOperationAction.java
@@ -148,7 +148,7 @@
                         public void run() {
                             try {
                                 onOperation(nodeOperation(newNodeRequest(clusterState.nodes().localNodeId(), request)));
-                            } catch (Exception e) {
+                            } catch (Throwable e) {
                                 onFailure(clusterState.nodes().localNodeId(), e);
                             }
                         }
@@ -159,7 +159,7 @@
                         public void run() {
                             try {
                                 onOperation(nodeOperation(newNodeRequest(clusterState.nodes().masterNodeId(), request)));
-                            } catch (Exception e) {
+                            } catch (Throwable e) {
                                 onFailure(clusterState.nodes().masterNodeId(), e);
                             }
                         }
@@ -237,7 +237,7 @@
                     TransportResponseOptions options = TransportResponseOptions.options().withCompress(transportCompress());
                     try {
                         channel.sendResponse(response, options);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
