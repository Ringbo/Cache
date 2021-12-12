diff --git a/src/org/traccar/protocol/Gl200TextProtocolDecoder.java b/src/org/traccar/protocol/Gl200TextProtocolDecoder.java
index 21020ee..70627d6 100644
--- a/src/org/traccar/protocol/Gl200TextProtocolDecoder.java
+++ b/src/org/traccar/protocol/Gl200TextProtocolDecoder.java
@@ -320,7 +320,7 @@
             .number("(d{15}|x{14}),")            // imei
             .expression("[^,]*,")                // device name
             .number("d*,")
-            .number("(d{1,2}),")                 // report type
+            .number("(x{1,2}),")                 // report type
             .number("d{1,2},")                   // count
             .expression(PATTERN_LOCATION.pattern())
             .groupBegin()
@@ -966,15 +966,15 @@
             return null;
         }
 
-        int reportType = parser.nextInt();
+        int reportType = parser.nextHexInt();
         if (type.equals("NMR")) {
             position.set(Position.KEY_MOTION, reportType == 1);
         } else if (type.equals("SOS")) {
             position.set(Position.KEY_ALARM, Position.ALARM_SOS);
         } else if (type.equals("DIS")) {
-            position.set(Position.PREFIX_IN + reportType / 10, reportType % 10 == 1);
+            position.set(Position.PREFIX_IN + reportType / 0x10, reportType % 0x10 == 1);
         } else if (type.equals("IGL")) {
-            position.set(Position.KEY_IGNITION, reportType % 10 == 0);
+            position.set(Position.KEY_IGNITION, reportType % 0x10 == 0);
         }
 
         decodeLocation(position, parser);
