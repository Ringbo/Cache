diff --git a/hbase-client/src/main/java/org/apache/hadoop/hbase/ipc/AsyncRpcChannel.java b/hbase-client/src/main/java/org/apache/hadoop/hbase/ipc/AsyncRpcChannel.java
index ffb2dcf..b3e01f3 100644
--- a/hbase-client/src/main/java/org/apache/hadoop/hbase/ipc/AsyncRpcChannel.java
+++ b/hbase-client/src/main/java/org/apache/hadoop/hbase/ipc/AsyncRpcChannel.java
@@ -607,7 +607,7 @@
     }
     for (AsyncCall call : toCleanup) {
       call.setFailed(new CallTimeoutException("Call id=" + call.id + ", waitTime="
-          + (currentTime - call.getRpcTimeout()) + ", rpcTimeout=" + call.getRpcTimeout()));
+          + (currentTime - call.getStartTime()) + ", rpcTimeout=" + call.getRpcTimeout()));
     }
   }
 
