diff --git a/telephony/java/com/android/internal/telephony/CallManager.java b/telephony/java/com/android/internal/telephony/CallManager.java
index b57f358..4dc1991 100644
--- a/telephony/java/com/android/internal/telephony/CallManager.java
+++ b/telephony/java/com/android/internal/telephony/CallManager.java
@@ -215,7 +215,7 @@
      * @param phone
      */
     public void unregisterPhone(Phone phone) {
-        if (phone != null && !mPhones.contains(phone)) {
+        if (phone != null && mPhones.contains(phone)) {
             mPhones.remove(phone);
             mRingingCalls.remove(phone.getRingingCall());
             mBackgroundCalls.remove(phone.getBackgroundCall());
