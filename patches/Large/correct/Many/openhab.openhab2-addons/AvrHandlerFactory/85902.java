diff --git a/addons/binding/org.openhab.binding.pioneeravr/src/main/java/org/openhab/binding/pioneeravr/internal/handler/AvrHandlerFactory.java b/addons/binding/org.openhab.binding.pioneeravr/src/main/java/org/openhab/binding/pioneeravr/internal/handler/AvrHandlerFactory.java
index 832b178..72b3d77 100644
--- a/addons/binding/org.openhab.binding.pioneeravr/src/main/java/org/openhab/binding/pioneeravr/internal/handler/AvrHandlerFactory.java
+++ b/addons/binding/org.openhab.binding.pioneeravr/src/main/java/org/openhab/binding/pioneeravr/internal/handler/AvrHandlerFactory.java
@@ -45,7 +45,8 @@
 
         ThingTypeUID thingTypeUID = thing.getThingTypeUID();
 
-        if (thingTypeUID.equals(PioneerAvrBindingConstants.IP_AVR_THING_TYPE)) {
+        if (thingTypeUID.equals(PioneerAvrBindingConstants.IP_AVR_THING_TYPE)
+                || thingTypeUID.equals(PioneerAvrBindingConstants.IP_AVR_UNSUPPORTED_THING_TYPE)) {
             return new IpAvrHandler(thing);
         } else if (thingTypeUID.equals(PioneerAvrBindingConstants.SERIAL_AVR_THING_TYPE)) {
             return new SerialAvrHandler(thing);
