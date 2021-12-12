diff --git a/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java b/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java
index 370d7d4..0e7898d 100644
--- a/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java
+++ b/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java
@@ -631,7 +631,7 @@
 			for (City c : cities) {
 				int size = index.preloadStreets(c, null);
 				List<Street> streets = new ArrayList<Street>(c.getStreets());
-				String cityDescription = (j == BinaryMapAddressReaderAdapter.POSTCODES_TYPE ?
+				String cityDescription = (type == BinaryMapAddressReaderAdapter.POSTCODES_TYPE ?
 						MessageFormat.format("\t\t''{0}'' {1,number,#} street(s) size {2,number,#} bytes", c.getName(verbose.lang), streets.size(), size) :
 						MessageFormat.format("\t\t''{0}'' [{1,number,#}], {2,number,#} street(s) size {3,number,#} bytes", c.getName(verbose.lang), c.getId(), streets.size(), size));
 				print(cityDescription);
