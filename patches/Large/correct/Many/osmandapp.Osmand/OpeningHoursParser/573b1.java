diff --git a/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java b/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
index a44c8b2..0ea1fdf 100644
--- a/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
+++ b/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
@@ -1008,7 +1008,7 @@
 		String assembledString = hours.toStringNoMonths();
 		boolean isCorrect = assembledString.equalsIgnoreCase(timeString);
 		System.out.printf("  %sok: Expected: \"%s\" got: \"%s\"\n",
-				(isCorrect ? "NOT " : ""), timeString, assembledString);
+				(!isCorrect ? "NOT " : ""), timeString, assembledString);
 		if (!isCorrect) {
 			throw new IllegalArgumentException("BUG!!!");
 		}
