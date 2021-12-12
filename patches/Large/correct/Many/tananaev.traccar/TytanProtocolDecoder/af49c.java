diff --git a/src/org/traccar/protocol/TytanProtocolDecoder.java b/src/org/traccar/protocol/TytanProtocolDecoder.java
index e671041..3cc0d05 100644
--- a/src/org/traccar/protocol/TytanProtocolDecoder.java
+++ b/src/org/traccar/protocol/TytanProtocolDecoder.java
@@ -115,7 +115,7 @@
 
                 switch (type) {
                     case 2:
-                        position.set(Event.KEY_ODOMETER, buf.readUnsignedMedium() * 5);
+                        position.set(Event.KEY_ODOMETER, buf.readUnsignedMedium());
                         break;
                     case 5:
                         position.set(Event.KEY_INPUT, buf.readUnsignedByte());
@@ -179,15 +179,15 @@
                     case 107:
                         {
                             int fuel = buf.readUnsignedShort();
-                            switch (fuel >> 16) {
+                            switch (fuel >> 14) {
                                 case 1:
-                                    position.set(Event.KEY_FUEL, (buf.readUnsignedShort() & 0x3fff) * 0.4 + "%");
+                                    position.set(Event.KEY_FUEL, (fuel & 0x3fff) * 0.4 + "%");
                                     break;
                                 case 2:
-                                    position.set(Event.KEY_FUEL, (buf.readUnsignedShort() & 0x3fff) * 0.5 + "l");
+                                    position.set(Event.KEY_FUEL, (fuel & 0x3fff) * 0.5 + " l");
                                     break;
                                 case 3:
-                                    position.set(Event.KEY_FUEL, (buf.readUnsignedShort() & 0x3fff) * -0.5 + "l");
+                                    position.set(Event.KEY_FUEL, (fuel & 0x3fff) * -0.5 + " l");
                                     break;
                             }
                         }
