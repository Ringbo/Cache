diff --git a/rest-assured/src/main/java/com/jayway/restassured/builder/RequestSpecBuilder.java b/rest-assured/src/main/java/com/jayway/restassured/builder/RequestSpecBuilder.java
index ed8cb89..4e8a5dd 100644
--- a/rest-assured/src/main/java/com/jayway/restassured/builder/RequestSpecBuilder.java
+++ b/rest-assured/src/main/java/com/jayway/restassured/builder/RequestSpecBuilder.java
@@ -942,7 +942,7 @@
      * @return The request specification
      */
     public RequestSpecBuilder addMultiPart(String controlName, String contentBody, String mimeType) {
-        spec.multiPart(controlName, mimeType);
+        spec.multiPart(controlName, contentBody, mimeType);
         return this;
     }
 
