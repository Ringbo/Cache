diff --git a/services/core/java/com/android/server/tv/TvInputManagerService.java b/services/core/java/com/android/server/tv/TvInputManagerService.java
index cbbcc58..99b5b03 100644
--- a/services/core/java/com/android/server/tv/TvInputManagerService.java
+++ b/services/core/java/com/android/server/tv/TvInputManagerService.java
@@ -631,7 +631,9 @@
             } finally {
                 Binder.restoreCallingIdentity(identity);
             }
-            return false;
+            // STOPSHIP: Redesign the API around the availability change. For now, the service
+            // will be always available.
+            return true;
         }
 
         @Override
