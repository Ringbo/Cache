diff --git a/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java b/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java
index 96e3d5c..4f10735 100644
--- a/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java
+++ b/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java
@@ -64,7 +64,7 @@
                 log.debug("Error loading known hosts", e);
             }
 
-            sshClient.connect(sshHost);
+            sshClient.connect(sshHost, sshPortNum);
 
             if (privKeyFile != null) {
                 if (!CommonUtils.isEmpty(sshPassword)) {
