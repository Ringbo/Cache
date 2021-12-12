diff --git a/platform/lang-impl/src/com/intellij/psi/search/PredefinedSearchScopeProviderImpl.java b/platform/lang-impl/src/com/intellij/psi/search/PredefinedSearchScopeProviderImpl.java
index 9f32bbc..33df34b 100644
--- a/platform/lang-impl/src/com/intellij/psi/search/PredefinedSearchScopeProviderImpl.java
+++ b/platform/lang-impl/src/com/intellij/psi/search/PredefinedSearchScopeProviderImpl.java
@@ -146,7 +146,7 @@
     }
 
     if (usageView) {
-      if (prevSearchFiles) {
+      if (!prevSearchFiles) {
         addHierarchyScope(project, result);
       }
       UsageView selectedUsageView = UsageViewManager.getInstance(project).getSelectedUsageView();
