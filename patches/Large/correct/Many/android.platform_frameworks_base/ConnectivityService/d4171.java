diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 86c4e67..8012b69 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4580,8 +4580,7 @@
                 state == NetworkInfo.State.SUSPENDED) {
             // going into or coming out of SUSPEND: rescore and notify
             if (networkAgent.getCurrentScore() != oldScore) {
-                rematchAllNetworksAndRequests(networkAgent, oldScore,
-                        NascentState.NOT_JUST_VALIDATED);
+                rematchAllNetworksAndRequests(networkAgent, oldScore);
             }
             notifyNetworkCallbacks(networkAgent, (state == NetworkInfo.State.SUSPENDED ?
                     ConnectivityManager.CALLBACK_SUSPENDED :
