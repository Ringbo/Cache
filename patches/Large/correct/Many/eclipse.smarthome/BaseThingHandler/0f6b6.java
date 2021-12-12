diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/binding/BaseThingHandler.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/binding/BaseThingHandler.java
index 0a2e2b1..d9624a0 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/binding/BaseThingHandler.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/binding/BaseThingHandler.java
@@ -189,7 +189,7 @@
     protected void validateConfigurationParameters(Map<String, Object> configurationParameters)
             throws ConfigValidationException {
         ThingType thingType = TypeResolver.resolve(getThing().getThingTypeUID());
-        if (thingType != null) {
+        if (thingType != null && thingType.getConfigDescriptionURI() != null) {
             ConfigDescriptionValidator.validate(configurationParameters, thingType.getConfigDescriptionURI());
         }
     }
