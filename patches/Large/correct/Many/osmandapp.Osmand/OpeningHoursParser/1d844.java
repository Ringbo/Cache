diff --git a/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java b/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
index 0ea1fdf..1514f5f 100644
--- a/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
+++ b/OsmAnd-java/src/net/osmand/util/OpeningHoursParser.java
@@ -154,18 +154,18 @@
 			for (OpeningHoursRule r : rules) {
 				if (r.containsPreviousDay(cal) && r.containsMonth(cal)) {
 					if (r.isOpenedForTime(cal, true)) {
-						ruleOpen = r.toRuleString(true);
+						ruleOpen = r.toLocalRuleString();
 					} else {
-						ruleClosed = r.toRuleString(true);
+						ruleClosed = r.toLocalRuleString();
 					}
 				}
 			}
 			for (OpeningHoursRule r : rules) {
 				if (r.containsDay(cal) && r.containsMonth(cal)) {
 					if (r.isOpenedForTime(cal, false)) {
-						ruleOpen = r.toRuleString(true);
+						ruleOpen = r.toLocalRuleString();
 					} else {
-						ruleClosed = r.toRuleString(true);
+						ruleClosed = r.toLocalRuleString();
 					}
 				}
 			}
