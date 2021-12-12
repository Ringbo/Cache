diff --git a/src/main/java/org/tron/core/net/node/NodeImpl.java b/src/main/java/org/tron/core/net/node/NodeImpl.java
index c2d036b..cfae771 100755
--- a/src/main/java/org/tron/core/net/node/NodeImpl.java
+++ b/src/main/java/org/tron/core/net/node/NodeImpl.java
@@ -413,7 +413,7 @@
             logger.debug("suspend");
           }
         }
-        isFetchActive = false;
+        isFetchSyncActive = false;
       } catch (Throwable t) {
         logger.error("Unhandled exception", t);
       }
