diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java
index 327f257..bf4bf4d 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/adapters/ReaderPostAdapter.java
@@ -392,7 +392,7 @@
                         R.drawable.ic_placeholder_gravatar_grey_lighten_20_100dp);
 
         mImageManager.load(holder.mImgBlavatar, GravatarUtils.fixGravatarUrl(post.getBlogImageUrl(), mAvatarSzSmall),
-                R.drawable.ic_placeholder_blavatar_grey_lighten_20_40dp, ScaleType.CENTER);
+                R.drawable.ic_placeholder_blavatar_grey_lighten_20_40dp);
 
         holder.mTxtTitle.setText(ReaderXPostUtils.getXPostTitle(post));
         holder.mTxtSubtitle.setText(ReaderXPostUtils.getXPostSubtitleHtml(post));
@@ -440,7 +440,7 @@
             holder.mImgAvatarOrBlavatar.setVisibility(View.VISIBLE);
         } else if (post.hasBlogImageUrl()) {
             String imageUrl = GravatarUtils.fixGravatarUrl(post.getBlogImageUrl(), mAvatarSzMedium);
-            mImageManager.load(holder.mImgAvatarOrBlavatar, imageUrl, null, ScaleType.CENTER);
+            mImageManager.load(holder.mImgAvatarOrBlavatar, imageUrl, null);
             holder.mImgAvatarOrBlavatar.setVisibility(View.VISIBLE);
         } else {
             mImageManager.cancelRequestAndClearImageView(holder.mImgAvatarOrBlavatar);
@@ -470,7 +470,7 @@
             holder.mTxtPhotoTitle.setVisibility(View.VISIBLE);
             holder.mTxtPhotoTitle.setText(post.getTitle());
             mImageManager.load(holder.mImgFeatured, post.getFeaturedImageForDisplay(mPhotonWidth, mPhotonHeight),
-                    ScaleType.CENTER_CROP);
+                    null, ScaleType.CENTER_CROP);
             holder.mThumbnailStrip.setVisibility(View.GONE);
         } else {
             mImageManager.cancelRequestAndClearImageView(holder.mImgFeatured);
@@ -500,8 +500,8 @@
 
                     @Override public void showPlaceholder() {
                         mImageManager.load(holder.mImgFeatured, new ColorDrawable(
-                                        ContextCompat.getColor(holder.mImgFeatured.getContext(), R.color
-                                                .grey_lighten_30)), ScaleType.CENTER);
+                                        ContextCompat.getColor(holder.mImgFeatured.getContext(),
+                                                R.color.grey_lighten_30)));
                     }
 
                     @Override public void cacheThumbnailUrl(String thumbnailUrl) {
@@ -513,7 +513,7 @@
                 titleMargin = mMarginLarge;
             } else if (post.hasFeaturedImage()) {
                 mImageManager.load(holder.mImgFeatured, post.getFeaturedImageForDisplay(mPhotonWidth, mPhotonHeight),
-                        ScaleType.CENTER_CROP);
+                        null, ScaleType.CENTER_CROP);
                 holder.mFramePhoto.setVisibility(View.VISIBLE);
                 holder.mThumbnailStrip.setVisibility(View.GONE);
                 titleMargin = mMarginLarge;
@@ -643,7 +643,7 @@
                 // BLAVATAR
                 mImageManager.load(postHolder.mImgDiscoverAvatar,
                         GravatarUtils.fixGravatarUrl(discoverData.getAvatarUrl(), mAvatarSzSmall),
-                        R.drawable.ic_placeholder_blavatar_grey_lighten_20_40dp, ScaleType.CENTER);
+                        R.drawable.ic_placeholder_blavatar_grey_lighten_20_40dp);
                 // site picks show "Visit [BlogName]" link - tapping opens the blog preview if
                 // we have the blogId, if not show blog in internal webView
                 postHolder.mLayoutDiscover.setOnClickListener(new View.OnClickListener() {
