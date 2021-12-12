diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index 2bbb47f..777ae49 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -709,7 +709,7 @@
 	}
 	
 		
-	public String formatStreetName(String name, String ref, String destination) {
+	public static String formatStreetName(String name, String ref, String destination) {
 	//Original version returned:
 	// 1. ref + " " + dest
 	// 2. dest
@@ -733,7 +733,8 @@
 			if (formattedStreetName.length() > 0) {
 				formattedStreetName = formattedStreetName + " ";
 			}
-			formattedStreetName = formattedStreetName + app.getString(R.string.towards) + " " + destination;
+			//formattedStreetName = formattedStreetName + app.getString(R.string.towards) + " " + destination;
+			formattedStreetName = formattedStreetName + " " + destination;
 		}
 		return formattedStreetName;
 
