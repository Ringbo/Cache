diff --git a/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterService.java b/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterService.java
index d52f996..435ac50 100644
--- a/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterService.java
+++ b/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterService.java
@@ -132,7 +132,7 @@
             if (ssl.has(CommonAttributes.CIPHER_SUITE))
                 config.setSslCiphers(ssl.get(CommonAttributes.CIPHER_SUITE).asString());
             if (ssl.has(CommonAttributes.PROTOCOL))
-                config.setSslKeyAlias(ssl.get(CommonAttributes.PROTOCOL).asString());
+                config.setSslProtocol(ssl.get(CommonAttributes.PROTOCOL).asString());
             if (ssl.has(CommonAttributes.CA_CERTIFICATE_FILE))
                 config.setSslTrustStore(ssl.get(CommonAttributes.CA_CERTIFICATE_FILE).asString());
             if (ssl.has(CommonAttributes.CA_REVOCATION_URL))
@@ -144,9 +144,9 @@
             config.setProxyList(modelconf.get(CommonAttributes.PROXY_LIST).asString());
         }
         if (modelconf.hasDefined(CommonAttributes.PROXY_URL))
-            config.setProxyList(modelconf.get(CommonAttributes.PROXY_URL).asString());
+            config.setProxyURL(modelconf.get(CommonAttributes.PROXY_URL).asString());
         if (modelconf.has(CommonAttributes.ADVERTISE_SECURITY_KEY))
-            config.setProxyList(modelconf.get(CommonAttributes.ADVERTISE_SECURITY_KEY).asString());
+            config.setAdvertiseSecurityKey(modelconf.get(CommonAttributes.ADVERTISE_SECURITY_KEY).asString());
 
         if (modelconf.hasDefined(CommonAttributes.EXCLUDED_CONTEXTS)) {
             // read the default host.
