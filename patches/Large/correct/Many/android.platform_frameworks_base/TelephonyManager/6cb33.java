diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 6a68343..874aa49 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -993,8 +993,8 @@
 
     /**
      * An int extra used with {@link #ACTION_SUBSCRIPTION_CARRIER_IDENTITY_CHANGED} which indicates
-     * the updated carrier id {@link TelephonyManager#getSubscriptionCarrierId()} of the current
-     * subscription.
+     * the updated carrier id {@link TelephonyManager#getAndroidCarrierIdForSubscription()} of
+     * the current subscription.
      * <p>Will be {@link TelephonyManager#UNKNOWN_CARRIER_ID} if the subscription is unavailable or
      * the carrier cannot be identified.
      */
@@ -6627,14 +6627,19 @@
 
     /**
      * Returns carrier id of the current subscription.
-     * <p>To recognize a carrier (including MVNO) as a first class identity, assign each carrier
-     * with a canonical integer a.k.a carrier id.
+     * <p>To recognize a carrier (including MVNO) as a first-class identity, Android assigns each
+     * carrier with a canonical integer a.k.a. android carrier id. The Android carrier ID is an
+     * Android platform-wide identifier for a carrier. AOSP maintains carrier ID assignments in
+     * <a href="https://android.googlesource.com/platform/packages/providers/TelephonyProvider/+/master/assets/carrier_list.textpb">here</a>
+     *
+     * <p>Apps which have carrier-specific configurations or business logic can use the carrier id
+     * as an Android platform-wide identifier for carriers.
      *
      * @return Carrier id of the current subscription. Return {@link #UNKNOWN_CARRIER_ID} if the
      * subscription is unavailable or the carrier cannot be identified.
      * @throws IllegalStateException if telephony service is unavailable.
      */
-    public int getSubscriptionCarrierId() {
+    public int getAndroidCarrierIdForSubscription() {
         try {
             ITelephony service = getITelephony();
             return service.getSubscriptionCarrierId(getSubId());
@@ -6650,17 +6655,18 @@
 
     /**
      * Returns carrier name of the current subscription.
-     * <p>Carrier name is a user-facing name of carrier id {@link #getSubscriptionCarrierId()},
-     * usually the brand name of the subsidiary (e.g. T-Mobile). Each carrier could configure
-     * multiple {@link #getSimOperatorName() SPN} but should have a single carrier name.
-     * Carrier name is not a canonical identity, use {@link #getSubscriptionCarrierId()} instead.
+     * <p>Carrier name is a user-facing name of carrier id
+     * {@link #getAndroidCarrierIdForSubscription()}, usually the brand name of the subsidiary
+     * (e.g. T-Mobile). Each carrier could configure multiple {@link #getSimOperatorName() SPN} but
+     * should have a single carrier name. Carrier name is not a canonical identity,
+     * use {@link #getAndroidCarrierIdForSubscription()} instead.
      * <p>The returned carrier name is unlocalized.
      *
      * @return Carrier name of the current subscription. Return {@code null} if the subscription is
      * unavailable or the carrier cannot be identified.
      * @throws IllegalStateException if telephony service is unavailable.
      */
-    public String getSubscriptionCarrierName() {
+    public CharSequence getAndroidCarrierNameForSubscription() {
         try {
             ITelephony service = getITelephony();
             return service.getSubscriptionCarrierName(getSubId());
