diff --git a/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaComboBoxUI.java b/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaComboBoxUI.java
index 37ed412..fbcc47e 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaComboBoxUI.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaComboBoxUI.java
@@ -378,7 +378,7 @@
         g.setColor(getArrowButtonFillColor(getBorderColor()));
         final Shape clip = g.getClip();
         final int offX = xxx + JBUI.scale(5);
-        g.setClip(offX, y, width - offX, height);
+        g.clipRect(offX, y, width - offX, height);
         g.drawRoundRect(JBUI.scale(1), JBUI.scale(1), width - JBUI.scale(2), height - JBUI.scale(2), R, R);
         g.setClip(clip);
       }
