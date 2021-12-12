diff --git a/services/core/java/com/android/server/MountService.java b/services/core/java/com/android/server/MountService.java
index fd9a94d..229a3f4 100644
--- a/services/core/java/com/android/server/MountService.java
+++ b/services/core/java/com/android/server/MountService.java
@@ -1010,7 +1010,7 @@
         Configuration config = new Configuration();
         config.setLocale(locale);
         try {
-            ActivityManagerNative.getDefault().updateConfiguration(config);
+            ActivityManagerNative.getDefault().updatePersistentConfiguration(config);
         } catch (RemoteException e) {
             Slog.e(TAG, "Error setting system locale from mount service", e);
         }
