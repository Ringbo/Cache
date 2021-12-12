diff --git a/client/src/main/java/org/asynchttpclient/oauth/OAuthSignatureCalculator.java b/client/src/main/java/org/asynchttpclient/oauth/OAuthSignatureCalculator.java
index c0122c3..bc65919 100644
--- a/client/src/main/java/org/asynchttpclient/oauth/OAuthSignatureCalculator.java
+++ b/client/src/main/java/org/asynchttpclient/oauth/OAuthSignatureCalculator.java
@@ -41,7 +41,7 @@
    * @param consumerAuth Consumer key to use for signature calculation
    * @param userAuth     Request/access token to use for signature calculation
    */
-  OAuthSignatureCalculator(ConsumerKey consumerAuth, RequestToken userAuth) {
+  public OAuthSignatureCalculator(ConsumerKey consumerAuth, RequestToken userAuth) {
     this.consumerAuth = consumerAuth;
     this.userAuth = userAuth;
   }
