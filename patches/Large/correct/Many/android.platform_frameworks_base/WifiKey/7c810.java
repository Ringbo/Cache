diff --git a/core/java/android/net/WifiKey.java b/core/java/android/net/WifiKey.java
index 99de99e..68b505d 100644
--- a/core/java/android/net/WifiKey.java
+++ b/core/java/android/net/WifiKey.java
@@ -64,10 +64,10 @@
      * @throws IllegalArgumentException if either the SSID or BSSID is invalid.
      */
     public WifiKey(String ssid, String bssid) {
-        if (!SSID_PATTERN.matcher(ssid).matches()) {
+        if (ssid == null || !SSID_PATTERN.matcher(ssid).matches()) {
             throw new IllegalArgumentException("Invalid ssid: " + ssid);
         }
-        if (!BSSID_PATTERN.matcher(bssid).matches()) {
+        if (bssid == null || !BSSID_PATTERN.matcher(bssid).matches()) {
             throw new IllegalArgumentException("Invalid bssid: " + bssid);
         }
         this.ssid = ssid;
