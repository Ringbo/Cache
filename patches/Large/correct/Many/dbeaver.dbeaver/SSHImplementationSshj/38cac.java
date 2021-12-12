diff --git a/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java b/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java
index 1aa388a..ae16146 100644
--- a/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java
+++ b/plugins/org.jkiss.dbeaver.net.ssh.sshj/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationSshj.java
@@ -61,7 +61,7 @@
             try {
                 sshClient.loadKnownHosts();
             } catch (IOException e) {
-                log.warn("Error loading known hosts", e);
+                log.debug("Error loading known hosts", e);
             }
 
             sshClient.connect(sshHost);
