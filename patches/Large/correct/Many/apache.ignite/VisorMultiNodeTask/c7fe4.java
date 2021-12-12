diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/VisorMultiNodeTask.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/VisorMultiNodeTask.java
index 29ad519..dbf1c66 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/VisorMultiNodeTask.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/VisorMultiNodeTask.java
@@ -105,7 +105,7 @@
                     map.put(job(taskArg), node);
 
             if (map.isEmpty())
-                ignite.log().error("No mapped jobs: [task=" + getClass().getName() +
+                ignite.log().warning("No mapped jobs: [task=" + getClass().getName() +
                     ", topVer=" + ignite.cluster().topologyVersion() +
                     ", jobNids=" + nodeIds +
                     ", subGrid=" + U.toShortString(subgrid) + "]");
