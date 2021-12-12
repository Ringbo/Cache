diff --git a/services/java/com/android/server/AppWidgetServiceImpl.java b/services/java/com/android/server/AppWidgetServiceImpl.java
index 41617c8..04cfa4f 100644
--- a/services/java/com/android/server/AppWidgetServiceImpl.java
+++ b/services/java/com/android/server/AppWidgetServiceImpl.java
@@ -996,7 +996,7 @@
         // drop unbound appWidgetIds (shouldn't be possible under normal circumstances)
         if (id != null && id.provider != null && !id.provider.zombie && !id.host.zombie) {
 
-            if (!isPartialUpdate) {
+            if (!isPartialUpdate || id.views == null) {
                 // For a full update we replace the RemoteViews completely.
                 id.views = views;
             } else {
