diff --git a/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/grants/code/JPACMTOAuthDataProviderTest.java b/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/grants/code/JPACMTOAuthDataProviderTest.java
index c390b6a..7ff03bd 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/grants/code/JPACMTOAuthDataProviderTest.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/test/java/org/apache/cxf/rs/security/oauth2/grants/code/JPACMTOAuthDataProviderTest.java
@@ -115,7 +115,7 @@
         List<String> atl = rtl.get(0).getAccessTokens();
         assertNotNull(atl);
 
-        assertEquals(2, atl.size());
+        assertEquals(4, atl.size());
     }
 }
 
