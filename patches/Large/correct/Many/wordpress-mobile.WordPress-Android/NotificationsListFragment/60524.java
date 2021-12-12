diff --git a/src/org/wordpress/android/ui/notifications/NotificationsListFragment.java b/src/org/wordpress/android/ui/notifications/NotificationsListFragment.java
index 0e634a0..4b03612 100644
--- a/src/org/wordpress/android/ui/notifications/NotificationsListFragment.java
+++ b/src/org/wordpress/android/ui/notifications/NotificationsListFragment.java
@@ -140,7 +140,7 @@
             if (notes.size() == 0) {
                 // No more notes available
                 mAllNotesLoaded = true;
-                if(mPressFooterView != null)
+                if(mProgressFooterView != null)
                     mProgressFooterView.setVisibility(View.GONE);
             } else {
                 Iterator<Note> noteIterator = notes.iterator();
