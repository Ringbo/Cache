diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/integration/CameraDeviceBinderTest.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/integration/CameraDeviceBinderTest.java
index 1f478d2..5e4fabd 100644
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/integration/CameraDeviceBinderTest.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/integration/CameraDeviceBinderTest.java
@@ -271,10 +271,10 @@
         // (streaming)
 
         int requestId1;
-        requestId1 = mCameraUser.submitRequest(request, /* streaming */true);
+        requestId1 = mCameraUser.submitRequest(request, /* streaming */false);
         assertTrue("Request IDs should be non-negative", requestId1 >= 0);
 
-        int requestIdStreaming = mCameraUser.submitRequest(request, /* streaming */false);
+        int requestIdStreaming = mCameraUser.submitRequest(request, /* streaming */true);
         assertTrue("Request IDs should be non-negative", requestIdStreaming >= 0);
         assertNotSame("Request IDs should be unique for multiple requests", requestId1,
                 requestIdStreaming);
