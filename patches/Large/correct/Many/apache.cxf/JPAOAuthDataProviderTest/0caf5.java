diff --git a/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProviderTest.java b/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProviderTest.java
index ec0c020..8b23e22 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProviderTest.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProviderTest.java
@@ -74,7 +74,7 @@
         compareClients(c, c2);
         
         c2.setClientSecret("567");
-        provider.setClient(c);
+        provider.setClient(c2);
         Client c22 = provider.getClient(c.getClientId());
         compareClients(c2, c22);
         
