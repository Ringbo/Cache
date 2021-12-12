diff --git a/OsmAnd-java/src/net/osmand/router/GeneralRouter.java b/OsmAnd-java/src/net/osmand/router/GeneralRouter.java
index 730377c..ecaae20 100644
--- a/OsmAnd-java/src/net/osmand/router/GeneralRouter.java
+++ b/OsmAnd-java/src/net/osmand/router/GeneralRouter.java
@@ -687,7 +687,7 @@
 			if (value instanceof String && value.toString().startsWith("$")) {
 				BitSet mask = tagRuleMask.get(value.toString().substring(1));
 				if (mask != null && mask.intersects(types)) {
-					BitSet findBit = new BitSet(mask.size());
+					BitSet findBit = new BitSet(mask.length());
 					findBit.or(mask);
 					findBit.and(types);
 					int v = findBit.nextSetBit(0);
@@ -768,16 +768,16 @@
 		
 		public void printRule(PrintStream out) {
 			out.print(" Select " + selectValue  + " if ");
-			for(int k = 0; k < filterTypes.size(); k++) {
+			for(int k = 0; k < filterTypes.length(); k++) {
 				if(filterTypes.get(k)) {
 					String key = universalRulesById.get(k);
 					out.print(key + " ");
 				}
 			}
-			if(filterNotTypes.size() > 0) {
+			if(filterNotTypes.length() > 0) {
 				out.print(" ifnot ");
 			}
-			for(int k = 0; k < filterNotTypes.size(); k++) {
+			for(int k = 0; k < filterNotTypes.length(); k++) {
 				if(filterNotTypes.get(k)) {
 					String key = universalRulesById.get(k);
 					out.print(key + " ");
@@ -850,7 +850,7 @@
 			if (selectValue instanceof String && selectValue.toString().startsWith("$")) {
 				BitSet mask = tagRuleMask.get(selectValue.toString().substring(1));
 				if (mask != null && mask.intersects(types)) {
-					BitSet findBit = new BitSet(mask.size());
+					BitSet findBit = new BitSet(mask.length());
 					findBit.or(mask);
 					findBit.and(types);
 					int value = findBit.nextSetBit(0);
