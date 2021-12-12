diff --git a/rest-assured/src/main/java/com/jayway/restassured/RestAssured.java b/rest-assured/src/main/java/com/jayway/restassured/RestAssured.java
index 1957a5c..4f85466 100644
--- a/rest-assured/src/main/java/com/jayway/restassured/RestAssured.java
+++ b/rest-assured/src/main/java/com/jayway/restassured/RestAssured.java
@@ -1033,7 +1033,7 @@
      * @param port     The SSL port
      */
     public static AuthenticationScheme certificate(String certURL, String password, String certType, int port) {
-        return certificate(certURL, password, certType, port);
+        return certificate(certURL, password, certType, port, new NoKeystoreSpecImpl());
     }
 
     /**
