diff --git a/core/java/android/webkit/LoadListener.java b/core/java/android/webkit/LoadListener.java
index 863ab8c..c2b9f20 100644
--- a/core/java/android/webkit/LoadListener.java
+++ b/core/java/android/webkit/LoadListener.java
@@ -376,8 +376,9 @@
             i.setDataAndType(Uri.parse(url()), mMimeType);
             ResolveInfo info = mContext.getPackageManager().resolveActivity(i,
                     PackageManager.MATCH_DEFAULT_ONLY);
-            if (info != null) {
-                // someone (other than the current activity) knows how to
+            if (info != null && !mContext.getPackageName().equals(
+                    info.activityInfo.packageName)) {
+                // someone (other than the current app) knows how to
                 // handle this mime type.
                 try {
                     mContext.startActivity(i);
