diff --git a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/provider/SAMLTokenProvider.java b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/provider/SAMLTokenProvider.java
index b3dd9cc..7a1e70d 100644
--- a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/provider/SAMLTokenProvider.java
+++ b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/token/provider/SAMLTokenProvider.java
@@ -201,14 +201,14 @@
     public void setAuthDecisionStatementProviders(
         List<AuthDecisionStatementProvider> authDecisionStatementProviders
     ) {
-        this.authenticationDecisionStatementProviders = authDecisionStatementProviders;
+        this.authDecisionStatementProviders = authDecisionStatementProviders;
     }
     
     /**
      * Get the List of AuthDecisionStatementProviders.
      */
     public List<AuthDecisionStatementProvider> getAuthDecisionStatementProviders() {
-        return authenticationDecisionStatementProviders;
+        return authDecisionStatementProviders;
     }
 
     /**
