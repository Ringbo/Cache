diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java b/modules/core/src/main/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java
index c4d2d39..5efa03b 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/managers/discovery/GridDiscoveryManager.java
@@ -650,7 +650,7 @@
 
             List<GridBiTuple<String, String>> diffs = GridLibraryConsistencyCheck.check(log, locLibs, rmtLibs);
 
-            if (!diffs.isEmpty()) {
+            if (!F.isEmpty(diffs)) {
                 if (log.isQuiet()) {
                     U.quiet(true, "Local node's library list differs from remote node's");
 
