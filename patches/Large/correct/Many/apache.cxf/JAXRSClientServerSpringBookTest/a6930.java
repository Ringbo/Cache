diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java
index 83ac587..5f5f37f 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java
@@ -331,13 +331,13 @@
     public void testAddInvalidXmlBook() throws Exception {
         
         doPost("http://localhost:" + PORT + "/the/bookstore/books/convert",
-               500,
+               400,
                "application/xml",
                "resources/add_book.txt",
                null);
         
         doPost("http://localhost:" + PORT + "/the/thebooks/bookstore/books/convert",
-               500,
+               400,
                "application/xml",
                "resources/add_book.txt",
                null);
@@ -348,13 +348,13 @@
     public void testAddInvalidJsonBook() throws Exception {
         
         doPost("http://localhost:" + PORT + "/the/bookstore/books/convert",
-               500,
+               400,
                "application/json",
                "resources/add_book2json_invalid.txt",
                null);
         
         doPost("http://localhost:" + PORT + "/the/thebooks/bookstore/books/convert",
-               500,
+               400,
                "application/json",
                "resources/add_book2json_invalid.txt",
                null);
@@ -539,7 +539,7 @@
             int result = httpclient.executeMethod(post);
             assertEquals(expectedStatus, result);
             
-            if (expectedStatus != 500) {
+            if (expectedStatus != 400) {
                 InputStream expected = getClass().getResourceAsStream(expectedResource);
                 assertEquals(getStringFromInputStream(expected), post.getResponseBodyAsString());
             } else {
