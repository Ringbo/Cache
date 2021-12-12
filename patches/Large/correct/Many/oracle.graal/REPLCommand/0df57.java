diff --git a/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/REPLCommand.java b/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/REPLCommand.java
index 386416a..0723bf9 100644
--- a/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/REPLCommand.java
+++ b/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/REPLCommand.java
@@ -31,7 +31,7 @@
     private final String abbreviation;
     private final String description;
 
-    public REPLCommand(String command, String abbreviation, String description) {
+    REPLCommand(String command, String abbreviation, String description) {
         this.command = command;
         this.abbreviation = abbreviation;
         this.description = description;
