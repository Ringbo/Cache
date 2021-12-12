diff --git a/src/com/facebook/buck/apple/AppleBuildRules.java b/src/com/facebook/buck/apple/AppleBuildRules.java
index 54ef772..d244c8d 100644
--- a/src/com/facebook/buck/apple/AppleBuildRules.java
+++ b/src/com/facebook/buck/apple/AppleBuildRules.java
@@ -53,7 +53,8 @@
               AppleBinaryDescription.class,
               AppleBundleDescription.class,
               AppleTestDescription.class,
-              HalideLibraryDescription.class);
+              HalideLibraryDescription.class,
+              SwiftLibraryDescription.class);
 
   private static final ImmutableSet<Class<? extends BuildRule>> XCODE_TARGET_BUILD_RULE_TEST_TYPES =
       ImmutableSet.of(AppleTest.class);
@@ -160,8 +161,7 @@
           }
 
           // Stop traversal for rules outside the specific set.
-          if (!isXcodeTargetDescription(node.getDescription())
-              || SwiftLibraryDescription.isSwiftTarget(node.getBuildTarget())) {
+          if (!isXcodeTargetDescription(node.getDescription())) {
             return Collections.emptyIterator();
           }
 
