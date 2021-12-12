diff --git a/telephony/java/android/telephony/PhoneNumberUtils.java b/telephony/java/android/telephony/PhoneNumberUtils.java
index b935d2a..acb97a0 100644
--- a/telephony/java/android/telephony/PhoneNumberUtils.java
+++ b/telephony/java/android/telephony/PhoneNumberUtils.java
@@ -1825,7 +1825,7 @@
         int slotId = SubscriptionManager.getSlotId(subId);
         // retrieve the list of emergency numbers
         // check read-write ecclist property first
-        String ecclist = (slotId == 0) ? "ril.ecclist" : ("ril.ecclist" + slotId);
+        String ecclist = (slotId <= 0) ? "ril.ecclist" : ("ril.ecclist" + slotId);
 
         numbers = SystemProperties.get(ecclist);
 
