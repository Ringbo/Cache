diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPushCommand.java b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPushCommand.java
index 3ae51ac..8a80c2c 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPushCommand.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgPushCommand.java
@@ -65,7 +65,7 @@
     }
     arguments.add(myDestination);
 
-    final HgCommandResult result = authenticator.executeCommandAndAuthenticateIfNecessary(myProject, myRepo, myDestination, "push", arguments);
+    final HgCommandResult result = authenticator.executeCommandAndAuthenticateIfNecessary(myProject, myRepo, myDestination, "push", arguments, arguments.size()-1);
     myProject.getMessageBus().syncPublisher(HgVcs.REMOTE_TOPIC).update(myProject);
     return result;
   }
