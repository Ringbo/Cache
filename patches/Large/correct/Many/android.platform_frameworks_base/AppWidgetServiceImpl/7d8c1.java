diff --git a/services/appwidget/java/com/android/server/appwidget/AppWidgetServiceImpl.java b/services/appwidget/java/com/android/server/appwidget/AppWidgetServiceImpl.java
index b2712ff..aad4431 100644
--- a/services/appwidget/java/com/android/server/appwidget/AppWidgetServiceImpl.java
+++ b/services/appwidget/java/com/android/server/appwidget/AppWidgetServiceImpl.java
@@ -4365,7 +4365,7 @@
                                     }
                                     addWidgetLocked(id);
                                 }
-                                if (id.provider.info != null) {
+                                if (id.provider != null && id.provider.info != null) {
                                     stashProviderRestoreUpdateLocked(id.provider,
                                             restoredId, id.appWidgetId);
                                 } else {
