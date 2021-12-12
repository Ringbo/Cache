diff --git a/shell/src/main/java/tachyon/shell/command/ChgrpCommand.java b/shell/src/main/java/tachyon/shell/command/ChgrpCommand.java
index 09cac71..0c2afd1 100644
--- a/shell/src/main/java/tachyon/shell/command/ChgrpCommand.java
+++ b/shell/src/main/java/tachyon/shell/command/ChgrpCommand.java
@@ -24,7 +24,7 @@
 /**
  * Changes the group of a file or directory specified by args.
  */
-public final class ChgrpCommand extends AbstractACLCommand {
+public final class ChgrpCommand extends AbstractAclCommand {
 
   public ChgrpCommand(TachyonConf conf, TachyonFileSystem tfs) {
     super(conf, tfs);
