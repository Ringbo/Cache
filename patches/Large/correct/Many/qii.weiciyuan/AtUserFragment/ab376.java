diff --git a/src/org/qii/weiciyuan/ui/search/AtUserFragment.java b/src/org/qii/weiciyuan/ui/search/AtUserFragment.java
index d480087..00ac507 100644
--- a/src/org/qii/weiciyuan/ui/search/AtUserFragment.java
+++ b/src/org/qii/weiciyuan/ui/search/AtUserFragment.java
@@ -147,9 +147,9 @@
             super.onPostExecute(atUserBeans);
             if (isCancelled())
                 return;
-            if (atUserBeans.size() == 0) {
+            if (atUserBeans == null||atUserBeans.size() == 0) {
                 result.clear();
-                atList = atUserBeans;
+                atList.clear();
                 adapter.notifyDataSetChanged();
                 return;
             }
