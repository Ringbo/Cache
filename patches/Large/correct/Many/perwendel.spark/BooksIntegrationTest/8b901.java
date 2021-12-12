diff --git a/src/test/java/spark/BooksIntegrationTest.java b/src/test/java/spark/BooksIntegrationTest.java
index 00284df..529b715 100644
--- a/src/test/java/spark/BooksIntegrationTest.java
+++ b/src/test/java/spark/BooksIntegrationTest.java
@@ -167,7 +167,7 @@
     @Test
     public void wontFindBook() {
         try {
-            doMethod("GET", "/books/" + bookId, null);
+            getResponse("GET", "/books/" + bookId, null);
         } catch (Exception e) {
             if (e instanceof FileNotFoundException) {
                 assertTrue(true);
