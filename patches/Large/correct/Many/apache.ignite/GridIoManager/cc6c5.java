diff --git a/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java b/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java
index f63f5f0..9c6271a 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java
@@ -1667,7 +1667,7 @@
         ClusterNode node = ctx.discovery().node(nodeId);
 
         if (node == null)
-            throw new IgniteCheckedException("Failed to send message to node (has node left grid?): " + nodeId);
+            throw new ClusterTopologyCheckedException("Failed to send message to node (has node left grid?): " + nodeId);
 
         sendToCustomTopic(node, topic, msg, plc);
     }
@@ -1685,7 +1685,7 @@
         ClusterNode node = ctx.discovery().node(nodeId);
 
         if (node == null)
-            throw new IgniteCheckedException("Failed to send message to node (has node left grid?): " + nodeId);
+            throw new ClusterTopologyCheckedException("Failed to send message to node (has node left grid?): " + nodeId);
 
         send(node, topic, topic.ordinal(), msg, plc, false, 0, false, null, false);
     }
