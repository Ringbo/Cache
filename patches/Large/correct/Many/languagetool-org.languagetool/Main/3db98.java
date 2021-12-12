diff --git a/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java b/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java
index 6dc4bd7..68761ed 100644
--- a/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java
+++ b/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java
@@ -611,7 +611,7 @@
     JRadioButtonMenuItem lfItem = new JRadioButtonMenuItem(new SelectLFAction(laf));
     lafMenu.add(lfItem);
     buttonGroup.add(lfItem);
-    if (laf.getName().equals(UIManager.getLookAndFeel().getName())) {
+    if (laf.getClassName().equals(UIManager.getLookAndFeel().getClass().getName())) {
       buttonGroup.setSelected(lfItem.getModel(), true);
     }
   }
