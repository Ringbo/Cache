diff --git a/services/java/com/android/server/SystemServer.java b/services/java/com/android/server/SystemServer.java
index d766afd..445ee75 100644
--- a/services/java/com/android/server/SystemServer.java
+++ b/services/java/com/android/server/SystemServer.java
@@ -152,7 +152,7 @@
 
             Slog.i(TAG, "Display Manager");
             display = new DisplayManagerService();
-            ServiceManager.addService(Context.DISPLAY_SERVICE, display);
+            ServiceManager.addService(Context.DISPLAY_SERVICE, display, true);
 
             Slog.i(TAG, "Activity Manager");
             context = ActivityManagerService.main(factoryTest);
