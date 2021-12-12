diff --git a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting6Message.java b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting6Message.java
index d38a574..ff402b8 100644
--- a/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting6Message.java
+++ b/bundles/binding/org.openhab.binding.rfxcom/src/main/java/org/openhab/binding/rfxcom/internal/messages/RFXComLighting6Message.java
@@ -81,7 +81,8 @@
 	private final static List<RFXComValueSelector> supportedValueSelectors = Arrays
 			.asList(RFXComValueSelector.RAW_DATA,
 					RFXComValueSelector.SIGNAL_LEVEL,
-					RFXComValueSelector.COMMAND);
+					RFXComValueSelector.COMMAND,
+					RFXComValueSelector.CONTACT);
 
 	public SubType subType = SubType.BLYSS;
 	public int sensorId = 0;
@@ -210,17 +211,17 @@
 
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
 					
 				default:
