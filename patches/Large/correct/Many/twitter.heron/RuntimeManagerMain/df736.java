diff --git a/heron/scheduler-core/src/java/com/twitter/heron/scheduler/RuntimeManagerMain.java b/heron/scheduler-core/src/java/com/twitter/heron/scheduler/RuntimeManagerMain.java
index d0bcf29..0b782e6 100644
--- a/heron/scheduler-core/src/java/com/twitter/heron/scheduler/RuntimeManagerMain.java
+++ b/heron/scheduler-core/src/java/com/twitter/heron/scheduler/RuntimeManagerMain.java
@@ -262,12 +262,12 @@
   private final Config config;
   // holds all runtime Config
   private Config runtime;
-  // command to manange a topology
+  // command to manage a topology
   private final Command command;
 
   public RuntimeManagerMain(
       Config config,
-      Command command) throws IOException {
+      Command command) {
     // initialize the options
     this.config = config;
     this.command = command;
