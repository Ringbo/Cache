diff --git a/test/com/facebook/buck/testutil/integration/BuckBuildLog.java b/test/com/facebook/buck/testutil/integration/BuckBuildLog.java
index 5e5b30a..8bd7ed0 100644
--- a/test/com/facebook/buck/testutil/integration/BuckBuildLog.java
+++ b/test/com/facebook/buck/testutil/integration/BuckBuildLog.java
@@ -61,7 +61,11 @@
 
   public void assertNotTargetBuiltLocally(String buildTargetRaw) {
     BuildLogEntry logEntry = getLogEntry(buildTargetRaw);
-    assertNotEquals(BuildRuleSuccessType.BUILT_LOCALLY, logEntry.successType.get());
+    assertNotEquals(
+        String.format(
+            "Build target %s should not have been built locally, but it was", buildTargetRaw),
+        BuildRuleSuccessType.BUILT_LOCALLY,
+        logEntry.successType.get());
   }
 
   public void assertTargetIsAbsent(String buildTargetRaw) {
