diff --git a/services/java/com/android/server/SystemServer.java b/services/java/com/android/server/SystemServer.java
index ccfadc0..2f6a6e0 100644
--- a/services/java/com/android/server/SystemServer.java
+++ b/services/java/com/android/server/SystemServer.java
@@ -842,7 +842,8 @@
                     !mFirstBoot, mOnlyCore, new PhoneWindowManager());
             ServiceManager.addService(Context.WINDOW_SERVICE, wm, /* allowIsolated= */ false,
                     DUMP_FLAG_PRIORITY_CRITICAL | DUMP_FLAG_PROTO);
-            ServiceManager.addService(Context.INPUT_SERVICE, inputManager);
+            ServiceManager.addService(Context.INPUT_SERVICE, inputManager,
+                    /* allowIsolated= */ false, DUMP_FLAG_PRIORITY_CRITICAL);
             traceEnd();
 
             traceBeginAndSlog("SetWindowManagerService");
