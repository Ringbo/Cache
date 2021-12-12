diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index b1d77f5..8a73e99 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -9493,7 +9493,7 @@
         String[] newArgs;
         String componentNameString;
         ServiceRecord r;
-        if (opti <= args.length) {
+        if (opti >= args.length) {
             componentNameString = null;
             newArgs = EMPTY_STRING_ARRAY;
             r = null;
