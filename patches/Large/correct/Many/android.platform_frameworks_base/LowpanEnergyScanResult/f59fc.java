diff --git a/lowpan/java/android/net/lowpan/LowpanEnergyScanResult.java b/lowpan/java/android/net/lowpan/LowpanEnergyScanResult.java
index 91ed19c..da87752 100644
--- a/lowpan/java/android/net/lowpan/LowpanEnergyScanResult.java
+++ b/lowpan/java/android/net/lowpan/LowpanEnergyScanResult.java
@@ -28,7 +28,7 @@
     private int mChannel = UNKNOWN;
     private int mMaxRssi = UNKNOWN;
 
-    public LowpanEnergyScanResult() {}
+    LowpanEnergyScanResult() {}
 
     public int getChannel() {
         return mChannel;
@@ -38,11 +38,11 @@
         return mMaxRssi;
     }
 
-    public void setChannel(int x) {
+    void setChannel(int x) {
         mChannel = x;
     }
 
-    public void setMaxRssi(int x) {
+    void setMaxRssi(int x) {
         mMaxRssi = x;
     }
 
