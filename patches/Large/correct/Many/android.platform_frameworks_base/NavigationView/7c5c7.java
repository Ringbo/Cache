diff --git a/packages/DocumentsUI/src/com/android/documentsui/NavigationView.java b/packages/DocumentsUI/src/com/android/documentsui/NavigationView.java
index ff1940a..4cba135 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/NavigationView.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/NavigationView.java
@@ -132,7 +132,7 @@
             showBreadcrumb(true);
             mToolbar.setTitle(null);
             mIgnoreNextNavigation = true;
-            mBreadcrumb.setSelection(mBreadcrumbAdapter.getCount() - 1);
+            mBreadcrumb.setSelection(mBreadcrumbAdapter.getCount() - 1, false);
         }
 
         if (DEBUG) Log.d(TAG, "Final toolbar title is: " + mToolbar.getTitle());
