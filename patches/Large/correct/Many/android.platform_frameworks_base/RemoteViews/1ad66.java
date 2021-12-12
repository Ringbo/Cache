diff --git a/core/java/android/widget/RemoteViews.java b/core/java/android/widget/RemoteViews.java
index 1985792..ad4d742 100644
--- a/core/java/android/widget/RemoteViews.java
+++ b/core/java/android/widget/RemoteViews.java
@@ -492,7 +492,7 @@
             // If the view is an AdapterView, setting a PendingIntent on click doesn't make much
             // sense, do they mean to set a PendingIntent template for the AdapterView's children?
             if (mIsWidgetCollectionChild) {
-                Log.e("RemoteViews", "Cannot setOnClickPendingIntent for collection item " +
+                Log.w("RemoteViews", "Cannot setOnClickPendingIntent for collection item " +
                         "(id: " + viewId + ")");
                 ApplicationInfo appInfo = root.getContext().getApplicationInfo();
 
