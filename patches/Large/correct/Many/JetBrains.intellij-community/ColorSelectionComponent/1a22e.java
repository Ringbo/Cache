diff --git a/platform/lang-impl/src/com/intellij/ui/tabs/ColorSelectionComponent.java b/platform/lang-impl/src/com/intellij/ui/tabs/ColorSelectionComponent.java
index 14d9705..a7721a8 100644
--- a/platform/lang-impl/src/com/intellij/ui/tabs/ColorSelectionComponent.java
+++ b/platform/lang-impl/src/com/intellij/ui/tabs/ColorSelectionComponent.java
@@ -107,7 +107,7 @@
   @Nullable
   public String getSelectedColorName() {
     ColorButton button = getSelectedButtonInner();
-    return button == null? null : button instanceof CustomColorButton ? ColorUtil.toHex(button.getColor()) : button.getName();
+    return button == null? null : button instanceof CustomColorButton ? ColorUtil.toHex(button.getColor()) : button.getText();
   }
 
   @Nullable
