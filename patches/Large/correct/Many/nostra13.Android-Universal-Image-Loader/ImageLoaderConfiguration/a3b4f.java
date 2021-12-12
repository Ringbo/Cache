diff --git a/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java b/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
index b7e1806..c785516 100644
--- a/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
+++ b/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoaderConfiguration.java
@@ -30,6 +30,8 @@
  * @see MemoryCacheAware
  * @see DiscCacheAware
  * @see DisplayImageOptions
+ * @see ImageDownloader
+ * @see FileNameGenerator
  */
 public final class ImageLoaderConfiguration {
 
@@ -263,6 +265,7 @@
 
 		/**
 		 * Sets maximum disc cache size for images (in bytes).<br />
+		 * By default: disc cache is unlimited.<br />
 		 * <b>NOTE:</b> If you use this method then
 		 * {@link com.nostra13.universalimageloader.cache.disc.impl.TotalSizeLimitedDiscCache TotalSizeLimitedDiscCache}
 		 * will be used as disc cache. You can use {@link #discCache(DiscCacheAware)} method for introduction your own
@@ -279,6 +282,7 @@
 
 		/**
 		 * Sets maximum file count in disc cache directory.<br />
+		 * By default: disc cache is unlimited.<br />
 		 * <b>NOTE:</b> If you use this method then
 		 * {@link com.nostra13.universalimageloader.cache.disc.impl.FileCountLimitedDiscCache FileCountLimitedDiscCache}
 		 * will be used as disc cache. You can use {@link #discCache(DiscCacheAware)} method for introduction your own
@@ -294,7 +298,10 @@
 			return this;
 		}
 
-		/** Sets name generator for files cached in disc cache */
+		/**
+		 * Sets name generator for files cached in disc cache.<br />
+		 * Default value - {@link com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator HashCodeFileNameGenerator}
+		 */
 		public Builder discCacheFileNameGenerator(FileNameGenerator fileNameGenerator) {
 			if (discCache != null) Log.w(ImageLoader.TAG, WARNING_DISC_CACHE_ALREADY_SET);
 
@@ -302,7 +309,10 @@
 			return this;
 		}
 
-		/** Sets utility which will be responsible for downloading of image */
+		/**
+		 * Sets utility which will be responsible for downloading of image.<br />
+		 * Default value - {@link com.nostra13.universalimageloader.core.DefaultImageDownloader DefaultImageDownloader}
+		 * */
 		public Builder imageDownloader(ImageDownloader imageDownloader) {
 			if (httpConnectTimeout != DEFAULT_HTTP_CONNECT_TIMEOUT) Log.w(ImageLoader.TAG, WARNING_OVERLAP_CONNECT_TIMEOUT);
 			if (httpReadTimeout != DEFAULT_HTTP_READ_TIMEOUT) Log.w(ImageLoader.TAG, WARNING_OVERLAP_READ_TIMEOUT);
@@ -363,7 +373,7 @@
 					File individualCacheDir = StorageUtils.getIndividualCacheDirectory(context);
 					discCache = new FileCountLimitedDiscCache(individualCacheDir, discCacheFileNameGenerator, discCacheFileCount);
 				} else {
-					File cacheDir = StorageUtils.getIndividualCacheDirectory(context);
+					File cacheDir = StorageUtils.getCacheDirectory(context);
 					discCache = new UnlimitedDiscCache(cacheDir, discCacheFileNameGenerator);
 				}
 			}
