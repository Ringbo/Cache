diff --git a/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java b/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java
index 3059a43..9ef1226 100644
--- a/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java
@@ -100,7 +100,7 @@
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 
-                if (position - 1 < getList().getSize() && position - 1 > 0) {
+                if (position - 1 < getList().getSize() && position - 1 >= 0) {
 
                     listViewItemClick(parent, view, position - 1, id);
                 } else if (position - 1 >= getList().getSize()) {
