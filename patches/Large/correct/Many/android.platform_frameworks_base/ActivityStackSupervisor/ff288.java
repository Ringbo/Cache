diff --git a/services/java/com/android/server/am/ActivityStackSupervisor.java b/services/java/com/android/server/am/ActivityStackSupervisor.java
index c04d8d8..ebcbdc5 100644
--- a/services/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/java/com/android/server/am/ActivityStackSupervisor.java
@@ -405,7 +405,7 @@
                     if (hr.app == null && app.uid == hr.info.applicationInfo.uid
                             && processName.equals(hr.processName)) {
                         try {
-                            if (realStartActivityLocked(hr, app, true, true)) {
+                            if (realStartActivityLocked(hr, app, true, true, null)) {
                                 didSomething = true;
                             }
                         } catch (Exception e) {
