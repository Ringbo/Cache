diff --git a/sample/src/main/java/pl/droidsonroids/gif/sample/TexturePlaceholderFragment.java b/sample/src/main/java/pl/droidsonroids/gif/sample/TexturePlaceholderFragment.java
index d9cb252..0db0e25 100644
--- a/sample/src/main/java/pl/droidsonroids/gif/sample/TexturePlaceholderFragment.java
+++ b/sample/src/main/java/pl/droidsonroids/gif/sample/TexturePlaceholderFragment.java
@@ -49,7 +49,7 @@
 		bitmap.recycle();
 	}
 
-	private class SlowLoadingInputStream extends BufferedInputStream {
+	private static class SlowLoadingInputStream extends BufferedInputStream {
 
 		private final AssetFileDescriptor mAssetFileDescriptor;
 		private int mSleepTimeMillis = 5;
@@ -60,15 +60,15 @@
 		}
 
 		@Override
-		public int read(@NonNull byte[] b) throws IOException {
+		public int read(@NonNull byte[] buffer) throws IOException {
 			SystemClock.sleep(mSleepTimeMillis);
-			return super.read(b);
+			return super.read(buffer);
 		}
 
 		@Override
-		public int read(@NonNull byte[] b, int off, int len) throws IOException {
+		public int read(@NonNull byte[] buffer, int off, int len) throws IOException {
 			SystemClock.sleep(mSleepTimeMillis);
-			return super.read(b, off, len);
+			return super.read(buffer, off, len);
 		}
 
 		@Override
