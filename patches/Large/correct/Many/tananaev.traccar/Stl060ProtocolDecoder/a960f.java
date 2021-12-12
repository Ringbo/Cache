diff --git a/src/org/traccar/protocol/Stl060ProtocolDecoder.java b/src/org/traccar/protocol/Stl060ProtocolDecoder.java
index 29bc558..2ffb8b9 100644
--- a/src/org/traccar/protocol/Stl060ProtocolDecoder.java
+++ b/src/org/traccar/protocol/Stl060ProtocolDecoder.java
@@ -34,24 +34,22 @@
     }
 
     private static final Pattern pattern = Pattern.compile(
-            "\\$1," +
+            ".*\\$1," +
             "(\\d+)," +                         // IMEI
             "D001," +                           // Type
             "[^,]*," +                          // Vehicle
             "(\\d{2})/(\\d{2})/(\\d{2})," +     // Date
             "(\\d{2}):(\\d{2}):(\\d{2})," +     // Time
-            "(\\d+)(\\d{2}\\.\\d+)" +           // Latitude
-            "([NS])," +
-            "(\\d+)(\\d{2}\\.\\d+)" +           // Longitude
-            "([EW])," +
-            "(\\d+)," +                         // Speed
-            "(\\d+)," +                         // Course
+            "(\\d{2})(\\d+)([NS])," +           // Latitude
+            "(\\d{3})(\\d+)([EW])," +           // Longitude
+            "(\\d+\\.?\\d*)," +                 // Speed
+            "(\\d+\\.?\\d*)," +                 // Course
             "(\\d+)," +                         // Milage
             "(\\d+)," +                         // Ignition
             "(\\d+)," +                         // DIP1
             "(\\d+)," +                         // DIP2
             "(\\d+)," +                         // Fuel
-            "([AV])," +                         // Validity
+            "([AV])" +                          // Validity
             ".*");
 
     @Override
@@ -97,13 +95,13 @@
 
         // Latitude
         Double latitude = Double.valueOf(parser.group(index++));
-        latitude += Double.valueOf(parser.group(index++)) / 60;
+        latitude += Double.valueOf(parser.group(index++)) / 600000;
         if (parser.group(index++).compareTo("S") == 0) latitude = -latitude;
         position.setLatitude(latitude);
 
         // Longitude
         Double longitude = Double.valueOf(parser.group(index++));
-        longitude += Double.valueOf(parser.group(index++)) / 60;
+        longitude += Double.valueOf(parser.group(index++)) / 600000;
         if (parser.group(index++).compareTo("W") == 0) longitude = -longitude;
         position.setLongitude(longitude);
         
