diff --git a/telephony/java/android/telephony/SubscriptionManager.java b/telephony/java/android/telephony/SubscriptionManager.java
index 80ee9b3..1f3dc8b 100644
--- a/telephony/java/android/telephony/SubscriptionManager.java
+++ b/telephony/java/android/telephony/SubscriptionManager.java
@@ -1411,7 +1411,7 @@
      * @return subscription Ids or null if the given slot Index is not valid.
      */
     @Nullable
-    public static int[] getSubscriptionIds(int slotIndex) {
+    public int[] getSubscriptionIds(int slotIndex) {
         return getSubId(slotIndex);
     }
 
