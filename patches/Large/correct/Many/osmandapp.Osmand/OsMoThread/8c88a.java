diff --git a/OsmAnd/src/net/osmand/plus/osmo/OsMoThread.java b/OsmAnd/src/net/osmand/plus/osmo/OsMoThread.java
index 1dbc5d4..a835960 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/OsMoThread.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/OsMoThread.java
@@ -252,7 +252,7 @@
 				}
 			}
 			boolean error = false;
-			if(obj != null && !obj.has("error")) {
+			if(obj != null && obj.has("error")) {
 				error = true;
 				try {
 					service.showErrorMessage(obj.getString("description"));
