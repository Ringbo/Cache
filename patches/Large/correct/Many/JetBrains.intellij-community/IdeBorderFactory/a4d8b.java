diff --git a/platform/platform-api/src/com/intellij/ui/IdeBorderFactory.java b/platform/platform-api/src/com/intellij/ui/IdeBorderFactory.java
index 055ec54..a876cb4 100644
--- a/platform/platform-api/src/com/intellij/ui/IdeBorderFactory.java
+++ b/platform/platform-api/src/com/intellij/ui/IdeBorderFactory.java
@@ -57,19 +57,19 @@
     return new EmptyBorder(top, left, bottom, right);
   }
 
-  public static TitledBorder createTitledBorderBoldWithIndent(String title) {
+  public static IdeaTitledBorder createTitledBorderBoldWithIndent(String title) {
     return new IdeaTitledBorder(title, UIUtil.getBorderFont().deriveFont(Font.BOLD), UIUtil.getBorderColor(), 18, 1, new Insets(5,0,10,0));
   }
 
-  public static TitledBorder createTitledBorderBoldWithoutIndent(String title) {
+  public static IdeaTitledBorder createTitledBorderBoldWithoutIndent(String title) {
     return new IdeaTitledBorder(title, UIUtil.getBorderFont().deriveFont(Font.BOLD), UIUtil.getBorderColor(), 0, 1, new Insets(5,0,10,0));
   }
 
-  public static TitledBorder createTitledBorderSimpleWithIndent(String title) {
+  public static IdeaTitledBorder createTitledBorderSimpleWithIndent(String title) {
     return new IdeaTitledBorder(title, UIUtil.getBorderFont(), UIUtil.getBorderColor(), 15, 1, new Insets(3,0,6,0));
   }
 
-  public static TitledBorder createTitledBorderSimpleWithoutIndent(String title) {
+  public static IdeaTitledBorder createTitledBorderSimpleWithoutIndent(String title) {
     return new IdeaTitledBorder(title, UIUtil.getBorderFont(), UIUtil.getBorderColor(), 0, 1, new Insets(3,0,6,0));
   }
 
