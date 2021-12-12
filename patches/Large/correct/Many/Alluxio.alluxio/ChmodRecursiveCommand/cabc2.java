diff --git a/shell/src/main/java/tachyon/shell/command/ChmodRecursiveCommand.java b/shell/src/main/java/tachyon/shell/command/ChmodRecursiveCommand.java
index 48857c0..8d20de2 100644
--- a/shell/src/main/java/tachyon/shell/command/ChmodRecursiveCommand.java
+++ b/shell/src/main/java/tachyon/shell/command/ChmodRecursiveCommand.java
@@ -24,7 +24,7 @@
 /**
  * Change the permission of a file or directory specified by args recursively.
  */
-public final class ChmodRecursiveCommand extends AbstractACLCommand {
+public final class ChmodRecursiveCommand extends AbstractAclCommand {
 
   public ChmodRecursiveCommand(TachyonConf conf, TachyonFileSystem tfs) {
     super(conf, tfs);
