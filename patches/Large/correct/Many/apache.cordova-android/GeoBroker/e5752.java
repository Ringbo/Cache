diff --git a/framework/src/org/apache/cordova/GeoBroker.java b/framework/src/org/apache/cordova/GeoBroker.java
index 05c427d..9b0838b 100755
--- a/framework/src/org/apache/cordova/GeoBroker.java
+++ b/framework/src/org/apache/cordova/GeoBroker.java
@@ -75,7 +75,7 @@
 	                int maximumAge = args.getInt(1);
 	                Location last = this.locationManager.getLastKnownLocation((enableHighAccuracy ? LocationManager.GPS_PROVIDER : LocationManager.NETWORK_PROVIDER));
 	                // Check if we can use lastKnownLocation to get a quick reading and use less battery
-	                if ((System.currentTimeMillis() - last.getTime()) <= maximumAge) {
+	                if (last != null && (System.currentTimeMillis() - last.getTime()) <= maximumAge) {
 	                    result = new PluginResult(PluginResult.Status.OK, this.returnLocationJSON(last));
 	                } else {
 	                    this.getCurrentLocation(callbackId, enableHighAccuracy);
