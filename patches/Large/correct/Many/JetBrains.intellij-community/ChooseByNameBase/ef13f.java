diff --git a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
index fdc1b6d..6154ac0 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
@@ -1420,7 +1420,7 @@
     final JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
     panel.add(separator, BorderLayout.CENTER);
     if (!UIUtil.isUnderAquaBasedLookAndFeel()) {
-      separator.setBorder(new EmptyBorder(3, 0, 2, 0));
+      panel.setBorder(new EmptyBorder(3, 0, 2, 0));
     }
     panel.setBackground(backgroundColor);
     return panel;
