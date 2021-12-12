diff --git a/shell/src/main/java/alluxio/cli/fs/command/LoadCommand.java b/shell/src/main/java/alluxio/cli/fs/command/LoadCommand.java
index e22c60b..70c922a 100644
--- a/shell/src/main/java/alluxio/cli/fs/command/LoadCommand.java
+++ b/shell/src/main/java/alluxio/cli/fs/command/LoadCommand.java
@@ -68,7 +68,7 @@
 
   @Override
   protected void runCommand(AlluxioURI path, CommandLine cl) throws AlluxioException, IOException {
-    load(path, cl.hasOption(LOCAL_OPTION.getOpt()));
+    load(path, cl.hasOption(LOCAL_OPTION.getLongOpt()));
   }
 
   /**
