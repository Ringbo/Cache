diff --git a/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/JUnit5TestEngine.java b/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/JUnit5TestEngine.java
index 75c0013..e167e44 100644
--- a/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/JUnit5TestEngine.java
+++ b/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/JUnit5TestEngine.java
@@ -58,7 +58,7 @@
 				// @formatter:off
 				if (classFilters.stream()
 						.map(filter -> filter.filter(testClass))
-						.anyMatch(FilterResult::isFiltered)) {
+						.anyMatch(FilterResult::isDeclined)) {
 					remove.run();
 				}
 				// @formatter:on
