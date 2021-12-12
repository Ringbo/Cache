diff --git a/common/buildcraft/lib/engine/TileEngineBase_BC8.java b/common/buildcraft/lib/engine/TileEngineBase_BC8.java
index 060c97e..b50e035 100644
--- a/common/buildcraft/lib/engine/TileEngineBase_BC8.java
+++ b/common/buildcraft/lib/engine/TileEngineBase_BC8.java
@@ -376,7 +376,7 @@
             return;
         }
         IMjReceiver receiver = getReceiverToPower(tile, currentDirection);
-        if (receiver != null) {
+        if (receiver != null && mjConnector.canConnect(receiver) && receiver.canConnect(mjConnector)) {
             long extracted = getPowerToExtract(true);
             if (extracted > 0) {
                 long excess = receiver.receivePower(extracted, false);
