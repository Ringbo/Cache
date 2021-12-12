diff --git a/telephony/java/com/android/internal/telephony/CallManager.java b/telephony/java/com/android/internal/telephony/CallManager.java
index b09df82..3f0ec0a 100644
--- a/telephony/java/com/android/internal/telephony/CallManager.java
+++ b/telephony/java/com/android/internal/telephony/CallManager.java
@@ -56,7 +56,7 @@
 
     private static final String LOG_TAG ="CallManager";
     private static final boolean DBG = true;
-    private static final boolean VDBG = true;
+    private static final boolean VDBG = false;
 
     private static final int EVENT_DISCONNECT = 100;
     private static final int EVENT_PRECISE_CALL_STATE_CHANGED = 101;
@@ -292,7 +292,7 @@
 
         if (basePhone != null && !mPhones.contains(basePhone)) {
 
-            if (VDBG) {
+            if (DBG) {
                 Log.d(LOG_TAG, "registerPhone(" +
                         phone.getPhoneName() + " " + phone + ")");
             }
@@ -319,7 +319,7 @@
 
         if (basePhone != null && mPhones.contains(basePhone)) {
 
-            if (VDBG) {
+            if (DBG) {
                 Log.d(LOG_TAG, "unregisterPhone(" +
                         phone.getPhoneName() + " " + phone + ")");
             }
@@ -487,7 +487,7 @@
             boolean hasBgCall = ! (activePhone.getBackgroundCall().isIdle());
             boolean sameChannel = (activePhone == ringingPhone);
 
-            if (DBG) {
+            if (VDBG) {
                 Log.d(LOG_TAG, "hasBgCall: "+ hasBgCall + "sameChannel:" + sameChannel);
             }
 
