diff --git a/shell/src/main/java/tachyon/shell/command/ChownRecursiveCommand.java b/shell/src/main/java/tachyon/shell/command/ChownRecursiveCommand.java
index 9556ff5..c2c8b29 100644
--- a/shell/src/main/java/tachyon/shell/command/ChownRecursiveCommand.java
+++ b/shell/src/main/java/tachyon/shell/command/ChownRecursiveCommand.java
@@ -24,7 +24,7 @@
 /**
  * Changes the owner of a file or directory specified by args recursively.
  */
-public final class ChownRecursiveCommand extends AbstractACLCommand {
+public final class ChownRecursiveCommand extends AbstractAclCommand {
 
   public ChownRecursiveCommand(TachyonConf conf, TachyonFileSystem tfs) {
     super(conf, tfs);
