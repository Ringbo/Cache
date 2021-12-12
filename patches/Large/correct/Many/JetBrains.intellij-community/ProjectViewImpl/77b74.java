diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
index 94a0db1..7b5e2aa 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
@@ -552,7 +552,7 @@
 
     myContentManager = toolWindow.getContentManager();
     if (!ApplicationManager.getApplication().isUnitTestMode()) {
-      toolWindow.setDefaultContentUiType(ToolWindowContentUiType.COMBO);
+      toolWindow.setContentUiType(ToolWindowContentUiType.COMBO, null);
       ((ToolWindowEx)toolWindow).setAdditionalGearActions(myActionGroup);
       toolWindow.getComponent().putClientProperty(ToolWindowContentUi.HIDE_ID_LABEL, "true");
     }
