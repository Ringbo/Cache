diff --git a/wsagent/che-core-git-impl-jgit/src/test/java/org/eclipse/che/git/impl/jgit/JGitConnectionTest.java b/wsagent/che-core-git-impl-jgit/src/test/java/org/eclipse/che/git/impl/jgit/JGitConnectionTest.java
index f48c9d7..bc8b7e4 100644
--- a/wsagent/che-core-git-impl-jgit/src/test/java/org/eclipse/che/git/impl/jgit/JGitConnectionTest.java
+++ b/wsagent/che-core-git-impl-jgit/src/test/java/org/eclipse/che/git/impl/jgit/JGitConnectionTest.java
@@ -122,7 +122,7 @@
         }).when(transportCommand).setTransportConfigCallback(any());
 
         //when
-        jGitConnection.executeRemoteCommand("ssh://host.xz/repo.git", transportCommand);
+        jGitConnection.executeRemoteCommand("ssh://host.xz/repo.git", transportCommand, null);
 
         //then
         verify(sshTransport).setSshSessionFactory(any());
@@ -140,7 +140,7 @@
         }).when(transportCommand).setTransportConfigCallback(any());
 
         //when
-        jGitConnection.executeRemoteCommand("ssh://host.xz/repo.git", transportCommand);
+        jGitConnection.executeRemoteCommand("ssh://host.xz/repo.git", transportCommand, null);
 
         //then
         verifyZeroInteractions(transportHttp);
