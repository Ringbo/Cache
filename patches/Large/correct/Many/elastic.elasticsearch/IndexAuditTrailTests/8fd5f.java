diff --git a/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java b/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
index 655324b..5ea1410 100644
--- a/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
@@ -161,7 +161,7 @@
             Settings.Builder builder = Settings.builder()
                     .put(settings)
                     .put(ShieldPlugin.ENABLED_SETTING_NAME, useShield)
-                    .put(remoteSettings(NetworkAddress.format(inet.address().getAddress()), inet.address().getPort(), cluster2Name))
+                    .put(remoteSettings(NetworkAddress.formatAddress(inet.address().getAddress()), inet.address().getPort(), cluster2Name))
                     .put("shield.audit.index.client.shield.user", ShieldSettingsSource.DEFAULT_USER_NAME + ":" + ShieldSettingsSource.DEFAULT_PASSWORD);
 
             if (useSSL) {
