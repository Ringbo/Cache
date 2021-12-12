diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting5Message.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting5Message.java
index e560ce3..1b5bc9b 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting5Message.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting5Message.java
@@ -106,7 +106,8 @@
 					RFXComValueSelector.SIGNAL_LEVEL,
 					RFXComValueSelector.COMMAND,
 					RFXComValueSelector.MOOD,
-					RFXComValueSelector.DIMMING_LEVEL);
+					RFXComValueSelector.DIMMING_LEVEL,
+					RFXComValueSelector.CONTACT);
 
 	public SubType subType = SubType.LIGHTWAVERF;
 	public int sensorId = 0;
@@ -300,16 +301,16 @@
 
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
-					state = OpenClosedType.CLOSED;
+					state = OpenClosedType.OPEN;
 					break;
 				
 				case SET_LEVEL:
