diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearLockRequest.java b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearLockRequest.java
index eb4ca88..d0086ba 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearLockRequest.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearLockRequest.java
@@ -452,7 +452,7 @@
                 commState.idx++;
 
             case 34:
-                if (!commState.putBoolean(syncCommit))
+                if (!commState.putBoolean("syncCommit", syncCommit))
                     return false;
 
                 commState.idx++;
@@ -600,7 +600,7 @@
                 if (buf.remaining() < 1)
                     return false;
 
-                syncCommit = commState.getBoolean();
+                syncCommit = commState.getBoolean("syncCommit");
 
                 commState.idx++;
         }
