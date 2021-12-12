diff --git a/core/src/test/java/org/springframework/security/ui/preauth/j2ee/J2eeBasedPreAuthenticatedWebAuthenticationDetailsSourceTests.java b/core/src/test/java/org/springframework/security/ui/preauth/j2ee/J2eeBasedPreAuthenticatedWebAuthenticationDetailsSourceTests.java
index 37307cd..31ace40 100755
--- a/core/src/test/java/org/springframework/security/ui/preauth/j2ee/J2eeBasedPreAuthenticatedWebAuthenticationDetailsSourceTests.java
+++ b/core/src/test/java/org/springframework/security/ui/preauth/j2ee/J2eeBasedPreAuthenticatedWebAuthenticationDetailsSourceTests.java
@@ -130,7 +130,7 @@
 		result.setAddPrefixIfAlreadyExisting(false);
 		result.setConvertAttributeToLowerCase(false);
 		result.setConvertAttributeToUpperCase(false);
-		result.seAttributePrefix("");
+		result.setAttributePrefix("");
 		return result;
 	}
 
