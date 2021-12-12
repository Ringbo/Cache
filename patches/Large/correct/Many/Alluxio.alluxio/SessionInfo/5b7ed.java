diff --git a/core/server/worker/src/main/java/alluxio/SessionInfo.java b/core/server/worker/src/main/java/alluxio/SessionInfo.java
index 51a2fa5..11432aa 100644
--- a/core/server/worker/src/main/java/alluxio/SessionInfo.java
+++ b/core/server/worker/src/main/java/alluxio/SessionInfo.java
@@ -24,7 +24,7 @@
   private final long mSessionId;
 
   private long mLastHeartbeatMs;
-  private int mSessionTimeoutMs;
+  private final int mSessionTimeoutMs;
 
   /**
    * Creates a new instance of {@link SessionInfo}.
