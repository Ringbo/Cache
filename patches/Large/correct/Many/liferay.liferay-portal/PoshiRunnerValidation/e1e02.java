diff --git a/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerValidation.java b/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerValidation.java
index cf13d08..b06ce5f 100644
--- a/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerValidation.java
+++ b/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerValidation.java
@@ -684,7 +684,7 @@
 			element, null, primaryAttributeNames, filePath);
 	}
 
-	private static void _validateHasRequiredPropertyElements(
+	protected static void validateHasRequiredPropertyElements(
 		Element element, String filePath) {
 
 		List<String> requiredPropertyNames = new ArrayList(
@@ -693,7 +693,7 @@
 		List<Element> propertyElements = element.elements("property");
 
 		for (Element propertyElement : propertyElements) {
-			_validatePropertyElement(propertyElement, filePath);
+			validatePropertyElement(propertyElement, filePath);
 
 			String propertyName = propertyElement.attributeValue("name");
 
@@ -708,7 +708,7 @@
 					List<String> possiblePropertyValues = Arrays.asList(
 						StringUtil.split(testCaseAvailablePropertyValues));
 
-					_validatePossiblePropertyValues(
+					validatePossiblePropertyValues(
 						propertyElement, possiblePropertyValues, filePath);
 				}
 			}
@@ -1031,7 +1031,7 @@
 		}
 	}
 
-	private static void _validatePossiblePropertyValues(
+	protected static void validatePossiblePropertyValues(
 		Element element, List<String> possiblePropertyValues, String filePath) {
 
 		List<String> propertyValues = Arrays.asList(
@@ -1176,7 +1176,7 @@
 			validateRequiredChildElementName(element, "command", filePath);
 		}
 
-		_validateHasRequiredPropertyElements(element, filePath);
+		validateHasRequiredPropertyElements(element, filePath);
 
 		List<String> possibleTagElementNames = Arrays.asList(
 			"command", "property", "set-up", "tear-down", "var");
