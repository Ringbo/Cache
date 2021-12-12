diff --git a/platform/platform-api/src/com/intellij/openapi/ui/popup/util/PopupUtil.java b/platform/platform-api/src/com/intellij/openapi/ui/popup/util/PopupUtil.java
index 67f2f0a..f6b844f 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/popup/util/PopupUtil.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/popup/util/PopupUtil.java
@@ -201,7 +201,7 @@
 
   public static boolean isComboPopupKeyEvent(@NotNull ComponentEvent event, @NotNull JComboBox comboBox) {
     final Component component = event.getComponent();
-    if(!comboBox.isPopupVisible()) return false;
+    if(!comboBox.isPopupVisible() || component == null) return false;
     ComboPopup popup = ReflectionUtil.getField(comboBox.getUI().getClass(), comboBox.getUI(), ComboPopup.class, "popup");
     return popup != null && SwingUtilities.isDescendingFrom(popup.getList(), component);
   }
