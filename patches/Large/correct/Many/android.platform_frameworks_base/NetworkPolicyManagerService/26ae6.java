diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index cd982d3..46bda8c 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -1668,8 +1668,9 @@
     public NetworkPolicy[] getNetworkPolicies(String callingPackage) {
         mContext.enforceCallingOrSelfPermission(MANAGE_NETWORK_POLICY, TAG);
         try {
-            mContext.enforceCallingPermission(READ_PRIVILEGED_PHONE_STATE, TAG);
-            // SKIP checking run-time OP_READ_PHONE_STATE since using PRIVILEGED
+            mContext.enforceCallingOrSelfPermission(READ_PRIVILEGED_PHONE_STATE, TAG);
+            // SKIP checking run-time OP_READ_PHONE_STATE since caller or self has PRIVILEGED
+            // permission
         } catch (SecurityException e) {
             mContext.enforceCallingOrSelfPermission(READ_PHONE_STATE, TAG);
 
