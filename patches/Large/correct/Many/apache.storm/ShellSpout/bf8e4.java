diff --git a/storm-core/src/jvm/backtype/storm/spout/ShellSpout.java b/storm-core/src/jvm/backtype/storm/spout/ShellSpout.java
index e3865fc..89502ed 100644
--- a/storm-core/src/jvm/backtype/storm/spout/ShellSpout.java
+++ b/storm-core/src/jvm/backtype/storm/spout/ShellSpout.java
@@ -129,7 +129,7 @@
                 ShellMsg shellMsg = _process.readShellMsg();
                 String command = shellMsg.getCommand();
                 if (command == null) {
-                    throw new UnsupportedOperationException("Command not found in spout message: " + shellMsg);
+                    throw new IllegalArgumentException("Command not found in spout message: " + shellMsg);
                 }
                 if (command.equals("sync")) {
                     return;
