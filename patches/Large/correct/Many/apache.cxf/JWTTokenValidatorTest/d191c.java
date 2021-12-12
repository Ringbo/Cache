diff --git a/services/sts/sts-core/src/test/java/org/apache/cxf/sts/token/validator/JWTTokenValidatorTest.java b/services/sts/sts-core/src/test/java/org/apache/cxf/sts/token/validator/JWTTokenValidatorTest.java
index 13a60b8..03aad63 100644
--- a/services/sts/sts-core/src/test/java/org/apache/cxf/sts/token/validator/JWTTokenValidatorTest.java
+++ b/services/sts/sts-core/src/test/java/org/apache/cxf/sts/token/validator/JWTTokenValidatorTest.java
@@ -441,7 +441,7 @@
         
         private String role;
         
-        public RoleJWTClaimsProvider(String role) {
+        RoleJWTClaimsProvider(String role) {
             this.role = role;
         }
         
