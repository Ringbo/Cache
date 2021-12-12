diff --git a/storm-core/src/jvm/backtype/storm/task/ShellBolt.java b/storm-core/src/jvm/backtype/storm/task/ShellBolt.java
index 946f037..eb9e714 100644
--- a/storm-core/src/jvm/backtype/storm/task/ShellBolt.java
+++ b/storm-core/src/jvm/backtype/storm/task/ShellBolt.java
@@ -116,7 +116,7 @@
 
                         String command = shellMsg.getCommand();
                         if (command == null) {
-                            throw new UnsupportedOperationException("Command not found in bolt message: " + shellMsg);
+                            throw new IllegalArgumentException("Command not found in bolt message: " + shellMsg);
                         }
                         if(command.equals("ack")) {
                             handleAck(shellMsg.getId());
