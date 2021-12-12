diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index f6e3441..36b3a5e 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -980,7 +980,7 @@
     void setInputMethodLocked(String id) {
         InputMethodInfo info = mMethodMap.get(id);
         if (info == null) {
-            throw new IllegalArgumentException("Unknown id: " + mCurMethodId);
+            throw new IllegalArgumentException("Unknown id: " + id);
         }
 
         if (id.equals(mCurMethodId)) {
