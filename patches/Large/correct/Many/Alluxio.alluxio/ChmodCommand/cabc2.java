diff --git a/shell/src/main/java/tachyon/shell/command/ChmodCommand.java b/shell/src/main/java/tachyon/shell/command/ChmodCommand.java
index 729bc60..55081a4 100644
--- a/shell/src/main/java/tachyon/shell/command/ChmodCommand.java
+++ b/shell/src/main/java/tachyon/shell/command/ChmodCommand.java
@@ -24,7 +24,7 @@
 /**
  * Change the permission of a file or directory specified by args.
  */
-public final class ChmodCommand extends AbstractACLCommand {
+public final class ChmodCommand extends AbstractAclCommand {
 
   public ChmodCommand(TachyonConf conf, TachyonFileSystem tfs) {
     super(conf, tfs);
