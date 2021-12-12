diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 5110929..ec83a03 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4583,8 +4583,8 @@
     private void updateCapabilities(
             int oldScore, NetworkAgentInfo nai, NetworkCapabilities networkCapabilities) {
         // Once a NetworkAgent is connected, complain if some immutable capabilities are removed.
-        if (nai.everConnected &&
-                !nai.networkCapabilities.satisfiedByNetworkCapabilities(networkCapabilities)) {
+        if (nai.everConnected && !nai.networkCapabilities.satisfiedByImmutableNetworkCapabilities(
+                networkCapabilities)) {
             // TODO: consider not complaining when a network agent degrade its capabilities if this
             // does not cause any request (that is not a listen) currently matching that agent to
             // stop being matched by the updated agent.
