diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/JoseSessionTokenProvider.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/JoseSessionTokenProvider.java
index edd14a6..5901652 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/JoseSessionTokenProvider.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/provider/JoseSessionTokenProvider.java
@@ -124,7 +124,7 @@
         String stateString = jwe.decrypt(sessionToken).getContentText();
         JwsSignatureVerifier jws = getInitializedSigVerifier();
         if (jws != null) {
-            stateString = JwsUtils.verify(jws, stateString).getUnsignedEncodedSequence();
+            stateString = JwsUtils.verify(jws, stateString).getDecodedJwsPayload();
         }
         return stateString;
     }
