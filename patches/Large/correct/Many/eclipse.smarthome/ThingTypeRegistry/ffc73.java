diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/type/ThingTypeRegistry.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/type/ThingTypeRegistry.java
index 84a6185..22a4cba 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/type/ThingTypeRegistry.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/type/ThingTypeRegistry.java
@@ -153,7 +153,7 @@
     public ChannelType getChannelType(Channel channel, Locale locale) {
         ChannelTypeUID channelTypeUID = channel.getChannelTypeUID();
         if (channelTypeUID != null) {
-            return TypeResolver.resolve(channelTypeUID);
+            return TypeResolver.resolve(channelTypeUID, locale);
         }
         // fallback for lookup over the thing type
         ChannelUID channelUID = channel.getUID();
@@ -161,7 +161,7 @@
         if (thingType != null) {
             channelTypeUID = thingType.getChannelTypeUID(channelUID);
             if (channelTypeUID != null) {
-                return TypeResolver.resolve(channelTypeUID);
+                return TypeResolver.resolve(channelTypeUID, locale);
             }
         }
         return null;
