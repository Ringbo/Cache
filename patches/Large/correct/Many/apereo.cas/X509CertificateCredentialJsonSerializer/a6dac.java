diff --git a/support/cas-server-support-x509-core/src/main/java/org/apereo/cas/adaptors/x509/util/X509CertificateCredentialJsonSerializer.java b/support/cas-server-support-x509-core/src/main/java/org/apereo/cas/adaptors/x509/util/X509CertificateCredentialJsonSerializer.java
index ccedbee..83090c0 100644
--- a/support/cas-server-support-x509-core/src/main/java/org/apereo/cas/adaptors/x509/util/X509CertificateCredentialJsonSerializer.java
+++ b/support/cas-server-support-x509-core/src/main/java/org/apereo/cas/adaptors/x509/util/X509CertificateCredentialJsonSerializer.java
@@ -38,7 +38,7 @@
 
             typeSer.writeTypePrefix(generator, typeSer.typeId(value, JsonToken.START_OBJECT));
             serialize(value, generator, serializers);
-            typeSer.writeTypePrefix(generator, typeSer.typeId(value, JsonToken.START_OBJECT));
+            typeSer.writeTypeSuffix(generator, typeSer.typeId(value, JsonToken.START_OBJECT));
         } catch (final Exception e) {
             throw new JsonMappingException(generator, "Unable to serialize X509 certificate", e);
         }
