diff --git a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java
index 82d650a..75ae9f6 100644
--- a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java
+++ b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java
@@ -189,7 +189,7 @@
             // Validate the Assertion
             validateAssertion(assertion, tokenToRenew, cachedToken, tokenParameters);
             
-            SamlAssertionWrapper renewedAssertion = new SamlAssertionWrapper(assertion.getXmlObject());
+            SamlAssertionWrapper renewedAssertion = new SamlAssertionWrapper(assertion.getSamlObject());
             String oldId = createNewId(renewedAssertion);
             // Remove the previous token (now expired) from the cache
             tokenStore.remove(oldId);
