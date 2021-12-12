diff --git a/addons/binding/org.openhab.binding.deconz/src/main/java/org/openhab/binding/deconz/internal/handler/SensorThingHandler.java b/addons/binding/org.openhab.binding.deconz/src/main/java/org/openhab/binding/deconz/internal/handler/SensorThingHandler.java
index 528fc04..d7fd88e 100644
--- a/addons/binding/org.openhab.binding.deconz/src/main/java/org/openhab/binding/deconz/internal/handler/SensorThingHandler.java
+++ b/addons/binding/org.openhab.binding.deconz/src/main/java/org/openhab/binding/deconz/internal/handler/SensorThingHandler.java
@@ -83,7 +83,7 @@
         }
 
         state.buttonevent = null;
-        valueUpdated(channelUID.getId(), state);
+        valueUpdated(channelUID.getId(), state, false);
     }
 
     @Override
@@ -176,7 +176,7 @@
 
                     // Initial data
                     for (Channel channel : thing.getChannels()) {
-                        valueUpdated(channel.getUID().getId(), newState.state);
+                        valueUpdated(channel.getUID().getId(), newState.state, true);
                     }
 
                     // Real-time data
@@ -205,7 +205,7 @@
         }
     }
 
-    public void valueUpdated(String channelID, SensorState state) {
+    public void valueUpdated(String channelID, SensorState state, boolean initializing) {
         this.state = state;
 
         Integer buttonevent = state.buttonevent;
@@ -276,7 +276,7 @@
                 }
                 break;
             case BindingConstants.CHANNEL_BUTTONEVENT:
-                if (buttonevent != null) {
+                if (buttonevent != null && !initializing) {
                     triggerChannel(BindingConstants.CHANNEL_BUTTONEVENT, String.valueOf(buttonevent));
                 }
                 break;
@@ -286,7 +286,7 @@
     @Override
     public void websocketUpdate(String sensorID, SensorState newState) {
         for (Channel channel : thing.getChannels()) {
-            valueUpdated(channel.getUID().getId(), newState);
+            valueUpdated(channel.getUID().getId(), newState, false);
         }
     }
 }
