diff --git a/android-gif-drawable/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java b/android-gif-drawable/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java
index 0ea4765..6350817 100755
--- a/android-gif-drawable/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java
+++ b/android-gif-drawable/src/main/java/pl/droidsonroids/gif/GifInfoHandle.java
@@ -74,7 +74,7 @@
 		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O_MR1) {
 			try {
 				nativeFileDescriptor = getNativeFileDescriptor(fileDescriptor);
-			} catch (ErrnoException e) {
+			} catch (Exception e) {
 				throw new GifIOException(GifError.OPEN_FAILED.errorCode, e.getMessage());
 			}
 		} else {
