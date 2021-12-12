diff --git a/plugins/plugin-ssh-machine/src/main/java/org/eclipse/che/plugin/machine/ssh/jsch/JschSshClient.java b/plugins/plugin-ssh-machine/src/main/java/org/eclipse/che/plugin/machine/ssh/jsch/JschSshClient.java
index db392ae..d1e0111 100644
--- a/plugins/plugin-ssh-machine/src/main/java/org/eclipse/che/plugin/machine/ssh/jsch/JschSshClient.java
+++ b/plugins/plugin-ssh-machine/src/main/java/org/eclipse/che/plugin/machine/ssh/jsch/JschSshClient.java
@@ -211,14 +211,14 @@
             // apply permissions
             File file = new File(sourcePath);
             // read
-            int permissions = 4;
+            int permissions = 256;
             // execute
             if (file.canExecute()) {
-                permissions += 1;
+                permissions += 64;
             }
             // write
             if (file.canWrite()) {
-                permissions += 2;
+                permissions += 128;
             }
             channelSftp.chmod(permissions, absoluteTargetPath);
         } catch (SftpException e) {
