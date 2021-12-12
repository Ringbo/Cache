diff --git a/src/org/traccar/protocol/DmtHttpProtocolDecoder.java b/src/org/traccar/protocol/DmtHttpProtocolDecoder.java
index 4592bdd..1bd808a 100644
--- a/src/org/traccar/protocol/DmtHttpProtocolDecoder.java
+++ b/src/org/traccar/protocol/DmtHttpProtocolDecoder.java
@@ -95,7 +95,7 @@
                     case 0:
                         position.setFixTime(dateFormat.parse(field.getString("GpsUTC")));
                         position.setLatitude(field.getJsonNumber("Lat").doubleValue());
-                        position.setLatitude(field.getJsonNumber("Long").doubleValue());
+                        position.setLongitude(field.getJsonNumber("Long").doubleValue());
                         position.setAltitude(field.getInt("Alt"));
                         position.setSpeed(UnitsConverter.knotsFromCps(field.getInt("Spd")));
                         position.setCourse(field.getInt("Head"));
