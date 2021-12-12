diff --git a/binding/org.eclipse.smarthome.binding.wemo/src/main/java/org/eclipse/smarthome/binding/wemo/discovery/WemoDiscoveryParticipant.java b/binding/org.eclipse.smarthome.binding.wemo/src/main/java/org/eclipse/smarthome/binding/wemo/discovery/WemoDiscoveryParticipant.java
index 8ad2a75..9061264 100644
--- a/binding/org.eclipse.smarthome.binding.wemo/src/main/java/org/eclipse/smarthome/binding/wemo/discovery/WemoDiscoveryParticipant.java
+++ b/binding/org.eclipse.smarthome.binding.wemo/src/main/java/org/eclipse/smarthome/binding/wemo/discovery/WemoDiscoveryParticipant.java
@@ -89,13 +89,13 @@
 					if(modelName.startsWith("LightSwitch")) {
 						logger.debug("Discovered a WeMo LightSwitch thing with serialNumber '{}'",
 								device.getDetails().getSerialNumber());
-						return new ThingUID(WEMO_INSIGHT_TYPE_UID, device
+						return new ThingUID(WEMO_LIGHTSWITCH_TYPE_UID, device
 								.getDetails().getSerialNumber());
 					}
 					if(modelName.startsWith("Motion")) {
 						logger.debug("Discovered a WeMo Motion thing with serialNumber '{}'",
 								device.getDetails().getSerialNumber());
-						return new ThingUID(WEMO_INSIGHT_TYPE_UID, device
+						return new ThingUID(WEMO_MOTION_TYPE_UID, device
 								.getDetails().getSerialNumber());
 					}
 				}
