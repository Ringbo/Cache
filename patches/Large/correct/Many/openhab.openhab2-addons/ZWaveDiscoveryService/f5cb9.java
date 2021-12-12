diff --git a/addons/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/discovery/ZWaveDiscoveryService.java b/addons/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/discovery/ZWaveDiscoveryService.java
index 40fbefd..d095b1f 100644
--- a/addons/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/discovery/ZWaveDiscoveryService.java
+++ b/addons/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/discovery/ZWaveDiscoveryService.java
@@ -197,7 +197,8 @@
                         node.getDeviceId(), node.getApplicationVersion());
             }
         } else {
-            logger.debug("NODE {}: Device discovery resolved to thingType {}", foundProduct.getThingTypeUID());
+            logger.debug("NODE {}: Device discovery resolved to thingType {}", node.getNodeId(),
+                    foundProduct.getThingTypeUID());
 
             // And create the new thing
             ThingType thingType = ZWaveConfigProvider.getThingType(foundProduct.getThingTypeUID());
