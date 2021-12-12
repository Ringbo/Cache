diff --git a/client/src/main/java/org/asynchttpclient/oauth/RequestToken.java b/client/src/main/java/org/asynchttpclient/oauth/RequestToken.java
index 89a30d6..3dc5364 100644
--- a/client/src/main/java/org/asynchttpclient/oauth/RequestToken.java
+++ b/client/src/main/java/org/asynchttpclient/oauth/RequestToken.java
@@ -28,7 +28,7 @@
   private final String secret;
   private final String percentEncodedKey;
 
-  RequestToken(String key, String token) {
+  public RequestToken(String key, String token) {
     this.key = key;
     this.secret = token;
     this.percentEncodedKey = Utf8UrlEncoder.percentEncodeQueryElement(key);
@@ -42,7 +42,7 @@
     return secret;
   }
 
-  String getPercentEncodedKey() {
+  public String getPercentEncodedKey() {
     return percentEncodedKey;
   }
 
