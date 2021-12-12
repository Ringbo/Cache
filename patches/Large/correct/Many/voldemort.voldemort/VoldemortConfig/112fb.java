diff --git a/src/java/voldemort/server/VoldemortConfig.java b/src/java/voldemort/server/VoldemortConfig.java
index b95f800..0656130 100644
--- a/src/java/voldemort/server/VoldemortConfig.java
+++ b/src/java/voldemort/server/VoldemortConfig.java
@@ -172,7 +172,7 @@
         this.coreThreads = props.getInt("core.threads", Math.max(1, maxThreads / 2));
 
         this.adminMaxThreads = props.getInt("admin.max.threads", 100);
-        this.adminCoreThreads = props.getInt("admin.core.threads", Math.max(1, maxThreads / 2));
+        this.adminCoreThreads = props.getInt("admin.core.threads", Math.max(1, adminMaxThreads / 2));
         this.adminStreamBufferSize = (int) props.getBytes("admin.streams.buffer.size",
                                                           10 * 1000 * 1000);
 
