diff --git a/storm-server/src/main/java/org/apache/storm/scheduler/resource/strategies/scheduling/BaseResourceAwareStrategy.java b/storm-server/src/main/java/org/apache/storm/scheduler/resource/strategies/scheduling/BaseResourceAwareStrategy.java
index 1132432..59b0f31 100644
--- a/storm-server/src/main/java/org/apache/storm/scheduler/resource/strategies/scheduling/BaseResourceAwareStrategy.java
+++ b/storm-server/src/main/java/org/apache/storm/scheduler/resource/strategies/scheduling/BaseResourceAwareStrategy.java
@@ -332,7 +332,7 @@
 
         private TreeSet<ObjectResources> getSortedNodesFor(String rackId) {
             return cachedNodes.computeIfAbsent(rackId,
-                (rid) -> sortNodes(rackIdToNodes.get(rid), exec, td, rid, perNodeScheduledCount));
+                (rid) -> sortNodes(rackIdToNodes.getOrDefault(rid, Collections.emptyList()), exec, td, rid, perNodeScheduledCount));
         }
 
         @Override
