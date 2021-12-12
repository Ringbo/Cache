diff --git a/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java b/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java
index 0eae61b..c6c85e0 100644
--- a/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java
+++ b/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java
@@ -532,7 +532,7 @@
                 getActivity(),
                 true
         );
-        mf.filter(popup.getMenu(), false);
+        mf.filter(popup.getMenu(), true);
         popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
             @Override
             public boolean onMenuItemClick(MenuItem item) {
