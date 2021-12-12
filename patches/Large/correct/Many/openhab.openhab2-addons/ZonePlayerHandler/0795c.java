diff --git a/addons/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/handler/ZonePlayerHandler.java b/addons/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/handler/ZonePlayerHandler.java
index 843d7ee..708f305 100644
--- a/addons/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/handler/ZonePlayerHandler.java
+++ b/addons/binding/org.openhab.binding.sonos/src/main/java/org/openhab/binding/sonos/handler/ZonePlayerHandler.java
@@ -643,7 +643,7 @@
 						List<String> fields = SonosXMLParser
 								.getRadioTimeFromXML(response);
 
-						if (fields != null) {
+						if (fields != null && fields.size() > 0) {
 
 							resultString = new String();
 							// radio name should be first field
