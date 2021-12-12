diff --git a/aeron-cluster/src/main/java/io/aeron/cluster/ConsensusModule.java b/aeron-cluster/src/main/java/io/aeron/cluster/ConsensusModule.java
index ad28d36..5287c01 100644
--- a/aeron-cluster/src/main/java/io/aeron/cluster/ConsensusModule.java
+++ b/aeron-cluster/src/main/java/io/aeron/cluster/ConsensusModule.java
@@ -363,7 +363,7 @@
          */
         public int maxActiveSessions()
         {
-            return ingressStreamId;
+            return maxActiveSessions;
         }
 
         /**
