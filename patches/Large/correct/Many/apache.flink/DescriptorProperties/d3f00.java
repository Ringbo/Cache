diff --git a/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/descriptors/DescriptorProperties.java b/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/descriptors/DescriptorProperties.java
index c476981..7628912 100644
--- a/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/descriptors/DescriptorProperties.java
+++ b/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/descriptors/DescriptorProperties.java
@@ -938,7 +938,7 @@
 		}
 
 		// validate
-		for (int i = 0; i < maxIndex; i++) {
+		for (int i = 0; i <= maxIndex; i++) {
 			for (Map.Entry<String, Consumer<String>> subKey : subKeyValidation.entrySet()) {
 				final String fullKey = key + '.' + i + '.' + subKey.getKey();
 				if (properties.containsKey(fullKey)) {
@@ -1134,7 +1134,7 @@
 		}
 
 		// validate array elements
-		for (int i = 0; i < maxIndex; i++) {
+		for (int i = 0; i <= maxIndex; i++) {
 			final String fullKey = key + '.' + i;
 			if (properties.containsKey(fullKey)) {
 				// run validation logic
