diff --git a/addons/binding/org.openhab.binding.miele/src/main/java/org/openhab/binding/miele/handler/FridgeHandler.java b/addons/binding/org.openhab.binding.miele/src/main/java/org/openhab/binding/miele/handler/FridgeHandler.java
index 20155ca..5c476d0 100644
--- a/addons/binding/org.openhab.binding.miele/src/main/java/org/openhab/binding/miele/handler/FridgeHandler.java
+++ b/addons/binding/org.openhab.binding.miele/src/main/java/org/openhab/binding/miele/handler/FridgeHandler.java
@@ -42,7 +42,7 @@
         String channelID = channelUID.getId();
         String uid = (String) getThing().getConfiguration().getProperties().get(APPLIANCE_ID);
 
-        FridgeFreezerChannelSelector selector = (FridgeFreezerChannelSelector) getValueSelectorFromChannelID(channelID);
+        FridgeChannelSelector selector = (FridgeChannelSelector) getValueSelectorFromChannelID(channelID);
         JsonElement result = null;
 
         try {
