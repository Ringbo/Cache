diff --git a/extensions/binding/org.eclipse.smarthome.binding.hue/src/main/java/org/eclipse/smarthome/binding/hue/internal/discovery/HueLightDiscoveryService.java b/extensions/binding/org.eclipse.smarthome.binding.hue/src/main/java/org/eclipse/smarthome/binding/hue/internal/discovery/HueLightDiscoveryService.java
index a98d2ae..5b44170 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.hue/src/main/java/org/eclipse/smarthome/binding/hue/internal/discovery/HueLightDiscoveryService.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.hue/src/main/java/org/eclipse/smarthome/binding/hue/internal/discovery/HueLightDiscoveryService.java
@@ -147,7 +147,7 @@
         ThingTypeUID thingTypeUID = getThingTypeUID(light);
 
         if (thingTypeUID != null && getSupportedThingTypes().contains(thingTypeUID)) {
-            return new ThingUID(BINDING_ID, bridgeUID, light.getId());
+            return new ThingUID(thingTypeUID, bridgeUID, light.getId());
         } else {
             return null;
         }
