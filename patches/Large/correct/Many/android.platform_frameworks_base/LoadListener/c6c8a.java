diff --git a/core/java/android/webkit/LoadListener.java b/core/java/android/webkit/LoadListener.java
index 1130e95..12b8c74 100644
--- a/core/java/android/webkit/LoadListener.java
+++ b/core/java/android/webkit/LoadListener.java
@@ -380,7 +380,8 @@
         }
         // At this point, mMimeType has been set to non-null.
         if (mIsMainPageLoader && mIsMainResourceLoader && mUserGesture &&
-                Pattern.matches(XML_MIME_TYPE, mMimeType)) {
+                Pattern.matches(XML_MIME_TYPE, mMimeType) &&
+                !mMimeType.equalsIgnoreCase("application/xhtml+xml")) {
             Intent i = new Intent(Intent.ACTION_VIEW);
             i.setDataAndType(Uri.parse(url()), mMimeType);
             ResolveInfo info = mContext.getPackageManager().resolveActivity(i,
