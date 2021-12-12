diff --git a/src/com/facebook/buck/js/ReactNativeLibraryGraphEnhancer.java b/src/com/facebook/buck/js/ReactNativeLibraryGraphEnhancer.java
index fe8719e..4357d2e 100644
--- a/src/com/facebook/buck/js/ReactNativeLibraryGraphEnhancer.java
+++ b/src/com/facebook/buck/js/ReactNativeLibraryGraphEnhancer.java
@@ -107,7 +107,8 @@
               BuildTarget.builder(originalBuildTarget)
                   .addFlavors(REACT_NATIVE_ANDROID_RES_FLAVOR)
                   .build())
-              .copyWithExtraDeps(Suppliers.ofInstance(ImmutableSortedSet.<BuildRule>of(bundle)));
+              .copyWithExtraDeps(Suppliers.ofInstance(
+                      ImmutableSortedSet.<BuildRule>of(bundle, reactNativeDeps)));
 
       BuildRule resource = new AndroidResource(
               paramsForResource,
