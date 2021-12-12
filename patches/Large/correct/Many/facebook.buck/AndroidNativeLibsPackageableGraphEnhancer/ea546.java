diff --git a/src/com/facebook/buck/android/AndroidNativeLibsPackageableGraphEnhancer.java b/src/com/facebook/buck/android/AndroidNativeLibsPackageableGraphEnhancer.java
index ee61aa7..72baffb 100644
--- a/src/com/facebook/buck/android/AndroidNativeLibsPackageableGraphEnhancer.java
+++ b/src/com/facebook/buck/android/AndroidNativeLibsPackageableGraphEnhancer.java
@@ -112,7 +112,9 @@
     ImmutableSet<NdkCxxPlatforms.TargetCpuType> filters =
         cpuFilters.isEmpty() ? nativePlatforms.keySet() : cpuFilters;
     for (NdkCxxPlatforms.TargetCpuType targetCpuType : filters) {
-      NdkCxxPlatform platform = Preconditions.checkNotNull(nativePlatforms.get(targetCpuType));
+      NdkCxxPlatform platform = Preconditions.checkNotNull(
+          nativePlatforms.get(targetCpuType),
+          "Unknown platform type " + targetCpuType.toString());
 
       // Populate nativeLinkableLibs and nativeLinkableLibsAssets with the appropriate entries.
       boolean hasNativeLibs = populateMapWithLinkables(
