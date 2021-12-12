diff --git a/picasso/src/test/java/com/squareup/picasso/PicassoTest.java b/picasso/src/test/java/com/squareup/picasso/PicassoTest.java
index 179b378..073c442 100644
--- a/picasso/src/test/java/com/squareup/picasso/PicassoTest.java
+++ b/picasso/src/test/java/com/squareup/picasso/PicassoTest.java
@@ -702,7 +702,7 @@
     transformations.add(nullTransformation);
 
     Request request =
-        new Request(picasso, CONTENT_1_URL, mock(ImageView.class), null, transformations, null,
+        new Request(picasso, CONTENT_1_URL, 0, mock(ImageView.class), null, transformations, null,
             Type.CONTENT, 0, null);
 
     try {
