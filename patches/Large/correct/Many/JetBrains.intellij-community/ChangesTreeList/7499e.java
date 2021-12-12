diff --git a/source/com/intellij/openapi/vcs/changes/ui/ChangesTreeList.java b/source/com/intellij/openapi/vcs/changes/ui/ChangesTreeList.java
index fdce502..a61f87b 100644
--- a/source/com/intellij/openapi/vcs/changes/ui/ChangesTreeList.java
+++ b/source/com/intellij/openapi/vcs/changes/ui/ChangesTreeList.java
@@ -51,7 +51,7 @@
     setLayout(myCards);
 
     final int checkboxWidth = new JCheckBox().getPreferredSize().width;
-    myTree = new Tree() {
+    myTree = new Tree(new ChangesBrowserNode("root")) {
       public Dimension getPreferredScrollableViewportSize() {
         Dimension size = super.getPreferredScrollableViewportSize();
         size = new Dimension(size.width + 10, size.height);
