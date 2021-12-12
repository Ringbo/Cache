diff --git a/DataExtractionOSM/src/net/osmand/data/preparation/address/IndexAddressCreator.java b/DataExtractionOSM/src/net/osmand/data/preparation/address/IndexAddressCreator.java
index 9b45135..23d6cc3 100644
--- a/DataExtractionOSM/src/net/osmand/data/preparation/address/IndexAddressCreator.java
+++ b/DataExtractionOSM/src/net/osmand/data/preparation/address/IndexAddressCreator.java
@@ -685,7 +685,7 @@
 					}
 				}
 			}
-			if (type != null && interpolationInterval > 0) {
+			if (type != null || interpolationInterval > 0) {
 				List<Node> nodesWithHno = new ArrayList<Node>();
 				for (Node n : ((Way) e).getNodes()) {
 					if (n.getTag(OSMTagKey.ADDR_HOUSE_NUMBER) != null && n.getTag(OSMTagKey.ADDR_STREET) != null) {
