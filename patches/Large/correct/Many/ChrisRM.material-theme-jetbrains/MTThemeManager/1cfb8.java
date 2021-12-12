diff --git a/src/main/java/com/chrisrm/idea/themes/MTThemeManager.java b/src/main/java/com/chrisrm/idea/themes/MTThemeManager.java
index 753e0ba..3d4a5f6 100644
--- a/src/main/java/com/chrisrm/idea/themes/MTThemeManager.java
+++ b/src/main/java/com/chrisrm/idea/themes/MTThemeManager.java
@@ -433,7 +433,7 @@
     } else {
       final Font roboto = MTUiUtils.findFont("Roboto");
       if (roboto != null) {
-        applyCustomFonts(lookAndFeelDefaults, "Roboto", JBUI.scale(12));
+        applyCustomFonts(lookAndFeelDefaults, "Roboto", JBUI.scale(14));
       }
     }
   }
