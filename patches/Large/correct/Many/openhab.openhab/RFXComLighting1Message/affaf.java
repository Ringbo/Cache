diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting1Message.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting1Message.java
index 84e4240..81122ee 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting1Message.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting1Message.java
@@ -92,7 +92,8 @@
 	private final static List<RFXComValueSelector> supportedValueSelectors = Arrays
 			.asList(RFXComValueSelector.RAW_DATA,
 					RFXComValueSelector.SIGNAL_LEVEL,
-					RFXComValueSelector.COMMAND);
+					RFXComValueSelector.COMMAND,
+					RFXComValueSelector.CONTACT);
 
 	public SubType subType = SubType.X10;
 	public char sensorId = 'A';
@@ -225,23 +226,23 @@
 
 		} else if (valueSelector.getItemClass() == ContactItem.class) {
 
-			if (valueSelector == RFXComValueSelector.COMMAND) {
+			if (valueSelector == RFXComValueSelector.CONTACT) {
 
 				switch (command) {
 				case OFF:
 				case GROUP_OFF:
 				case DIM:
-					state = OpenClosedType.OPEN;
+					state = OpenClosedType.CLOSED;
 					break;
 
 				case ON:
 				case GROUP_ON:
 				case BRIGHT:
-					state = OpenClosedType.CLOSED;
+					state = OpenClosedType.OPEN;
 					break;
 
 				case CHIME:
-					state = OpenClosedType.CLOSED;
+					state = OpenClosedType.OPEN;
 					break;
 					
 				default:
