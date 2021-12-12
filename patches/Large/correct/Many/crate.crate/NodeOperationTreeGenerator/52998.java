diff --git a/sql/src/main/java/io/crate/executor/transport/NodeOperationTreeGenerator.java b/sql/src/main/java/io/crate/executor/transport/NodeOperationTreeGenerator.java
index 26c21ab..3cbb805 100644
--- a/sql/src/main/java/io/crate/executor/transport/NodeOperationTreeGenerator.java
+++ b/sql/src/main/java/io/crate/executor/transport/NodeOperationTreeGenerator.java
@@ -169,7 +169,7 @@
             if (executionPhase instanceof UpstreamPhase &&
                 ((UpstreamPhase) executionPhase).distributionInfo().distributionType() ==
                 DistributionType.SAME_NODE) {
-                return downstreamNodes.isEmpty() || downstreamNodes.equals(executionPhase.nodeIds());
+                return downstreamNodes.isEmpty() || downstreamNodes.containsAll(executionPhase.nodeIds());
             }
             return true;
         }
