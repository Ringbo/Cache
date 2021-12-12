diff --git a/core/java/android/content/ClipboardManager.java b/core/java/android/content/ClipboardManager.java
index 85a6765..3e2b763 100644
--- a/core/java/android/content/ClipboardManager.java
+++ b/core/java/android/content/ClipboardManager.java
@@ -189,7 +189,7 @@
      */
     public boolean hasText() {
         try {
-            return getService().hasPrimaryClip();
+            return getService().hasClipboardText();
         } catch (RemoteException e) {
             return false;
         }
