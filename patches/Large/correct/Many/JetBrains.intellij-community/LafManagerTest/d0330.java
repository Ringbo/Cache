diff --git a/platform/platform-tests/testSrc/com/intellij/ui/LafManagerTest.java b/platform/platform-tests/testSrc/com/intellij/ui/LafManagerTest.java
index 3c015d5..54bdb1a 100644
--- a/platform/platform-tests/testSrc/com/intellij/ui/LafManagerTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/ui/LafManagerTest.java
@@ -29,7 +29,7 @@
       lafManager.setCurrentLookAndFeel(new DarculaLookAndFeelInfo());
       lafManager.updateUI();
       Font font = UIManager.getFont("Label.font");
-      assertEquals("Font name is not changed", newFontName, font.getFamily());
+      assertEquals("Font name is not changed", newFontName, font.getName());
       assertEquals("Font size is not changed", newFontSize, font.getSize());
     } finally {
       UISettings.getInstance().setFontFace(fontFace);
