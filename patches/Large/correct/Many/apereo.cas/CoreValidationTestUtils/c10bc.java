diff --git a/core/cas-server-core-validation/src/test/java/org/apereo/cas/validation/CoreValidationTestUtils.java b/core/cas-server-core-validation/src/test/java/org/apereo/cas/validation/CoreValidationTestUtils.java
index 9e21048..58f73ae 100644
--- a/core/cas-server-core-validation/src/test/java/org/apereo/cas/validation/CoreValidationTestUtils.java
+++ b/core/cas-server-core-validation/src/test/java/org/apereo/cas/validation/CoreValidationTestUtils.java
@@ -33,7 +33,7 @@
 
         Arrays.stream(extraPrincipals).map(CoreAuthenticationTestUtils::getAuthentication).forEach(list::add);
         return new ImmutableAssertion(CoreAuthenticationTestUtils.getAuthentication(),
-                list, RegisteredServiceTestUtils.getService(), fromNewLogin);
+                list, fromNewLogin, RegisteredServiceTestUtils.getService());
     }
 
 }
