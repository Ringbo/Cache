diff --git a/src/com/facebook/buck/core/build/engine/config/AbstractResourceAwareSchedulingInfo.java b/src/com/facebook/buck/core/build/engine/config/AbstractResourceAwareSchedulingInfo.java
index ca7168a..3060607 100644
--- a/src/com/facebook/buck/core/build/engine/config/AbstractResourceAwareSchedulingInfo.java
+++ b/src/com/facebook/buck/core/build/engine/config/AbstractResourceAwareSchedulingInfo.java
@@ -56,7 +56,7 @@
   }
 
   private boolean isRuleResourceFree(BuildRule rule) {
-    return rule.hasBuildSteps();
+    return !rule.hasBuildSteps();
   }
 
   private ResourceAmounts getResourceAmountsForRuleOrDefaultAmounts(BuildRule rule) {
