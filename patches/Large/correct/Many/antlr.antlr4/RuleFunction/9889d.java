diff --git a/tool/src/org/antlr/v4/codegen/model/RuleFunction.java b/tool/src/org/antlr/v4/codegen/model/RuleFunction.java
index 01a41e0..466cf05 100644
--- a/tool/src/org/antlr/v4/codegen/model/RuleFunction.java
+++ b/tool/src/org/antlr/v4/codegen/model/RuleFunction.java
@@ -307,13 +307,23 @@
 		 * Common
 		 */
 
+		/**
+		 * Generate a frequency set as the union of two input sets. If an
+		 * element is contained in both sets, the value for the output will be
+		 * the maximum of the two input values.
+		 *
+		 * @param a The first set.
+		 * @param b The second set.
+		 * @return The union of the two sets, with the maximum value chosen
+		 * whenever both sets contain the same key.
+		 */
 		protected static FrequencySet<String> combineMax(FrequencySet<String> a, FrequencySet<String> b) {
 			FrequencySet<String> result = combineAndClip(a, b, 1);
 			for (Map.Entry<String, MutableInt> entry : a.entrySet()) {
 				result.get(entry.getKey()).v = entry.getValue().v;
 			}
 
-			for (Map.Entry<String, MutableInt> entry : a.entrySet()) {
+			for (Map.Entry<String, MutableInt> entry : b.entrySet()) {
 				MutableInt slot = result.get(entry.getKey());
 				slot.v = Math.max(slot.v, entry.getValue().v);
 			}
@@ -321,6 +331,18 @@
 			return result;
 		}
 
+		/**
+		 * Generate a frequency set as the union of two input sets, with the
+		 * values clipped to a specified maximum value. If an element is
+		 * contained in both sets, the value for the output, prior to clipping,
+		 * will be the sum of the two input values.
+		 *
+		 * @param a The first set.
+		 * @param b The second set.
+		 * @param clip The maximum value to allow for any output.
+		 * @return The sum of the two sets, with the individual elements clipped
+		 * to the maximum value gived by {@code clip}.
+		 */
 		protected static FrequencySet<String> combineAndClip(FrequencySet<String> a, FrequencySet<String> b, int clip) {
 			FrequencySet<String> result = new FrequencySet<String>();
 			for (Map.Entry<String, MutableInt> entry : a.entrySet()) {
