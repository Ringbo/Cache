diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index c50110a..d4f8362 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -2459,7 +2459,7 @@
      * @param filePath
      * @return The APDU response.
      */
-    byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3,
+    public byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3,
             String filePath) {
         try {
             return getITelephony().iccExchangeSimIO(fileID, command, p1, p2,
