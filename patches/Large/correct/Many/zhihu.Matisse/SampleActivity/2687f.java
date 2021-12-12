diff --git a/sample/src/main/java/com/zhihu/matisse/sample/SampleActivity.java b/sample/src/main/java/com/zhihu/matisse/sample/SampleActivity.java
index 187abc9..2884bb9 100644
--- a/sample/src/main/java/com/zhihu/matisse/sample/SampleActivity.java
+++ b/sample/src/main/java/com/zhihu/matisse/sample/SampleActivity.java
@@ -83,7 +83,7 @@
                                             .countable(true)
                                             .capture(true)
                                             .captureStrategy(
-                                                    new CaptureStrategy(true, "com.zhihu.matisse.sample.fileprovider"))
+                                                    new CaptureStrategy(true, "com.zhihu.matisse.sample.fileprovider","test"))
                                             .maxSelectable(9)
                                             .addFilter(new GifSizeFilter(320, 320, 5 * Filter.K * Filter.K))
                                             .gridExpectedSize(
