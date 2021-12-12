diff --git a/shell/src/main/java/tachyon/shell/command/ChownCommand.java b/shell/src/main/java/tachyon/shell/command/ChownCommand.java
index 375c5fa..376c77e 100644
--- a/shell/src/main/java/tachyon/shell/command/ChownCommand.java
+++ b/shell/src/main/java/tachyon/shell/command/ChownCommand.java
@@ -24,7 +24,7 @@
 /**
  * Changes the owner of a file or directory specified by args.
  */
-public final class ChownCommand extends AbstractACLCommand {
+public final class ChownCommand extends AbstractAclCommand {
 
   public ChownCommand(TachyonConf conf, TachyonFileSystem tfs) {
     super(conf, tfs);
