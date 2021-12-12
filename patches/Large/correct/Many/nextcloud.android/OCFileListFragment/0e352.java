diff --git a/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java b/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java
index 0f4e3a4..0eae61b 100644
--- a/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java
+++ b/src/main/java/com/owncloud/android/ui/fragment/OCFileListFragment.java
@@ -532,7 +532,7 @@
                 getActivity(),
                 true
         );
-        mf.filter(popup.getMenu());
+        mf.filter(popup.getMenu(), false);
         popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
             @Override
             public boolean onMenuItemClick(MenuItem item) {
