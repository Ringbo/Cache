diff --git a/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java
index 46ebb8b..b36c6f1 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java
@@ -101,7 +101,7 @@
         for (int i = 0; i < PERM_NODES_CNT; i++) {
             Ignite g = startGrid(gridCntr++);
 
-            g.events().localListen(lsnr, EventType.EVT_NODE_LEFT);
+            g.events().localListen(lsnr, EventType.EVT_NODE_LEFT, EventType.EVT_NODE_FAILED);
 
             alive.add(g);
         }
@@ -205,7 +205,7 @@
 
             alive.add(newNode);
 
-            newNode.events().localListen(lsnr, EventType.EVT_NODE_LEFT);
+            newNode.events().localListen(lsnr, EventType.EVT_NODE_LEFT, EventType.EVT_NODE_FAILED);
         }
     }
 
@@ -227,7 +227,7 @@
 
         // Remove listeners to avoid receiving events from stopping nodes.
         for (Ignite g : toRmv)
-            g.events().stopLocalListen(lsnr, EventType.EVT_NODE_LEFT);
+            g.events().stopLocalListen(lsnr, EventType.EVT_NODE_LEFT, EventType.EVT_NODE_FAILED);
 
         for (Ignite g : toRmv)
             G.stop(g.name(), false);
