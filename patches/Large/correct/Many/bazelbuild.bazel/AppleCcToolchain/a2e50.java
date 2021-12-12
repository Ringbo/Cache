diff --git a/src/main/java/com/google/devtools/build/lib/rules/apple/cpp/AppleCcToolchain.java b/src/main/java/com/google/devtools/build/lib/rules/apple/cpp/AppleCcToolchain.java
index 4c1d991..3ce8d66 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/apple/cpp/AppleCcToolchain.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/apple/cpp/AppleCcToolchain.java
@@ -53,11 +53,12 @@
   public static final String APPLE_SDK_PLATFORM_VALUE_KEY = "apple_sdk_platform_value";
 
   @Override
-  protected Map<String, String> getBuildVariables(RuleContext ruleContext) {
+  protected Map<String, String> getBuildVariables(RuleContext ruleContext)
+      throws RuleErrorException {
     AppleConfiguration appleConfiguration = ruleContext.getFragment(AppleConfiguration.class);
     
     if (appleConfiguration.getXcodeVersion() == null) {
-      ruleContext.ruleError("Xcode version must be specified to use an Apple CROSSTOOL");
+      ruleContext.throwWithRuleError("Xcode version must be specified to use an Apple CROSSTOOL");
     }
     
     Platform platform = appleConfiguration.getSingleArchPlatform();
