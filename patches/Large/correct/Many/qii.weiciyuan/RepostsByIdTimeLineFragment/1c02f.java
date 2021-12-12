diff --git a/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java b/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java
index 465388b..6957a64 100644
--- a/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java
@@ -184,7 +184,7 @@
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 
-                if (position - 1 < getList().getReposts().size() && position - 1 > 0) {
+                if (position - 1 < getList().getReposts().size() && position - 1 >= 0) {
 
                     listViewItemClick(parent, view, position - 1, id);
                 } else if (position - 1 >= getList().getReposts().size()) {
