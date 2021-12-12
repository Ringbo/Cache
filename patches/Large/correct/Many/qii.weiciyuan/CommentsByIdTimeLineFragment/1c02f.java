diff --git a/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java b/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java
index 5686aaf..ba077fe 100644
--- a/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java
@@ -187,7 +187,7 @@
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 
-                if (position - 1 < getList().getComments().size() && position - 1 > 0) {
+                if (position - 1 < getList().getComments().size() && position - 1 >= 0) {
                     listViewItemClick(parent, view, position - 1, id);
                 } else if (position - 1 >= getList().getComments().size()) {
                     listViewFooterViewClick(view);
