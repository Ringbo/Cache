diff --git a/services/java/com/android/server/AppWidgetService.java b/services/java/com/android/server/AppWidgetService.java
index 62b26c4..50f918b 100644
--- a/services/java/com/android/server/AppWidgetService.java
+++ b/services/java/com/android/server/AppWidgetService.java
@@ -479,7 +479,7 @@
             // Add it to the mapping of RemoteViewsService to appWidgetIds so that we can determine
             // when we can call back to the RemoteViewsService later to destroy associated
             // factories.
-             WidgetRemoteViewsServiceBinding(appWidgetId, fc);
+            incrementAppWidgetServiceRefCount(appWidgetId, fc);
         }
     }
 
