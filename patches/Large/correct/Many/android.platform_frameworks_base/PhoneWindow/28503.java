diff --git a/policy/com/android/internal/policy/impl/PhoneWindow.java b/policy/com/android/internal/policy/impl/PhoneWindow.java
index b8ecd13..5abf366 100644
--- a/policy/com/android/internal/policy/impl/PhoneWindow.java
+++ b/policy/com/android/internal/policy/impl/PhoneWindow.java
@@ -952,7 +952,7 @@
 
     @Override
     public final void setBackgroundDrawable(Drawable drawable) {
-        if (drawable != mBackgroundDrawable) {
+        if (drawable != mBackgroundDrawable || mBackgroundResource != 0) {
             mBackgroundResource = 0;
             mBackgroundDrawable = drawable;
             if (mDecor != null) {
