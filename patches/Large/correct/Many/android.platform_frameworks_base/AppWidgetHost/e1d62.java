diff --git a/core/java/android/appwidget/AppWidgetHost.java b/core/java/android/appwidget/AppWidgetHost.java
index 51a81c5..84a447f 100644
--- a/core/java/android/appwidget/AppWidgetHost.java
+++ b/core/java/android/appwidget/AppWidgetHost.java
@@ -117,7 +117,7 @@
     private OnClickHandler mOnClickHandler;
 
     public AppWidgetHost(Context context, int hostId) {
-        this(context, hostId, null, Looper.getMainLooper());
+        this(context, hostId, null, context.getMainLooper());
     }
 
     /**
