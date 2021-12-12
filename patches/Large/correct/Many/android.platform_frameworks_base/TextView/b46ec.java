diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 00124e1..4245281 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -9203,7 +9203,7 @@
 
         @Override
         public void onDetached() {
-            if (mHandle == null) mHandle.onDetached();
+            if (mHandle != null) mHandle.onDetached();
         }
     }
 
