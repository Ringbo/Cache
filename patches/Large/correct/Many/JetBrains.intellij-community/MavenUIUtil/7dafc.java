diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUIUtil.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUIUtil.java
index 2e6021f..ff51492 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUIUtil.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/MavenUIUtil.java
@@ -84,7 +84,7 @@
 
         final Color foreground = selected ? UIUtil.getTreeSelectionForeground() : UIUtil.getTreeTextForeground();
 
-        Color background = selected ? UIUtil.getTreeSelectionBackground() : UIUtil.getTreeTextBackground();
+        Color background = selected ? UIUtil.getTreeSelectionBackground(hasFocus) : UIUtil.getTreeTextBackground();
 
         panel.add(baseComponent, BorderLayout.CENTER);
         panel.setBackground(background);
