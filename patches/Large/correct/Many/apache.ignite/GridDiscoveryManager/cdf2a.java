diff --git a/modules/core/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java b/modules/core/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java
index 0e62c1e..3ce7edd 100644
--- a/modules/core/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java
+++ b/modules/core/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java
@@ -658,7 +658,7 @@
 
             List<GridBiTuple<String, String>> diffs = GridLibraryConsistencyCheck.check(log, locLibs, rmtLibs);
 
-            if (!diffs.isEmpty()) {
+            if (!F.isEmpty(diffs)) {
                 if (log.isQuiet()) {
                     U.quiet(true, "Local node's library list differs from remote node's");
 
