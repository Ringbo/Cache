diff --git a/core/java/android/app/ApplicationPackageManager.java b/core/java/android/app/ApplicationPackageManager.java
index 9cd6d49..404268c 100644
--- a/core/java/android/app/ApplicationPackageManager.java
+++ b/core/java/android/app/ApplicationPackageManager.java
@@ -1693,7 +1693,7 @@
         if (dr == null) {
             dr = itemInfo.loadDefaultIcon(this);
         }
-        return getUserBadgedDrawableForDensity(dr, new UserHandle(mContext.getUserId()), null, 0);
+        return getUserBadgedIcon(dr, new UserHandle(mContext.getUserId()));
     }
 
     private Drawable getBadgedDrawable(Drawable drawable, Drawable badgeDrawable,
