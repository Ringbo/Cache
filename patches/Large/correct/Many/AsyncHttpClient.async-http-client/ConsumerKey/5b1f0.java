diff --git a/client/src/main/java/org/asynchttpclient/oauth/ConsumerKey.java b/client/src/main/java/org/asynchttpclient/oauth/ConsumerKey.java
index d2a8554..552a132 100644
--- a/client/src/main/java/org/asynchttpclient/oauth/ConsumerKey.java
+++ b/client/src/main/java/org/asynchttpclient/oauth/ConsumerKey.java
@@ -26,7 +26,7 @@
   private final String secret;
   private final String percentEncodedKey;
 
-  ConsumerKey(String key, String secret) {
+  public ConsumerKey(String key, String secret) {
     this.key = key;
     this.secret = secret;
     this.percentEncodedKey = Utf8UrlEncoder.percentEncodeQueryElement(key);
@@ -40,7 +40,7 @@
     return secret;
   }
 
-  String getPercentEncodedKey() {
+  public String getPercentEncodedKey() {
     return percentEncodedKey;
   }
 
