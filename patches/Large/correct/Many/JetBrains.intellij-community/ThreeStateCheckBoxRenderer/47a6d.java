diff --git a/platform/lang-impl/src/com/intellij/profile/codeInspection/ui/table/ThreeStateCheckBoxRenderer.java b/platform/lang-impl/src/com/intellij/profile/codeInspection/ui/table/ThreeStateCheckBoxRenderer.java
index 6cb2a2d..aa038ef 100644
--- a/platform/lang-impl/src/com/intellij/profile/codeInspection/ui/table/ThreeStateCheckBoxRenderer.java
+++ b/platform/lang-impl/src/com/intellij/profile/codeInspection/ui/table/ThreeStateCheckBoxRenderer.java
@@ -43,7 +43,7 @@
     setThirdStateEnabled(false);
     setHorizontalAlignment(CENTER);
     setVerticalAlignment(CENTER);
-    setBorder(BorderFactory.createEmptyBorder(0, 0, 0, InspectionsConfigTreeTable.getAdditionalShiftIfMac()));
+    setBorder(BorderFactory.createEmptyBorder(0, 0, 0, InspectionsConfigTreeTable.getAdditionalShift()));
     addItemListener(new ItemListener() {
       @Override
       public void itemStateChanged(ItemEvent e) {
