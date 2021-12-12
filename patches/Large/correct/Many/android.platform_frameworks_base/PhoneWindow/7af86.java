diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindow.java b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
index 64857ed..36e6b8e 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindow.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
@@ -903,7 +903,7 @@
     }
 
     private void reopenMenu(boolean toggleMenuMode) {
-        if (mActionBar != null) {
+        if (mActionBar != null && mActionBar.isOverflowReserved()) {
             final Callback cb = getCallback();
             if (!mActionBar.isOverflowMenuShowing() || !toggleMenuMode) {
                 if (cb != null && !isDestroyed() && mActionBar.getVisibility() == View.VISIBLE) {
