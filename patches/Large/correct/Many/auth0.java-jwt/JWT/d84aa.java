diff --git a/lib/src/main/java/com/auth0/jwt/JWT.java b/lib/src/main/java/com/auth0/jwt/JWT.java
index c8f09c4..6547f8d 100644
--- a/lib/src/main/java/com/auth0/jwt/JWT.java
+++ b/lib/src/main/java/com/auth0/jwt/JWT.java
@@ -9,15 +9,15 @@
 public abstract class JWT implements DecodedJWT {
 
     /**
-     * Decode a given JWT token.
+     * Decode a given Json Web Token.
      * <p>
      * Note that this method <b>doesn't verify the token's signature!</b> Use it only if you trust the token or you already verified it.
      *
      * @param token with jwt format as string.
-     * @return a decoded token.
+     * @return a decoded JWT.
      * @throws JWTDecodeException if any part of the token contained an invalid jwt or JSON format of each of the jwt parts.
      */
-    public static JWT decode(String token) throws JWTDecodeException {
+    public static DecodedJWT decode(String token) throws JWTDecodeException {
         return new JWTDecoder(token);
     }
 
@@ -33,9 +33,9 @@
     }
 
     /**
-     * Returns a JWT builder used to create and sign jwt tokens
+     * Returns a Json Web Token builder used to create and sign tokens
      *
-     * @return a jwt token builder.
+     * @return a token builder.
      */
     public static JWTCreator.Builder create() {
         return JWTCreator.init();
