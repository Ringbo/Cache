diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index 5d205fb..818f0aa 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -2307,7 +2307,7 @@
         mContext.enforceCallingOrSelfPermission(CONNECTIVITY_INTERNAL, TAG);
 
         // Turn mobile data limit off
-        NetworkPolicy[] policies = getNetworkPolicies();
+        NetworkPolicy[] policies = getNetworkPolicies(mContext.getOpPackageName());
         NetworkTemplate template = NetworkTemplate.buildTemplateMobileAll(subscriber);
         for (NetworkPolicy policy : policies) {
             if (policy.template.equals(template)) {
