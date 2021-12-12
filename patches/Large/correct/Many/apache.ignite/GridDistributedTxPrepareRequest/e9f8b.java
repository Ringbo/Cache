diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxPrepareRequest.java b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxPrepareRequest.java
index 840383a..1cc7219 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxPrepareRequest.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/distributed/GridDistributedTxPrepareRequest.java
@@ -567,7 +567,7 @@
                 commState.idx++;
 
             case 21:
-                if (!commState.putBoolean(sys))
+                if (!commState.putBoolean("sys", sys))
                     return false;
 
                 commState.idx++;
@@ -747,7 +747,7 @@
                 if (buf.remaining() < 1)
                     return false;
 
-                sys = commState.getBoolean();
+                sys = commState.getBoolean("sys");
 
                 commState.idx++;
         }
