diff --git a/shell/src/main/java/tachyon/shell/command/ChgrpRecursiveCommand.java b/shell/src/main/java/tachyon/shell/command/ChgrpRecursiveCommand.java
index ff02b6c..172357f 100644
--- a/shell/src/main/java/tachyon/shell/command/ChgrpRecursiveCommand.java
+++ b/shell/src/main/java/tachyon/shell/command/ChgrpRecursiveCommand.java
@@ -24,7 +24,7 @@
 /**
  * Changes the group of a file or directory specified by args recursively.
  */
-public final class ChgrpRecursiveCommand extends AbstractACLCommand {
+public final class ChgrpRecursiveCommand extends AbstractAclCommand {
 
   public ChgrpRecursiveCommand(TachyonConf conf, TachyonFileSystem tfs) {
     super(conf, tfs);
