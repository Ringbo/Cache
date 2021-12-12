diff --git a/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/NonMultiPartUploadITest.java b/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/NonMultiPartUploadITest.java
index 32292c8..f30b987 100644
--- a/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/NonMultiPartUploadITest.java
+++ b/examples/rest-assured-itest-java/src/test/java/com/jayway/restassured/itest/java/NonMultiPartUploadITest.java
@@ -61,7 +61,7 @@
         given().
                 content(bytes).
         when().
-                post("/file").
+                put("/file").
         then().
                 statusCode(200).
                 body(is(new String(bytes)));
@@ -108,7 +108,7 @@
                 contentType(ContentType.BINARY).
                 content(file).
         when().
-                post("/file").
+                put("/file").
         then().
                 statusCode(200).
                 body(equalTo(FileUtils.readFileToString(file)));
@@ -140,7 +140,7 @@
                 contentType(ContentType.BINARY).
                 content(inputStream).
         when().
-                post("/file").
+                put("/file").
         then().
                 statusCode(200).
                 body(equalTo(IOUtils.toString(getClass().getResourceAsStream("/car-records.xsd"))));
