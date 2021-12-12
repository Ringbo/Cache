diff --git a/android/src/com/google/zxing/client/android/wifi/NetworkType.java b/android/src/com/google/zxing/client/android/wifi/NetworkType.java
index 809e3c6..6a9e5a4 100644
--- a/android/src/com/google/zxing/client/android/wifi/NetworkType.java
+++ b/android/src/com/google/zxing/client/android/wifi/NetworkType.java
@@ -26,7 +26,8 @@
     if (networkTypeString == null) {
       return NO_PASSWORD;
     }
-    if ("WPA".equals(networkTypeString)) {
+    if ("WPA".equals(networkTypeString) ||
+        "WPA2".equals(networkTypeString)) {
       return WPA;
     }
     if ("WEP".equals(networkTypeString)) {
