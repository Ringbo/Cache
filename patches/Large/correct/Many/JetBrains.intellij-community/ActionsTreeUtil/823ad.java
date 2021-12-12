diff --git a/action-system/impl/com/intellij/openapi/keymap/impl/ui/ActionsTreeUtil.java b/action-system/impl/com/intellij/openapi/keymap/impl/ui/ActionsTreeUtil.java
index 78558b8..db0356e 100644
--- a/action-system/impl/com/intellij/openapi/keymap/impl/ui/ActionsTreeUtil.java
+++ b/action-system/impl/com/intellij/openapi/keymap/impl/ui/ActionsTreeUtil.java
@@ -214,7 +214,7 @@
   }
 
   private static Group createExtensionGroup(Condition<AnAction> filtered, final Project project, KeymapExtension provider) {
-    Group group = new Group(provider.getGroupName(), provider.getIcon(), provider.getOpenIcon());
+    Group group = new Group(provider.getGroupName(), provider.getOpenIcon(), provider.getIcon());
 
     for (Map.Entry<Object, List<String>> entry : provider.createSubGroups(filtered, project).entrySet()) {
       final Group subGroup = new Group(provider.getSubgroupName(entry.getKey(), project), null, null);
