diff --git a/core/src/test/java/org/springframework/security/authoritymapping/SimpleRoles2GrantedAuthoritiesMapperTests.java b/core/src/test/java/org/springframework/security/authoritymapping/SimpleRoles2GrantedAuthoritiesMapperTests.java
index 61d33a0..4eb14ed 100755
--- a/core/src/test/java/org/springframework/security/authoritymapping/SimpleRoles2GrantedAuthoritiesMapperTests.java
+++ b/core/src/test/java/org/springframework/security/authoritymapping/SimpleRoles2GrantedAuthoritiesMapperTests.java
@@ -65,7 +65,7 @@
 		String[] expectedGas = { "ROLE_Role1", "ROLE_Role2", "ROLE_ROLE_Role3" };
 		SimpleAttributes2GrantedAuthoritiesMapper mapper = getDefaultMapper();
 		mapper.setAddPrefixIfAlreadyExisting(true);
-		mapper.seAttributePrefix("ROLE_");
+		mapper.setAttributePrefix("ROLE_");
 		testGetGrantedAuthorities(mapper, roles, expectedGas);
 	}
 
@@ -74,7 +74,7 @@
 		String[] expectedGas = { "ROLE_Role1", "ROLE_Role2", "ROLE_Role3" };
 		SimpleAttributes2GrantedAuthoritiesMapper mapper = getDefaultMapper();
 		mapper.setAddPrefixIfAlreadyExisting(false);
-		mapper.seAttributePrefix("ROLE_");
+		mapper.setAttributePrefix("ROLE_");
 		testGetGrantedAuthorities(mapper, roles, expectedGas);
 	}
 
@@ -83,7 +83,7 @@
 		String[] expectedGas = { "ROLE_Role1", "ROLE_Role2", "ROLE_role_Role3" };
 		SimpleAttributes2GrantedAuthoritiesMapper mapper = getDefaultMapper();
 		mapper.setAddPrefixIfAlreadyExisting(false);
-		mapper.seAttributePrefix("ROLE_");
+		mapper.setAttributePrefix("ROLE_");
 		testGetGrantedAuthorities(mapper, roles, expectedGas);
 	}
 
@@ -93,7 +93,7 @@
 		SimpleAttributes2GrantedAuthoritiesMapper mapper = getDefaultMapper();
 		mapper.setAddPrefixIfAlreadyExisting(false);
 		mapper.setConvertAttributeToUpperCase(true);
-		mapper.seAttributePrefix("ROLE_");
+		mapper.setAttributePrefix("ROLE_");
 		testGetGrantedAuthorities(mapper, roles, expectedGas);
 	}
 
@@ -111,7 +111,7 @@
 
 	private SimpleAttributes2GrantedAuthoritiesMapper getDefaultMapper() {
 		SimpleAttributes2GrantedAuthoritiesMapper mapper = new SimpleAttributes2GrantedAuthoritiesMapper();
-		mapper.seAttributePrefix("");
+		mapper.setAttributePrefix("");
 		mapper.setConvertAttributeToLowerCase(false);
 		mapper.setConvertAttributeToUpperCase(false);
 		mapper.setAddPrefixIfAlreadyExisting(false);
