diff --git a/services/src/main/java/org/keycloak/protocol/oidc/TokenManager.java b/services/src/main/java/org/keycloak/protocol/oidc/TokenManager.java
index b728607..fafb2e9 100755
--- a/services/src/main/java/org/keycloak/protocol/oidc/TokenManager.java
+++ b/services/src/main/java/org/keycloak/protocol/oidc/TokenManager.java
@@ -154,7 +154,7 @@
                 throw new OAuthErrorException(OAuthErrorException.INVALID_GRANT, "Invalid refresh token");
             }
             refreshToken = jws.readJsonContent(RefreshToken.class);
-        } catch (IOException e) {
+        } catch (Exception e) {
             throw new OAuthErrorException(OAuthErrorException.INVALID_GRANT, "Invalid refresh token", e);
         }
         if (refreshToken.isExpired()) {
