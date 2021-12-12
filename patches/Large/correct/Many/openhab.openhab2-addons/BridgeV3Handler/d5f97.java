diff --git a/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/handler/BridgeV3Handler.java b/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/handler/BridgeV3Handler.java
index 68884ec..58e0764 100644
--- a/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/handler/BridgeV3Handler.java
+++ b/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/handler/BridgeV3Handler.java
@@ -119,7 +119,7 @@
                         updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.NONE, "Bridge did not respond!");
                         timeoutsCounter = 0;
                     } else {
-                        socket.setSoTimeout(300);
+                        socket.setSoTimeout(1000);
                         ++timeoutsCounter;
                         socket.send(discoverPacketV3);
                     }
