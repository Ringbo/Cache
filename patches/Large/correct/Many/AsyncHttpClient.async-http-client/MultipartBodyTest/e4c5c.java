diff --git a/api/src/test/java/org/asynchttpclient/multipart/MultipartBodyTest.java b/api/src/test/java/org/asynchttpclient/multipart/MultipartBodyTest.java
index 9cbccb9..1e8ba28 100644
--- a/api/src/test/java/org/asynchttpclient/multipart/MultipartBodyTest.java
+++ b/api/src/test/java/org/asynchttpclient/multipart/MultipartBodyTest.java
@@ -91,7 +91,7 @@
                 } catch (IOException ie) {
                     Assert.fail("read failure");
                 }
-                if (readBytes >= 0) {
+                if (readBytes > 0) {
                     totalBytes += readBytes;
                 } else {
                     last = true;
