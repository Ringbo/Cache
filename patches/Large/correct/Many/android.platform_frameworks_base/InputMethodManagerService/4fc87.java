diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index eb21434..c365af5 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -1376,7 +1376,7 @@
         synchronized (mMethodMap) {
             final Pair<String, String> lastIme = mSettings.getLastInputMethodAndSubtypeLocked();
             final InputMethodInfo lastImi;
-            if (lastIme == null) {
+            if (lastIme != null) {
                 lastImi = mMethodMap.get(lastIme.first);
             } else {
                 lastImi = null;
