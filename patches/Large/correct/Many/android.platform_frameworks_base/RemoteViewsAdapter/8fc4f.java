diff --git a/core/java/android/widget/RemoteViewsAdapter.java b/core/java/android/widget/RemoteViewsAdapter.java
index 602f955..56bdb9b 100644
--- a/core/java/android/widget/RemoteViewsAdapter.java
+++ b/core/java/android/widget/RemoteViewsAdapter.java
@@ -176,7 +176,7 @@
                 RemoteViewsAdapter adapter;
                 final AppWidgetManager mgr = AppWidgetManager.getInstance(context);
                 if ((adapter = mAdapter.get()) != null) {
-                    mgr.unbindRemoteViewsService(context.getPackageName(), appWidgetId, intent);
+                    mgr.unbindRemoteViewsService(context.getOpPackageName(), appWidgetId, intent);
                 } else {
                     Slog.w(TAG, "unbind: adapter was null");
                 }
