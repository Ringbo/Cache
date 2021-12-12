diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnCommandLineInfoClient.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnCommandLineInfoClient.java
index ef48226..8bbb582 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnCommandLineInfoClient.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnCommandLineInfoClient.java
@@ -195,7 +195,7 @@
     }
   }
 
-  private void fillParameters(String path, SVNRevision pegRevision, SVNRevision revision, SVNDepth depth, List<String> parameters) {
+  private static void fillParameters(String path, SVNRevision pegRevision, SVNRevision revision, SVNDepth depth, List<String> parameters) {
     CommandUtil.put(parameters, depth);
     CommandUtil.put(parameters, revision);
     CommandUtil.put(parameters, path, pegRevision);
@@ -261,7 +261,7 @@
       for (File file : paths) {
         CommandUtil.put(parameters, file);
       }
-      CommandUtil.put(parameters, true, "--xml");
+      parameters.add("--xml");
 
       // Currently do not handle exceptions here like in SvnVcs.handleInfoException - just continue with parsing in case of warnings for
       // some of the requested items
