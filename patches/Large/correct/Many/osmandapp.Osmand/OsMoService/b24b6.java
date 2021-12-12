diff --git a/OsmAnd/src/net/osmand/plus/osmo/OsMoService.java b/OsmAnd/src/net/osmand/plus/osmo/OsMoService.java
index 07af2ae..2f2119b 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/OsMoService.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/OsMoService.java
@@ -168,7 +168,7 @@
 	
 	public String getRegisteredUserName() {
 		SessionInfo si = getCurrentSessionInfo();
-		if(si != null) {
+		if(si != null && si.username != null && si.username.length() > 0) {
 			return si.username;
 		}
 		return null;
