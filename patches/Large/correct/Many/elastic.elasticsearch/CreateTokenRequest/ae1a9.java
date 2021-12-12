diff --git a/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/CreateTokenRequest.java b/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/CreateTokenRequest.java
index aa28605..5956e1a 100644
--- a/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/CreateTokenRequest.java
+++ b/plugin/core/src/main/java/org/elasticsearch/xpack/core/security/action/token/CreateTokenRequest.java
@@ -142,7 +142,7 @@
             out.writeOptionalString(refreshToken);
         } else {
             if ("refresh_token".equals(grantType)) {
-                throw new UnsupportedOperationException("a refresh request cannot be sent to an older version");
+                throw new IllegalArgumentException("a refresh request cannot be sent to an older version");
             } else {
                 out.writeString(username);
                 final byte[] passwordBytes = CharArrays.toUtf8Bytes(password.getChars());
