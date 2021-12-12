diff --git a/java/org/apache/tomcat/util/net/openssl/OpenSSLContext.java b/java/org/apache/tomcat/util/net/openssl/OpenSSLContext.java
index ca26cc8..909f16f 100644
--- a/java/org/apache/tomcat/util/net/openssl/OpenSSLContext.java
+++ b/java/org/apache/tomcat/util/net/openssl/OpenSSLContext.java
@@ -391,7 +391,7 @@
             initialized = true;
         } catch (Exception e) {
             log.warn(sm.getString("openssl.errorSSLCtxInit"), e);
-            destroyPools();
+            destroy();
         }
     }
 
