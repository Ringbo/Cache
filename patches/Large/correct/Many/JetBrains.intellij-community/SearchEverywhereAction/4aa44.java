diff --git a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
index c75b74f..6f968e3 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
@@ -260,7 +260,7 @@
 
   private void updateComponents() {
     myRenderer = new MyListRenderer();
-    myList = new JBList() {
+    myList = new JBList(new SearchListModel()) {
       int lastKnownHeight = JBUI.scale(30);
       @Override
       public Dimension getPreferredSize() {
