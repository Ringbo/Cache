diff --git a/src/com/facebook/buck/android/exopackage/ExopackageAgent.java b/src/com/facebook/buck/android/exopackage/ExopackageAgent.java
index d4c7a72..f6afd6f 100644
--- a/src/com/facebook/buck/android/exopackage/ExopackageAgent.java
+++ b/src/com/facebook/buck/android/exopackage/ExopackageAgent.java
@@ -72,7 +72,7 @@
     try {
       Optional<PackageInfo> agentInfo = device.getPackageInfo(AgentUtil.AGENT_PACKAGE_NAME);
       if (agentInfo.isPresent()
-          && agentInfo.get().versionCode.equals(AgentUtil.AGENT_VERSION_CODE)) {
+          && !agentInfo.get().versionCode.equals(AgentUtil.AGENT_VERSION_CODE)) {
         LOG.debug(
             "Agent version mismatch. Wanted %s, got %s.",
             AgentUtil.AGENT_VERSION_CODE, agentInfo.get().versionCode);
