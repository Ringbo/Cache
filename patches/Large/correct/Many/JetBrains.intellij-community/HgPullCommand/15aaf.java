diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPullCommand.java b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPullCommand.java
index 62379ea..c5d1a3f 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPullCommand.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPullCommand.java
@@ -69,7 +69,7 @@
 
     arguments.add(source);
 
-    HgCommandResult result = authenticator.executeCommandAndAuthenticateIfNecessary(project, repo, source, "pull", arguments);
+    HgCommandResult result = authenticator.executeCommandAndAuthenticateIfNecessary(project, repo, source, "pull", arguments, arguments.size()-1);
 
     project.getMessageBus().syncPublisher(HgVcs.REMOTE_TOPIC).update(project);
 
