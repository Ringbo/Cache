diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxFinishRequest.java b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxFinishRequest.java
index c478b6e..147001c 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxFinishRequest.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxFinishRequest.java
@@ -500,7 +500,7 @@
                 commState.idx++;
 
             case 20:
-                if (!commState.putBoolean(sys))
+                if (!commState.putBoolean("sys", sys))
                     return false;
 
                 commState.idx++;
@@ -668,7 +668,7 @@
                 if (buf.remaining() < 1)
                     return false;
 
-                sys = commState.getBoolean();
+                sys = commState.getBoolean("sys");
 
                 commState.idx++;
         }
