diff --git a/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java
index 0af90c1..03fc01b 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/managers/discovery/GridDiscoveryManagerAliveCacheSelfTest.java
@@ -264,7 +264,7 @@
         for (Iterator<Ignite> itr = toRmv.iterator(); itr.hasNext(); ) {
             Ignite g = itr.next();
 
-            if (g.cluster().node().isClient()) {
+            if (g.cluster().localNode().isClient()) {
                 G.stop(g.name(), false);
 
                 itr.remove();
