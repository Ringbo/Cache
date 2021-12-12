diff --git a/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java b/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java
index 964f680..d840312 100644
--- a/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java
+++ b/modules/core/src/test/java/org/apache/ignite/testframework/GridTestUtils.java
@@ -1353,7 +1353,7 @@
             U.resolveIgnitePath(GridTestProperties.getProperty("ssl.keystore.path")).getAbsolutePath());
         factory.setKeyStorePassword(GridTestProperties.getProperty("ssl.keystore.password").toCharArray());
 
-        factory.setTrustManagers(GridSslBasicContextFactory.getDisabledTrustManager());
+        factory.setTrustManagers(SslContextFactory.getDisabledTrustManager());
 
         return factory;
     }
