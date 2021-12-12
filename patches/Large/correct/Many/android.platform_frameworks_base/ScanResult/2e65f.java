diff --git a/wifi/java/android/net/wifi/ScanResult.java b/wifi/java/android/net/wifi/ScanResult.java
index 73de099..67ff868 100644
--- a/wifi/java/android/net/wifi/ScanResult.java
+++ b/wifi/java/android/net/wifi/ScanResult.java
@@ -168,7 +168,7 @@
      * @hide
      */
     public boolean is5GHz() {
-        return ScanResult.is24GHz(frequency);
+        return ScanResult.is5GHz(frequency);
     }
 
     /**
