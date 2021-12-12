diff --git a/platform/platform-api/src/com/intellij/ui/tabs/impl/TabLabel.java b/platform/platform-api/src/com/intellij/ui/tabs/impl/TabLabel.java
index d6b1a4d..cbeb6ab 100644
--- a/platform/platform-api/src/com/intellij/ui/tabs/impl/TabLabel.java
+++ b/platform/platform-api/src/com/intellij/ui/tabs/impl/TabLabel.java
@@ -221,7 +221,7 @@
   @Override
   public Insets getInsets() {
     Insets insets = super.getInsets();
-    if (myTabs.isEditorTabs() && UISettings.getShadowInstance().getShowCloseButton()) {
+    if (myTabs.isEditorTabs() && UISettings.getShadowInstance().getShowCloseButton() && hasIcons()) {
       if (!UISettings.getShadowInstance().getCloseTabButtonOnTheRight()) {
         insets.left = 3;
       }
