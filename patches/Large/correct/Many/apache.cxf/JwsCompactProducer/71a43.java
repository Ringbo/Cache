diff --git a/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactProducer.java b/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactProducer.java
index 88ec0f6..d3b6931 100644
--- a/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactProducer.java
+++ b/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactProducer.java
@@ -65,7 +65,7 @@
         }
         return getUnsignedEncodedToken() + "." + (noSignature ? "" : signature);
     }
-    public void signWith(JwsSignatureVerifier signer) { 
+    public void signWith(JwsSignatureProvider signer) { 
         setSignatureOctets(signer.sign(token.getHeaders(), getUnsignedEncodedToken()));
     }
     
