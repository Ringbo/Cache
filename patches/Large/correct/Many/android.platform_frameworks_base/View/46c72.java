diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 41b9e2d..4385c2f 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -9127,12 +9127,12 @@
                 // Start user padding override Left user padding. Otherwise, if Left user
                 // padding is not defined, use the default left padding. If Left user padding
                 // is defined, just use it.
-                if (mUserPaddingStart > 0) {
+                if (mUserPaddingStart >= 0) {
                     mUserPaddingLeft = mUserPaddingStart;
                 } else if (mUserPaddingLeft < 0) {
                     mUserPaddingLeft = mPaddingLeft;
                 }
-                if (mUserPaddingEnd > 0) {
+                if (mUserPaddingEnd >= 0) {
                     mUserPaddingRight = mUserPaddingEnd;
                 } else if (mUserPaddingRight < 0) {
                     mUserPaddingRight = mPaddingRight;
