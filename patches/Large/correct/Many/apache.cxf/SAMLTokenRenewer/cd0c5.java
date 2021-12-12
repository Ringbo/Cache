diff --git a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java
index 6dbbbd8..e65f8fb 100644
--- a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java
+++ b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/renewer/SAMLTokenRenewer.java
@@ -612,7 +612,7 @@
                 signedActions.add(WSConstants.SIGN);
                 signedActions.add(WSConstants.UT_SIGN);
                 
-                signedResult.addAll(WSSecurityUtil.fetchAllActionResults(results, signedActions));
+                signedResults.addAll(WSSecurityUtil.fetchAllActionResults(results, signedActions));
             }
             
             TLSSessionInfo tlsInfo = (TLSSessionInfo)messageContext.get(TLSSessionInfo.class.getName());
