diff --git a/telephony/java/android/telephony/SubscriptionManager.java b/telephony/java/android/telephony/SubscriptionManager.java
index 7664b94..754fe68 100644
--- a/telephony/java/android/telephony/SubscriptionManager.java
+++ b/telephony/java/android/telephony/SubscriptionManager.java
@@ -505,7 +505,7 @@
     public static final String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
 
     private final Context mContext;
-    private INetworkPolicyManager mNetworkPolicy;
+    private volatile INetworkPolicyManager mNetworkPolicy;
 
     /**
      * A listener class for monitoring changes to {@link SubscriptionInfo} records.
@@ -1794,7 +1794,7 @@
             @DurationMillisLong long timeoutMillis) {
         try {
             final int overrideValue = overrideUnmetered ? OVERRIDE_UNMETERED : 0;
-            mNetworkPolicy.setSubscriptionOverride(subId, OVERRIDE_UNMETERED, overrideValue,
+            getNetworkPolicy().setSubscriptionOverride(subId, OVERRIDE_UNMETERED, overrideValue,
                     timeoutMillis, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
@@ -1828,7 +1828,7 @@
             @DurationMillisLong long timeoutMillis) {
         try {
             final int overrideValue = overrideCongested ? OVERRIDE_CONGESTED : 0;
-            mNetworkPolicy.setSubscriptionOverride(subId, OVERRIDE_CONGESTED, overrideValue,
+            getNetworkPolicy().setSubscriptionOverride(subId, OVERRIDE_CONGESTED, overrideValue,
                     timeoutMillis, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
