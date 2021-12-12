diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/info/CmdInfoClient.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/info/CmdInfoClient.java
index 91eb7ce..0077bd3 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/info/CmdInfoClient.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/info/CmdInfoClient.java
@@ -172,7 +172,9 @@
 
   @Override
   public Info doInfo(SVNURL url, SVNRevision pegRevision, SVNRevision revision) throws SvnBindException {
-    CommandExecutor command = execute(myVcs, SvnTarget.fromURL(url), SvnCommandName.info, buildParameters(url.toDecodedString(), pegRevision, revision, Depth.EMPTY), null);
+    CommandExecutor command =
+      execute(myVcs, SvnTarget.fromURL(url), SvnCommandName.info, buildParameters(url.toString(), pegRevision, revision, Depth.EMPTY),
+              null);
 
     return parseResult(null, command.getOutput());
   }
