diff --git a/src/main/java/org/elasticsearch/client/transport/TransportClientNodesService.java b/src/main/java/org/elasticsearch/client/transport/TransportClientNodesService.java
index df1580e..8d34afb 100644
--- a/src/main/java/org/elasticsearch/client/transport/TransportClientNodesService.java
+++ b/src/main/java/org/elasticsearch/client/transport/TransportClientNodesService.java
@@ -247,7 +247,7 @@
                 } else {
                     try {
                         callback.doWithNode(nodes.get((index + i) % nodes.size()), this);
-                    } catch (Exception e1) {
+                    } catch (Throwable e1) {
                         // retry the next one...
                         onFailure(e);
                     }
