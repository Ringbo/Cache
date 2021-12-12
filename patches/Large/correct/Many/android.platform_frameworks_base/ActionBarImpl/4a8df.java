diff --git a/core/java/com/android/internal/app/ActionBarImpl.java b/core/java/com/android/internal/app/ActionBarImpl.java
index 243c605..cf5666c 100644
--- a/core/java/com/android/internal/app/ActionBarImpl.java
+++ b/core/java/com/android/internal/app/ActionBarImpl.java
@@ -500,7 +500,7 @@
 
     @Override
     public int getHeight() {
-        return mActionView.getHeight();
+        return mContainerView.getHeight();
     }
 
     @Override
