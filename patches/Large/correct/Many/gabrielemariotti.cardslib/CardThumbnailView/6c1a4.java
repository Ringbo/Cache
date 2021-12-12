diff --git a/library/src/main/java/it/gmariotti/cardslib/library/view/component/CardThumbnailView.java b/library/src/main/java/it/gmariotti/cardslib/library/view/component/CardThumbnailView.java
index 74dc87c..b1e6fb9 100644
--- a/library/src/main/java/it/gmariotti/cardslib/library/view/component/CardThumbnailView.java
+++ b/library/src/main/java/it/gmariotti/cardslib/library/view/component/CardThumbnailView.java
@@ -291,7 +291,7 @@
 
 
     protected void addBitmapToMemoryCache(String key, Bitmap bitmap) {
-        if (getBitmapFromMemCache(key) == null) {
+        if (!mLoadingErrorResource && getBitmapFromMemCache(key) == null) {
             if (key!=null && bitmap!=null){
                 mMemoryCache.put(key, bitmap);
             }
