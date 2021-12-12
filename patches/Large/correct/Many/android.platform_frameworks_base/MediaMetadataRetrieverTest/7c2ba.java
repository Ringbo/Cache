diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/MediaMetadataRetrieverTest.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/MediaMetadataRetrieverTest.java
index 484f6e7..a0c72e6 100644
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/MediaMetadataRetrieverTest.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/MediaMetadataRetrieverTest.java
@@ -87,7 +87,7 @@
                     continue;
                 }
                 retriever.setDataSource(MediaNames.THUMBNAIL_CAPTURE_TEST_FILES[i]);
-                Bitmap bitmap = retriever.captureFrame();
+                Bitmap bitmap = retriever.getFrameAtTime(-1);
                 assertTrue(bitmap != null);
                 try {
                     java.io.OutputStream stream = new FileOutputStream(MediaNames.THUMBNAIL_CAPTURE_TEST_FILES[i] + ".jpg");
@@ -146,7 +146,7 @@
         MediaMetadataRetriever retriever = new MediaMetadataRetriever();
         try {
             retriever.setDataSource(MediaNames.TEST_PATH_1);
-            Bitmap bitmap = retriever.captureFrame();
+            Bitmap bitmap = retriever.getFrameAtTime(-1);
             assertTrue(bitmap != null);
             try {
                 java.io.OutputStream stream = new FileOutputStream("/sdcard/thumbnailout.jpg");
@@ -164,7 +164,7 @@
         assertTrue(!hasFailed);
     }
 
-    // If setDataSource() has not been called, both captureFrame() and extractMetadata() must
+    // If setDataSource() has not been called, both getFrameAtTime() and extractMetadata() must
     // return null.
     @MediumTest
     public static void testBasicAbnormalMethodCallSequence() {
@@ -175,7 +175,7 @@
             Log.e(TAG, "No album metadata expected, but is available");
             hasFailed = true;
         }
-        if (retriever.captureFrame() != null) {
+        if (retriever.getFrameAtTime(-1) != null) {
             Log.e(TAG, "No frame expected, but is available");
             hasFailed = true;
         }
@@ -249,13 +249,13 @@
         MediaMetadataRetriever retriever = new MediaMetadataRetriever();
         boolean hasFailed = false;
         retriever.setDataSource(MediaNames.TEST_PATH_1);
-        assertTrue(retriever.captureFrame() != null);
+        assertTrue(retriever.getFrameAtTime(-1) != null);
         assertTrue(retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_NUM_TRACKS) != null);
 
         // Do not capture frame or retrieve metadata
         retriever.setMode(MediaMetadataRetriever.MODE_CAPTURE_FRAME_ONLY & MediaMetadataRetriever.MODE_GET_METADATA_ONLY);
         retriever.setDataSource(MediaNames.TEST_PATH_1);
-        if (retriever.captureFrame() != null) {
+        if (retriever.getFrameAtTime(-1) != null) {
             Log.e(TAG, "No frame expected, but is available");
             hasFailed = true;
         }
@@ -272,7 +272,7 @@
         // Retriever metadata only
         retriever.setMode(MediaMetadataRetriever.MODE_GET_METADATA_ONLY);
         retriever.setDataSource(MediaNames.TEST_PATH_1);
-        if (retriever.captureFrame() != null) {
+        if (retriever.getFrameAtTime(-1) != null) {
             Log.e(TAG, "No frame expected, but is available");
             hasFailed = true;
         }
@@ -280,7 +280,7 @@
         // Capture frame and retrieve metadata
         retriever.setMode(MediaMetadataRetriever.MODE_CAPTURE_FRAME_ONLY | MediaMetadataRetriever.MODE_GET_METADATA_ONLY);
         retriever.setDataSource(MediaNames.TEST_PATH_1);
-        assertTrue(retriever.captureFrame() != null);
+        assertTrue(retriever.getFrameAtTime(-1) != null);
         assertTrue(retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_NUM_TRACKS) != null);
         retriever.release();
         assertTrue(!hasFailed);
