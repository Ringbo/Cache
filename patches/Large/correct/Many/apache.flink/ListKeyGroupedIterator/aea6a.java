diff --git a/flink-core/src/main/java/org/apache/flink/api/common/operators/util/ListKeyGroupedIterator.java b/flink-core/src/main/java/org/apache/flink/api/common/operators/util/ListKeyGroupedIterator.java
index e530f8a..673440d 100644
--- a/flink-core/src/main/java/org/apache/flink/api/common/operators/util/ListKeyGroupedIterator.java
+++ b/flink-core/src/main/java/org/apache/flink/api/common/operators/util/ListKeyGroupedIterator.java
@@ -89,7 +89,7 @@
 			// Required if user code / reduce() method did not read the whole value iterator.
 			E next;
 			while (true) {
-				if ((next = this.input.get(currentPosition++)) != null) {
+				if (currentPosition < input.size() && (next = this.input.get(currentPosition++)) != null) {
 					if (!this.comparator.equalToReference(next)) {
 						// the keys do not match, so we have a new group. store the current key
 						this.comparator.setReference(next);
