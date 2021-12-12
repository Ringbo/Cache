diff --git a/src/org/traccar/protocol/TytanProtocolDecoder.java b/src/org/traccar/protocol/TytanProtocolDecoder.java
index f31e8ae..be9a9af 100644
--- a/src/org/traccar/protocol/TytanProtocolDecoder.java
+++ b/src/org/traccar/protocol/TytanProtocolDecoder.java
@@ -156,7 +156,7 @@
                             }
                         }
                         for (int i : temps) {
-                            position.set(Event.PREFIX_TEMP + n, buf.readUnsignedByte());
+                            position.set(Event.PREFIX_TEMP + i, buf.readUnsignedByte());
                         }
                         break;
                     case 28:
