diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/WikivoyageUtils.java b/OsmAnd/src/net/osmand/plus/wikivoyage/WikivoyageUtils.java
index 3a2710f..70f500d 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/WikivoyageUtils.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/WikivoyageUtils.java
@@ -12,7 +12,7 @@
 			case ON:
 				break;
 			case OFF:
-				rc.networkPolicy(NetworkPolicy.NO_CACHE, NetworkPolicy.OFFLINE);
+				rc.networkPolicy(NetworkPolicy.OFFLINE);
 				break;
 			case WIFI:
 				if (!settings.isWifiConnected()) {
