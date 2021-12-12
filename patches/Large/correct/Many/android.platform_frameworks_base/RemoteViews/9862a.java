diff --git a/core/java/android/widget/RemoteViews.java b/core/java/android/widget/RemoteViews.java
index 8d83774..8d1be53 100644
--- a/core/java/android/widget/RemoteViews.java
+++ b/core/java/android/widget/RemoteViews.java
@@ -351,12 +351,12 @@
                     public void onClick(View v) {
                         // Insure that this view is a child of an AdapterView
                         View parent = (View) v.getParent();
-                        while (!(parent instanceof AdapterView<?>)
+                        while (parent != null && !(parent instanceof AdapterView<?>)
                                 && !(parent instanceof AppWidgetHostView)) {
                             parent = (View) parent.getParent();
                         }
 
-                        if (parent instanceof AppWidgetHostView) {
+                        if (parent instanceof AppWidgetHostView || parent == null) {
                             // Somehow they've managed to get this far without having
                             // and AdapterView as a parent.
                             Log.e("RemoteViews", "Collection item doesn't have AdapterView parent");
