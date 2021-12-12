diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting2Message.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting2Message.java
index e1f535e..83c6d02 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting2Message.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting2Message.java
@@ -91,7 +91,8 @@
 			.asList(RFXComValueSelector.RAW_DATA,
 					RFXComValueSelector.SIGNAL_LEVEL,
 					RFXComValueSelector.COMMAND,
-					RFXComValueSelector.DIMMING_LEVEL);
+					RFXComValueSelector.DIMMING_LEVEL,
+					RFXComValueSelector.CONTACT);
 
 	public SubType subType = SubType.AC;
 	public int sensorId = 0;
@@ -269,17 +270,17 @@
 
 		} else if (valueSelector.getItemClass() == ContactItem.class) {
 
-			if (valueSelector == RFXComValueSelector.COMMAND) {
+			if (valueSelector == RFXComValueSelector.CONTACT) {
 
 				switch (command) {
 				case OFF:
 				case GROUP_OFF:
-					state = OpenClosedType.OPEN;
+					state = OpenClosedType.CLOSED;
 					break;
 
 				case ON:
 				case GROUP_ON:
-					state = OpenClosedType.CLOSED;
+					state = OpenClosedType.OPEN;
 					break;
 
 				case SET_GROUP_LEVEL:
