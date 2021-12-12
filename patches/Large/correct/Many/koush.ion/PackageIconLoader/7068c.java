diff --git a/ion/src/com/koushikdutta/ion/loader/PackageIconLoader.java b/ion/src/com/koushikdutta/ion/loader/PackageIconLoader.java
index 8b914b8..0f9a093 100644
--- a/ion/src/com/koushikdutta/ion/loader/PackageIconLoader.java
+++ b/ion/src/com/koushikdutta/ion/loader/PackageIconLoader.java
@@ -35,7 +35,7 @@
     @Override
     public Future<BitmapInfo> loadBitmap(final Ion ion, final String uri) {
         final URI request = URI.create(uri);
-        if (!request.getScheme().startsWith("package"))
+        if (request == null || request.getScheme() == null || !request.getScheme().startsWith("package"))
             return null;
 
         final SimpleFuture<BitmapInfo> ret = new SimpleFuture<BitmapInfo>();
