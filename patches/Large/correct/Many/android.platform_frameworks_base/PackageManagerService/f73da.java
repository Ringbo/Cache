diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index fbf953f..1153572 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -18702,7 +18702,7 @@
         Slog.w(TAG, "Shame on you for calling a hidden API. Shame!");
         try {
             observer.onGetStatsCompleted(null, false);
-        } catch (RemoteException ignored) {
+        } catch (Throwable ignored) {
         }
     }
 
