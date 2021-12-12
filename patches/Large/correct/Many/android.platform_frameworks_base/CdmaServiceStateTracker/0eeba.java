diff --git a/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java b/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
index 753b5e7..b42cffd 100644
--- a/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
+++ b/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
@@ -1053,7 +1053,7 @@
             cdmaDataConnectionDetachedRegistrants.notifyRegistrants();
         }
 
-        if (hasCdmaDataConnectionChanged) {
+        if (hasCdmaDataConnectionChanged || hasNetworkTypeChanged) {
             phone.notifyDataConnection(null);
         }
 
