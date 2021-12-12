diff --git a/fabric/fabric-git/src/main/java/io/fabric8/git/internal/DefaultPullPushPolicy.java b/fabric/fabric-git/src/main/java/io/fabric8/git/internal/DefaultPullPushPolicy.java
index 67c8eea..883049b 100644
--- a/fabric/fabric-git/src/main/java/io/fabric8/git/internal/DefaultPullPushPolicy.java
+++ b/fabric/fabric-git/src/main/java/io/fabric8/git/internal/DefaultPullPushPolicy.java
@@ -212,10 +212,10 @@
         LOGGER.info("Pushing last change to: {}", remoteUrl);
         
         Iterator<PushResult> resit = null;
-        GitAPIException lastException = null;
+        Exception lastException = null;
         try {
             resit = git.push().setTimeout(gitTimeout).setCredentialsProvider(credentialsProvider).setPushAll().call().iterator();
-        } catch (GitAPIException ex) {
+        } catch (GitAPIException | JGitInternalException ex) {
             lastException = ex;
         }
         
