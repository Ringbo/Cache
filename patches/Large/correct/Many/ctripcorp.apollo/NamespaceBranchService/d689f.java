diff --git a/apollo-portal/src/main/java/com/ctrip/framework/apollo/portal/service/NamespaceBranchService.java b/apollo-portal/src/main/java/com/ctrip/framework/apollo/portal/service/NamespaceBranchService.java
index 7fd1001..71e64a9 100644
--- a/apollo-portal/src/main/java/com/ctrip/framework/apollo/portal/service/NamespaceBranchService.java
+++ b/apollo-portal/src/main/java/com/ctrip/framework/apollo/portal/service/NamespaceBranchService.java
@@ -68,8 +68,7 @@
     namespaceBranchAPI.updateBranchGrayRules(appId, env, clusterName, namespaceName, branchName, rules);
 
     Cat.logEvent(CatEventType.UPDATE_GRAY_RELEASE_RULE,
-                 String.format("%s+%s+%s+%s", appId, env, clusterName, namespaceName),
-                 "success", String.valueOf(rules.getRuleItems()));
+                 String.format("%s+%s+%s+%s", appId, env, clusterName, namespaceName));
   }
 
   public void deleteBranch(String appId, Env env, String clusterName, String namespaceName,
