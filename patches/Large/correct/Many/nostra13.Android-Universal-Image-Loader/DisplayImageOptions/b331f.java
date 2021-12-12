diff --git a/library/src/com/nostra13/universalimageloader/core/DisplayImageOptions.java b/library/src/com/nostra13/universalimageloader/core/DisplayImageOptions.java
index e64a0e9..798e67f 100644
--- a/library/src/com/nostra13/universalimageloader/core/DisplayImageOptions.java
+++ b/library/src/com/nostra13/universalimageloader/core/DisplayImageOptions.java
@@ -131,7 +131,7 @@
 	}
 
 	public Drawable getImageOnLoading(Resources res) {
-		return imageResOnFail != 0 ? res.getDrawable(imageResOnLoading) : imageOnLoading;
+		return imageResOnLoading != 0 ? res.getDrawable(imageResOnLoading) : imageOnLoading;
 	}
 
 	public Drawable getImageForEmptyUri(Resources res) {
