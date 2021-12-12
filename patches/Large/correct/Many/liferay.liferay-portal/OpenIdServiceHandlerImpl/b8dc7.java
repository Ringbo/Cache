diff --git a/modules/portal-security/portal-security-sso-openid/src/main/java/com/liferay/portal/security/sso/openid/internal/OpenIdServiceHandlerImpl.java b/modules/portal-security/portal-security-sso-openid/src/main/java/com/liferay/portal/security/sso/openid/internal/OpenIdServiceHandlerImpl.java
index 26add3d..e376163 100644
--- a/modules/portal-security/portal-security-sso-openid/src/main/java/com/liferay/portal/security/sso/openid/internal/OpenIdServiceHandlerImpl.java
+++ b/modules/portal-security/portal-security-sso-openid/src/main/java/com/liferay/portal/security/sso/openid/internal/OpenIdServiceHandlerImpl.java
@@ -410,7 +410,7 @@
 		}
 		catch (IOException ioe) {
 			throw new SystemException(
-				"Unable to communicate with OpenId provider", e);
+				"Unable to communicate with OpenId provider", ioe);
 		}
 	}
 
