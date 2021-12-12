diff --git a/src/main/java/com/github/dockerjava/core/command/UpdateSwarmNodeCmdImpl.java b/src/main/java/com/github/dockerjava/core/command/UpdateSwarmNodeCmdImpl.java
index dfde7eb..2785996 100644
--- a/src/main/java/com/github/dockerjava/core/command/UpdateSwarmNodeCmdImpl.java
+++ b/src/main/java/com/github/dockerjava/core/command/UpdateSwarmNodeCmdImpl.java
@@ -24,7 +24,7 @@
 
     private SwarmNodeSpec swarmNodeSpec;
 
-    private Integer version;
+    private Long version;
 
     public UpdateSwarmNodeCmdImpl(Exec exec) {
         super(exec);
@@ -69,14 +69,14 @@
     }
 
     @Override
-    public UpdateSwarmNodeCmd withVersion(@Nonnull Integer versionId) {
+    public UpdateSwarmNodeCmd withVersion(@Nonnull Long versionId) {
         this.version = versionId;
         return this;
     }
 
     @CheckForNull
     @Override
-    public Integer getVersion() {
+    public Long getVersion() {
         return version;
     }
 
