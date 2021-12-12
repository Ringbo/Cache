diff --git a/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java b/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java
index d683851..9728e38 100644
--- a/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java
+++ b/cmds/bmgr/src/com/android/commands/bmgr/Bmgr.java
@@ -354,7 +354,7 @@
             return;
         }
 
-        if (arg.indexOf('.') >= 0) {
+        if (arg.indexOf('.') >= 0 || arg.equals("android")) {
             // it's a package name
             doRestorePackage(arg);
         } else {
