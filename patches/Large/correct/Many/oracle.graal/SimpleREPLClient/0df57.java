diff --git a/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/SimpleREPLClient.java b/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/SimpleREPLClient.java
index d4fa488..592edd0 100644
--- a/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/SimpleREPLClient.java
+++ b/truffle/com.oracle.truffle.tools.debug.shell/src/com/oracle/truffle/tools/debug/shell/client/SimpleREPLClient.java
@@ -260,7 +260,7 @@
         /**
          * Create a new context on the occasion of an execution halting.
          */
-        public ClientContextImpl(ClientContextImpl predecessor, REPLMessage message) {
+        ClientContextImpl(ClientContextImpl predecessor, REPLMessage message) {
             this.predecessor = predecessor;
             this.level = predecessor == null ? 0 : predecessor.level + 1;
 
@@ -696,7 +696,7 @@
      */
     private abstract class REPLLocalCommand extends REPLCommand {
 
-        public REPLLocalCommand(String command, String abbreviation, String description) {
+        REPLLocalCommand(String command, String abbreviation, String description) {
             super(command, abbreviation, description);
         }
 
@@ -708,7 +708,7 @@
      */
     private abstract class REPLIndirectCommand extends REPLCommand {
 
-        public REPLIndirectCommand(String command, String abbreviation, String description) {
+        REPLIndirectCommand(String command, String abbreviation, String description) {
             super(command, abbreviation, description);
         }
 
@@ -1350,7 +1350,7 @@
 
         private Boolean value;
 
-        public BooleanOption(boolean value, String name, String description) {
+        BooleanOption(boolean value, String name, String description) {
             super(name, description);
             this.value = value;
         }
@@ -1380,7 +1380,7 @@
 
         private Integer value;
 
-        public IntegerOption(int value, String name, String description) {
+        IntegerOption(int value, String name, String description) {
             super(name, description);
             this.value = value;
         }
