diff --git a/clients/src/main/java/org/apache/kafka/clients/NetworkClient.java b/clients/src/main/java/org/apache/kafka/clients/NetworkClient.java
index ea16ac9..720a781 100644
--- a/clients/src/main/java/org/apache/kafka/clients/NetworkClient.java
+++ b/clients/src/main/java/org/apache/kafka/clients/NetworkClient.java
@@ -869,7 +869,7 @@
             connectionStates.disconnected(nodeConnectionId, now);
             /* maybe the problem is our metadata, update it */
             metadataUpdater.requestUpdate();
-            log.debug("Error connecting to node {}", node, e);
+            log.warn("Error connecting to node {}", node, e);
         }
     }
 
