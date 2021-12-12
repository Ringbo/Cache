diff --git a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/docker/DockerImpl.java b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/docker/DockerImpl.java
index 1fcc94c..9ec2bfd 100644
--- a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/docker/DockerImpl.java
+++ b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/docker/DockerImpl.java
@@ -262,7 +262,7 @@
             return new ProcessResult(exitCode, new String(output.toByteArray()));
         } catch (DockerException | InterruptedException e) {
             throw new RuntimeException("Container " + containerName.asString()
-                    + " failed to execute " + Arrays.toString(args));
+                    + " failed to execute " + Arrays.toString(args), e);
         }
     }
 
