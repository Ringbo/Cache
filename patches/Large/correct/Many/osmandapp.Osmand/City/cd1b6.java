diff --git a/OsmAnd-java/src/net/osmand/data/City.java b/OsmAnd-java/src/net/osmand/data/City.java
index 1a93ff9..52c0f3f 100644
--- a/OsmAnd-java/src/net/osmand/data/City.java
+++ b/OsmAnd-java/src/net/osmand/data/City.java
@@ -109,7 +109,7 @@
 		return type;
 	}
 
-	public Collection<Street> getStreets() {
+	public List<Street> getStreets() {
 		return listOfStreets;
 	}
 
