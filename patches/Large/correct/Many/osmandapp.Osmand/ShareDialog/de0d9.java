diff --git a/OsmAnd/src/net/osmand/plus/activities/actions/ShareDialog.java b/OsmAnd/src/net/osmand/plus/activities/actions/ShareDialog.java
index 89a4d73..b848c88 100644
--- a/OsmAnd/src/net/osmand/plus/activities/actions/ShareDialog.java
+++ b/OsmAnd/src/net/osmand/plus/activities/actions/ShareDialog.java
@@ -59,7 +59,7 @@
 		}
 		share.add(new ShareType(longExplanation, EMAIL));
 		share.add(new ShareType(shortExplanation, SMS));
-		share.add(new ShareType(shortExplanation, CLIPBOARD));
+		share.add(new ShareType(url, CLIPBOARD));
 		share.add(new ShareType(url, QR));
 		return this;
 	}
