diff --git a/support/cas-server-support-saml-googleapps/src/main/java/org/apereo/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java b/support/cas-server-support-saml-googleapps/src/main/java/org/apereo/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java
index 618a438..ffa9244 100644
--- a/support/cas-server-support-saml-googleapps/src/main/java/org/apereo/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java
+++ b/support/cas-server-support-saml-googleapps/src/main/java/org/apereo/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java
@@ -223,7 +223,7 @@
         LOGGER.debug("Loading Google Apps private key from [{}] with key algorithm [{}]",
                 bean.getLocation(), bean.getAlgorithm());
         bean.afterPropertiesSet();
-        LOGGER.debug("Creating Google Apps private key instance via [{}]", this.publicKeyLocation);
+        LOGGER.debug("Creating Google Apps private key instance via [{}]", this.privateKeyLocation);
         this.privateKey = bean.getObject();
     }
 
