diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index ba0f31b..51e9b00 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -1949,7 +1949,7 @@
 
     private boolean canAddToLastInputMethod(InputMethodSubtype subtype) {
         if (subtype == null) return true;
-        return subtype.containsExtraValueKey(SUBTYPE_EXTRAVALUE_EXCLUDE_FROM_LAST_IME);
+        return !subtype.containsExtraValueKey(SUBTYPE_EXTRAVALUE_EXCLUDE_FROM_LAST_IME);
     }
 
     private void saveCurrentInputMethodAndSubtypeToHistory() {
