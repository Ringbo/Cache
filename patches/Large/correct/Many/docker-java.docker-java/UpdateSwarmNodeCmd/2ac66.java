diff --git a/src/main/java/com/github/dockerjava/api/command/UpdateSwarmNodeCmd.java b/src/main/java/com/github/dockerjava/api/command/UpdateSwarmNodeCmd.java
index bdcd403..604e85e 100644
--- a/src/main/java/com/github/dockerjava/api/command/UpdateSwarmNodeCmd.java
+++ b/src/main/java/com/github/dockerjava/api/command/UpdateSwarmNodeCmd.java
@@ -23,10 +23,10 @@
 
     UpdateSwarmNodeCmd withSwarmNodeSpec(SwarmNodeSpec swarmNodeSpec);
 
-    UpdateSwarmNodeCmd withVersion(@Nonnull Integer versionId);
+    UpdateSwarmNodeCmd withVersion(@Nonnull Long versionId);
 
     @CheckForNull
-    Integer getVersion();
+    Long getVersion();
 
     interface Exec extends DockerCmdSyncExec<UpdateSwarmNodeCmd, Void> {
     }
