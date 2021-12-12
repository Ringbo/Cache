diff --git a/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/utils/EncodingUtils.java b/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/utils/EncodingUtils.java
index 47aac25..5531082 100644
--- a/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/utils/EncodingUtils.java
+++ b/flink-libraries/flink-table-common/src/main/java/org/apache/flink/table/utils/EncodingUtils.java
@@ -76,7 +76,7 @@
 			return instance;
 		} catch (Exception e) {
 			throw new ValidationException(
-				"Unable to deserialize string '" + base64String + "' of base class '" + baseClass.getName() + "'.");
+				"Unable to deserialize string '" + base64String + "' of base class '" + baseClass.getName() + "'.", e);
 		}
 	}
 
