diff --git a/src/org/odk/collect/android/receivers/NetworkReceiver.java b/src/org/odk/collect/android/receivers/NetworkReceiver.java
index 76d648e..728cf66 100644
--- a/src/org/odk/collect/android/receivers/NetworkReceiver.java
+++ b/src/org/odk/collect/android/receivers/NetworkReceiver.java
@@ -42,7 +42,7 @@
 				.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);
 
 		if (action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
-			if (currentNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
+			if (currentNetworkInfo != null && currentNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
 				if (interfaceIsEnabled(context, currentNetworkInfo)) {
 					uploadForms(context);
 				}
