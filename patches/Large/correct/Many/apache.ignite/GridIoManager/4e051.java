diff --git a/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java b/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java
index 363e300..392aa39 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/managers/communication/GridIoManager.java
@@ -442,7 +442,7 @@
             if (stopping) {
                 if (log.isDebugEnabled())
                     log.debug("Received communication message while stopping (will ignore) [nodeId=" +
-                        nodeId + ", msg=" + cacheMsg + ']');
+                        nodeId + ", msg=" + msg + ']');
 
                 return;
             }
