diff --git a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/configserver/certificate/ConfigServerKeyStoreRefresher.java b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/configserver/certificate/ConfigServerKeyStoreRefresher.java
index bd71d66..ad00451 100644
--- a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/configserver/certificate/ConfigServerKeyStoreRefresher.java
+++ b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/configserver/certificate/ConfigServerKeyStoreRefresher.java
@@ -51,7 +51,7 @@
 
     public ConfigServerKeyStoreRefresher(
             KeyStoreOptions keyStoreOptions, Runnable keyStoreUpdatedCallback, ConfigServerApi configServerApi) {
-        this(keyStoreOptions, keyStoreUpdatedCallback, configServerApi, Executors.newScheduledThreadPool(0),
+        this(keyStoreOptions, keyStoreUpdatedCallback, configServerApi, Executors.newScheduledThreadPool(1),
                 Clock.systemUTC(), HostName.getLocalhost());
     }
 
