diff --git a/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java b/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
index ec25c12..c4cecd9 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
@@ -315,7 +315,7 @@
                     logger.error("Unhandled exception", t);
                 }
             }
-        }, 2, config.getProperty("peer.p2p.pingInterval", 5), TimeUnit.SECONDS);
+        }, 2, config.getProperty("peer.p2p.pingInterval", 5L), TimeUnit.SECONDS);
     }
 
     public void killTimers() {
