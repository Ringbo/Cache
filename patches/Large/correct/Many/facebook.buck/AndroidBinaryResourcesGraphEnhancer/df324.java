diff --git a/src/com/facebook/buck/android/AndroidBinaryResourcesGraphEnhancer.java b/src/com/facebook/buck/android/AndroidBinaryResourcesGraphEnhancer.java
index 4534a95..12988e4 100644
--- a/src/com/facebook/buck/android/AndroidBinaryResourcesGraphEnhancer.java
+++ b/src/com/facebook/buck/android/AndroidBinaryResourcesGraphEnhancer.java
@@ -202,7 +202,7 @@
     ImmutableList.Builder<Aapt2Compile> compileListBuilder = ImmutableList.builder();
     for (BuildTarget resTarget : resourceDetails.getResourcesWithNonEmptyResDir()) {
       compileListBuilder.add((Aapt2Compile) ruleResolver.requireRule(
-          resTarget.withFlavors(AndroidResourceDescription.AAPT2_COMPILE_FLAVOR)));
+          resTarget.withAppendedFlavors(AndroidResourceDescription.AAPT2_COMPILE_FLAVOR)));
     }
     return new Aapt2Link(
         buildRuleParams
