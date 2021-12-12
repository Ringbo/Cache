diff --git a/src/test/java/com/android/volley/toolbox/ImageRequestTest.java b/src/test/java/com/android/volley/toolbox/ImageRequestTest.java
index 7154d01..a99363e 100644
--- a/src/test/java/com/android/volley/toolbox/ImageRequestTest.java
+++ b/src/test/java/com/android/volley/toolbox/ImageRequestTest.java
@@ -171,6 +171,6 @@
                 Response.ErrorListener.class));
         assertEquals(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 1000);
         assertEquals(ImageRequest.DEFAULT_IMAGE_MAX_RETRIES, 2);
-        assertEquals(ImageRequest.DEFAULT_IMAGE_BACKOFF_MULT, 2f);
+        assertEquals(ImageRequest.DEFAULT_IMAGE_BACKOFF_MULT, 2f, 0);
     }
 }
