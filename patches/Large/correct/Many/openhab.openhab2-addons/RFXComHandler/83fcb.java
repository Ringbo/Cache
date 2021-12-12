diff --git a/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComHandler.java b/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComHandler.java
index 573e975..6bf67d2 100644
--- a/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComHandler.java
+++ b/addons/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/handler/RFXComHandler.java
@@ -251,7 +251,7 @@
                                     updateState(CHANNEL_TEMPERATURE, message.convertToState(valueSelector));
                                     break;
                                 case CHILL_TEMPERATURE:
-                                    updateState(CHANNEL_TEMPERATURE, message.convertToState(valueSelector));
+                                    updateState(CHANNEL_CHILL_TEMPERATURE, message.convertToState(valueSelector));
                                     break;
                                 case TOTAL_AMP_HOUR:
                                     updateState(CHANNEL_TOTAL_AMP_HOUR, message.convertToState(valueSelector));
