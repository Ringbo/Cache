diff --git a/src/org/traccar/protocol/SuntechProtocolEncoder.java b/src/org/traccar/protocol/SuntechProtocolEncoder.java
index e636375..86c07c7 100644
--- a/src/org/traccar/protocol/SuntechProtocolEncoder.java
+++ b/src/org/traccar/protocol/SuntechProtocolEncoder.java
@@ -30,7 +30,7 @@
             case Command.TYPE_POSITION_SINGLE:
                 return formatCommand(command, "SA200GTR;{%s};02;\r", Command.KEY_UNIQUE_ID);
             case Command.TYPE_OUTPUT_CONTROL:
-                return formatCommand(command, "SA200CMD;{%s};0{%s};Enable{%s}\r", Command.KEY_UNIQUE_ID, Command.KEY_DATA);
+                return formatCommand(command, "SA200CMD;{%s};0{%s};Enable{%s}\r", Command.KEY_UNIQUE_ID, Command.KEY_DATA, Command.KEY_DATA);
             case Command.TYPE_ENGINE_STOP:
                 return formatCommand(command, "SA200CMD;{%s};02;Enable1\r", Command.KEY_UNIQUE_ID);
             case Command.TYPE_ENGINE_RESUME:
