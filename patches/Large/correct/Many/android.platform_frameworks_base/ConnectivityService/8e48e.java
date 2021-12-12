diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index f06583b..75643f6 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4255,10 +4255,10 @@
         Collection<InetAddress> dnses = newLp.getDnsServers();
         if (DBG) log("Setting DNS servers for network " + netId + " to " + dnses);
         try {
-            mNetd.setDnsServersForNetwork(
+            mNetd.setDnsConfigurationForNetwork(
                     netId, NetworkUtils.makeStrings(dnses), newLp.getDomains());
         } catch (Exception e) {
-            loge("Exception in setDnsServersForNetwork: " + e);
+            loge("Exception in setDnsConfigurationForNetwork: " + e);
         }
         final NetworkAgentInfo defaultNai = getDefaultNetwork();
         if (defaultNai != null && defaultNai.network.netId == netId) {
