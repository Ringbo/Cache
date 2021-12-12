diff --git a/core/server/worker/src/main/java/alluxio/worker/netty/DataServerShortCircuitWriteHandler.java b/core/server/worker/src/main/java/alluxio/worker/netty/DataServerShortCircuitWriteHandler.java
index c91c461..aa754d7 100644
--- a/core/server/worker/src/main/java/alluxio/worker/netty/DataServerShortCircuitWriteHandler.java
+++ b/core/server/worker/src/main/java/alluxio/worker/netty/DataServerShortCircuitWriteHandler.java
@@ -38,7 +38,7 @@
   private static final Logger LOG =
       LoggerFactory.getLogger(DataServerShortCircuitWriteHandler.class);
 
-  private static long INVALID_SESSION_ID = -1;
+  private static final long INVALID_SESSION_ID = -1;
 
   /** The block worker. */
   private final BlockWorker mBlockWorker;
