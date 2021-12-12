diff --git a/portal-impl/src/com/liferay/portal/server/capabilities/ServerCapabilitiesUtil.java b/portal-impl/src/com/liferay/portal/server/capabilities/ServerCapabilitiesUtil.java
index 56af0e4..7ef144d 100644
--- a/portal-impl/src/com/liferay/portal/server/capabilities/ServerCapabilitiesUtil.java
+++ b/portal-impl/src/com/liferay/portal/server/capabilities/ServerCapabilitiesUtil.java
@@ -35,7 +35,7 @@
 			serverCapabilities = new GlassfishServerCapabilities();
 		}
 		else if (ServerDetector.isJBoss()) {
-			serverCapabilities = new JBossServerCapabilities2();
+			serverCapabilities = new JBossServerCapabilities();
 		}
 		else if (ServerDetector.isJetty()) {
 			serverCapabilities = new JettyServerCapabilities();
