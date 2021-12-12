diff --git a/cas-server-core-services/src/test/java/org/jasig/cas/authentication/support/DefaultCasAttributeEncoderTests.java b/cas-server-core-services/src/test/java/org/jasig/cas/authentication/support/DefaultCasAttributeEncoderTests.java
index b8caf52..e497dc7 100644
--- a/cas-server-core-services/src/test/java/org/jasig/cas/authentication/support/DefaultCasAttributeEncoderTests.java
+++ b/cas-server-core-services/src/test/java/org/jasig/cas/authentication/support/DefaultCasAttributeEncoderTests.java
@@ -43,7 +43,7 @@
         this.attributes.put(CasViewConstants.MODEL_ATTRIBUTE_NAME_PRINCIPAL_CREDENTIAL, newSingleAttribute("PrincipalPassword"));
     }
 
-    private Collection<String> newSingleAttribute(final String attr) {
+    private static Collection<String> newSingleAttribute(final String attr) {
         return Collections.singleton(attr);
     }
 
