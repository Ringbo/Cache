diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/ApplicationCLI.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/ApplicationCLI.java
index 9b465b7..d520866 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/ApplicationCLI.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/cli/ApplicationCLI.java
@@ -197,7 +197,7 @@
         listApplications(appTypes, appStates);
       }
     } else if (cliParser.hasOption(KILL_CMD)) {
-      if (args.length != 2) {
+      if (args.length != 3) {
         printUsage(opts);
         return exitCode;
       }
