diff --git a/core/server/worker/src/main/java/alluxio/worker/netty/DataServerReadHandler.java b/core/server/worker/src/main/java/alluxio/worker/netty/DataServerReadHandler.java
index 97a07fa..195d89a 100644
--- a/core/server/worker/src/main/java/alluxio/worker/netty/DataServerReadHandler.java
+++ b/core/server/worker/src/main/java/alluxio/worker/netty/DataServerReadHandler.java
@@ -393,7 +393,7 @@
     @GuardedBy("mLock")
     private boolean shouldRestartPacketReader() {
       return !mPacketReaderActive && !tooManyPendingPackets() && mPosToQueue < mRequest.mEnd
-          && mError != null && !mCancel && !mEof;
+          && mError == null && !mCancel && !mEof;
     }
   }
 
