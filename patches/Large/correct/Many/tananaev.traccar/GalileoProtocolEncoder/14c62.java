diff --git a/src/org/traccar/protocol/GalileoProtocolEncoder.java b/src/org/traccar/protocol/GalileoProtocolEncoder.java
index 2890d0c..cb6028a 100644
--- a/src/org/traccar/protocol/GalileoProtocolEncoder.java
+++ b/src/org/traccar/protocol/GalileoProtocolEncoder.java
@@ -57,9 +57,9 @@
 
         switch (command.getType()) {
             case Command.TYPE_CUSTOM:
-                return encodeText(getUniqueId(command.getId()), command.getString(Command.KEY_DATA));
+                return encodeText(getUniqueId(command.getDeviceId()), command.getString(Command.KEY_DATA));
             case Command.TYPE_OUTPUT_CONTROL:
-                return encodeText(getUniqueId(command.getId()),
+                return encodeText(getUniqueId(command.getDeviceId()),
                         "Out " + command.getInteger(Command.KEY_INDEX) + "," + command.getString(Command.KEY_DATA));
             default:
                 Log.warning(new UnsupportedOperationException(command.getType()));
