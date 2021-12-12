diff --git a/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java b/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
index 2076385..827c3ee 100644
--- a/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
+++ b/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
@@ -283,7 +283,7 @@
         // todo: why do we start counting levels with 1 ??
         int level = 1;
         long counter = 0;
-        long logSize = Math.round(Math.max(10, initSize / 100 * logMessagesPercentage));
+        long logSize = Math.round(Math.max(10, initSize / 100d * logMessagesPercentage));
         if (logMessagesPercentage == 0)
             logSize = Integer.MAX_VALUE;
 
@@ -302,7 +302,7 @@
 
         // according to paper "Polynomial-time Construction of Contraction Hierarchies for Multi-criteria Objectives" by Funke and Storandt
         // we don't need to wait for all nodes to be contracted
-        long nodesToAvoidContract = Math.round((100 - nodesContractedPercentage) / 100 * sortedNodes.getSize());
+        long nodesToAvoidContract = Math.round((100 - nodesContractedPercentage) / 100d * sortedNodes.getSize());
         StopWatch lazySW = new StopWatch();
 
         // Recompute priority of uncontracted neighbors.
