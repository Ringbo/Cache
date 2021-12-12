diff --git a/src/com/facebook/buck/apple/xcode/ProjectGenerator.java b/src/com/facebook/buck/apple/xcode/ProjectGenerator.java
index c22e954..91d33e2 100644
--- a/src/com/facebook/buck/apple/xcode/ProjectGenerator.java
+++ b/src/com/facebook/buck/apple/xcode/ProjectGenerator.java
@@ -684,7 +684,7 @@
       defaultSettingsBuilder.put("CONFIGURATION_BUILD_DIR", getObjectOutputPathForRule(rule));
     }
     setTargetBuildConfigurations(
-        buildable,
+        rule,
         target,
         targetGroup,
         buildable.getConfigurations(),
@@ -801,7 +801,7 @@
    * effectively laid out in layers.
    */
   private void setTargetBuildConfigurations(
-      AbstractAppleNativeTargetBuildRule buildRule,
+      BuildRule buildRule,
       PBXTarget target,
       PBXGroup targetGroup,
       ImmutableSet<XcodeRuleConfiguration> configurations,
