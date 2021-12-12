diff --git a/platform/core-api/src/com/intellij/ui/LayeredIcon.java b/platform/core-api/src/com/intellij/ui/LayeredIcon.java
index c0d546f..5305e19 100644
--- a/platform/core-api/src/com/intellij/ui/LayeredIcon.java
+++ b/platform/core-api/src/com/intellij/ui/LayeredIcon.java
@@ -96,7 +96,7 @@
     adjustSize();
   }
 
-  public void setIcon(Icon icon, int layer, @MagicConstant(flagsFromClass = SwingConstants.class) int constraint) {
+  public void setIcon(Icon icon, int layer, @MagicConstant(valuesFromClass = SwingConstants.class) int constraint) {
     int width = getIconWidth();
     int height = getIconHeight();
     int w = icon.getIconWidth();
