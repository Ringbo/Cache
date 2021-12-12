diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 113d7d2..5dd358f 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -2078,7 +2078,7 @@
                         l.onSuspend(request, response);
                         break;
                     case RESUME:
-                        l.onSuspend(request, response);
+                        l.onResume(request, response);
                         break;
                     case DESTROYED:
                         l.onDestroyed(request, response);
