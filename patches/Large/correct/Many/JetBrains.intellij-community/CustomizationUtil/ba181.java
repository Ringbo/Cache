diff --git a/source/com/intellij/ide/ui/customization/CustomizationUtil.java b/source/com/intellij/ide/ui/customization/CustomizationUtil.java
index f06ec35a..f8232b4 100644
--- a/source/com/intellij/ide/ui/customization/CustomizationUtil.java
+++ b/source/com/intellij/ide/ui/customization/CustomizationUtil.java
@@ -51,13 +51,13 @@
        if ((actionUrl.getParentGroup().equals(text) ||
             actionUrl.getParentGroup().equals(defaultGroupName) ||
             actionUrl.getParentGroup().equals(actionManager.getId(group))) &&
-           reordableChildren.size() > actionUrl.getAbsolutePosition()) {
+           reordableChildren.size() >= actionUrl.getAbsolutePosition()) {
          AnAction componentAction = actionUrl.getComponentAction();
          if (componentAction != null) {
            if (actionUrl.getActionType() == ActionUrl.ADDED) {
              reordableChildren.add(actionUrl.getAbsolutePosition(), componentAction);
            }
-           else if (actionUrl.getActionType() == ActionUrl.DELETED) {
+           else if (actionUrl.getActionType() == ActionUrl.DELETED && reordableChildren.size() != actionUrl.getAbsolutePosition()) {
              final AnAction anAction = reordableChildren.get(actionUrl.getAbsolutePosition());
              //for unnamed groups
              if (anAction.getTemplatePresentation().getText() == null && anAction instanceof ActionGroup) {
