diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/ChannelUID.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/ChannelUID.java
index 1058e7b..1a97880 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/ChannelUID.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/ChannelUID.java
@@ -125,7 +125,7 @@
      * @return the thing UID
      */
     public ThingUID getThingUID() {
-        return new ThingUID(Arrays.copyOfRange(getSegments(), 0, getSegments().length - 2));
+        return new ThingUID(Arrays.copyOfRange(getSegments(), 0, getSegments().length - 1));
     }
 
 }
