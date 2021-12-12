diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPTagAttributesCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPTagAttributesCheck.java
index 9b91d94..612849a 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPTagAttributesCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPTagAttributesCheck.java
@@ -279,11 +279,11 @@
 	}
 
 	private boolean _isValidTagAttributeValue(String value, String dataType) {
-		if (dataType.equals("boolean")) {
+		if (dataType.endsWith("Boolean") || dataType.equals("boolean")) {
 			return Validator.isBoolean(value);
 		}
 
-		if (dataType.equals("double")) {
+		if (dataType.endsWith("Double") || dataType.equals("double")) {
 			try {
 				Double.parseDouble(value);
 			}
@@ -294,7 +294,9 @@
 			return true;
 		}
 
-		if (dataType.equals("int") || dataType.equals("long")) {
+		if (dataType.endsWith("Integer") || dataType.equals("int") ||
+			dataType.endsWith("Long") || dataType.equals("long")) {
+
 			return Validator.isNumber(value);
 		}
 
