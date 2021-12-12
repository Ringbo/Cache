diff --git a/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/transform/FormatterLineAggregatorTests.java b/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/transform/FormatterLineAggregatorTests.java
index b7bc5dc..a7acaf9 100644
--- a/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/transform/FormatterLineAggregatorTests.java
+++ b/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/transform/FormatterLineAggregatorTests.java
@@ -132,7 +132,7 @@
 				for (int i = 0; i < strings.length; i++) {
 					strings[i] = item[i];
 					if (item[i].length() < widths[i]) {
-						StringBuffer buffer = new StringBuffer(strings[i]);
+						StringBuilder buffer = new StringBuilder(strings[i]);
 						for (int j = 0; j < (widths[i] - item[i].length() + 1) / 2; j++) {
 							buffer.append(" ");
 						}
@@ -167,7 +167,7 @@
 				for (int i = 0; i < strings.length; i++) {
 					strings[i] = item[i];
 					if (item[i].length() < widths[i]) {
-						StringBuffer buffer = new StringBuffer(strings[i]);
+						StringBuilder buffer = new StringBuilder(strings[i]);
 						for (int j = 0; j < widths[i] - item[i].length(); j++) {
 							buffer.append(".");
 						}
