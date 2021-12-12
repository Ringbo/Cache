diff --git a/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java b/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
index d16787b..37fefab 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
@@ -281,7 +281,7 @@
             } catch (Throwable t) {
                 logger.error("Unhandled exception", t);
             }
-        }, 2, config.getProperty("peer.p2p.pingInterval", 5L), TimeUnit.SECONDS);
+        }, 2, config.getProperty("peer.p2p.pingInterval", 5), TimeUnit.SECONDS);
     }
 
     public void killTimers() {
