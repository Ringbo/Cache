diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index b08fc28..8297988e 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -3914,7 +3914,7 @@
         }
 
         boolean didSomething = killPackageProcessesLocked(name, appId, userId,
-                -100, callerWillRestart, false, doit, evenPersistent,
+                -100, callerWillRestart, true, doit, evenPersistent,
                 name == null ? ("force stop user " + userId) : ("force stop " + name));
         
         TaskRecord lastTask = null;
