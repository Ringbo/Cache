diff --git a/platform/lang-impl/src/com/intellij/codeInsight/documentation/DockablePopupManager.java b/platform/lang-impl/src/com/intellij/codeInsight/documentation/DockablePopupManager.java
index ab20fd1..247b301 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/documentation/DockablePopupManager.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/documentation/DockablePopupManager.java
@@ -121,7 +121,7 @@
     new UiNotifyConnector(component, new Activatable() {
       @Override
       public void showNotify() {
-        restartAutoUpdate(PropertiesComponent.getInstance().getBoolean(getAutoUpdateEnabledProperty()));
+        restartAutoUpdate(PropertiesComponent.getInstance().getBoolean(getAutoUpdateEnabledProperty(), getAutoUpdateDefault()));
       }
 
       @Override
@@ -152,7 +152,7 @@
 
       @Override
       public void setSelected(AnActionEvent e, boolean state) {
-        PropertiesComponent.getInstance().setValue(getAutoUpdateEnabledProperty(), state);
+        PropertiesComponent.getInstance().setValue(getAutoUpdateEnabledProperty(), state, getAutoUpdateDefault());
         restartAutoUpdate(state);
       }
     };
