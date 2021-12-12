diff --git a/services/core/java/com/android/server/InputMethodManagerService.java b/services/core/java/com/android/server/InputMethodManagerService.java
index dc35051..37f1dc4 100644
--- a/services/core/java/com/android/server/InputMethodManagerService.java
+++ b/services/core/java/com/android/server/InputMethodManagerService.java
@@ -889,7 +889,7 @@
 
     /**
      * Start a VR InputMethod that matches IME with package name of {@param component}.
-     * Note: This method is called from {@link VrManager}.
+     * Note: This method is called from {@link android.app.VrManager}.
      */
     private void startVrInputMethodNoCheck(@Nullable ComponentName component) {
         if (component == null) {
@@ -903,7 +903,7 @@
             for (InputMethodInfo info : mMethodList) {
                 if (TextUtils.equals(info.getPackageName(), packageName) && info.isVrOnly()) {
                     // set this is as current inputMethod without updating settings.
-                    setInputMethodEnabled(info.getId(), true);
+                    setInputMethodEnabledLocked(info.getId(), true);
                     setInputMethodLocked(info.getId(), NOT_A_SUBTYPE_ID);
                     break;
                 }
