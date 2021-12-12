diff --git a/DataExtractionOSM/src/net/osmand/data/preparation/IndexVectorMapCreator.java b/DataExtractionOSM/src/net/osmand/data/preparation/IndexVectorMapCreator.java
index fb00c49..cd58f9f 100644
--- a/DataExtractionOSM/src/net/osmand/data/preparation/IndexVectorMapCreator.java
+++ b/DataExtractionOSM/src/net/osmand/data/preparation/IndexVectorMapCreator.java
@@ -173,7 +173,7 @@
 
 	private Node checkOuterWaysEncloseInnerWays(List<List<Way>> completedRings, Map<Entity, String> entities) {
 		List<List<Way>> innerWays = new ArrayList<List<Way>>();
-		Boundary outerBoundary = new Boundary();
+		Boundary outerBoundary = new Boundary(true);
 		Node toReturn = null;
 		for(List<Way> ring : completedRings){
 			boolean innerType = "inner".equals(entities.get(ring.get(0))); //$NON-NLS-1$
