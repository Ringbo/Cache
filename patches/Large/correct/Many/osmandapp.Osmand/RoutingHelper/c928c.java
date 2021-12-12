diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index f79438e..2bbb47f 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -709,7 +709,7 @@
 	}
 	
 		
-	public static String formatStreetName(String name, String ref, String destination) {
+	public String formatStreetName(String name, String ref, String destination) {
 	//Original version returned:
 	// 1. ref + " " + dest
 	// 2. dest
