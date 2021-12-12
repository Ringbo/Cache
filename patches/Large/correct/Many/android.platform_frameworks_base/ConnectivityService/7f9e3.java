diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 3a184c7..2075c07 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4488,8 +4488,7 @@
                 state == NetworkInfo.State.SUSPENDED) {
             // going into or coming out of SUSPEND: rescore and notify
             if (networkAgent.getCurrentScore() != oldScore) {
-                rematchAllNetworksAndRequests(networkAgent, oldScore,
-                        NascentState.NOT_JUST_VALIDATED);
+                rematchAllNetworksAndRequests(networkAgent, oldScore);
             }
             notifyNetworkCallbacks(networkAgent, (state == NetworkInfo.State.SUSPENDED ?
                     ConnectivityManager.CALLBACK_SUSPENDED :
