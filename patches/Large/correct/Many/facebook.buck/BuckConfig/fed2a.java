diff --git a/src/com/facebook/buck/cli/BuckConfig.java b/src/com/facebook/buck/cli/BuckConfig.java
index f40d24b..5da8740 100644
--- a/src/com/facebook/buck/cli/BuckConfig.java
+++ b/src/com/facebook/buck/cli/BuckConfig.java
@@ -1082,7 +1082,7 @@
   }
 
   public boolean getThriftTargetTypesEnabled() {
-    return getBooleanValue("project", "thrift_target_types_enabled", true);
+    return getBooleanValue("project", "thrift_target_types_enabled", false);
   }
 
   public Config getConfig() {
