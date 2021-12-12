diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/CredentialFactory.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/CredentialFactory.java
index ce29d91..884a77a 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/CredentialFactory.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/CredentialFactory.java
@@ -25,5 +25,5 @@
  * Construct an oauth credential to be used by the SDK and the SDK workers.
  */
 public interface CredentialFactory {
-  public Credential getCredential() throws IOException, GeneralSecurityException;
+  Credential getCredential() throws IOException, GeneralSecurityException;
 }
