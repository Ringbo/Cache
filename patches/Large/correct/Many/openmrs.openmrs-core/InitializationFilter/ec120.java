diff --git a/src/web/org/openmrs/web/filter/initialization/InitializationFilter.java b/src/web/org/openmrs/web/filter/initialization/InitializationFilter.java
index 9a4428d..3fd3457 100644
--- a/src/web/org/openmrs/web/filter/initialization/InitializationFilter.java
+++ b/src/web/org/openmrs/web/filter/initialization/InitializationFilter.java
@@ -697,7 +697,7 @@
 	 * @return true if the value is non-empty
 	 */
 	private boolean checkForEmptyValue(String value, List<String> errors, String errorMessage) {
-		if(value != null && !value.isEmpty()) {
+		if(value != null && !value.equals("")) {
 			return true;
 		}
 		errors.add(errorMessage + " required.");
