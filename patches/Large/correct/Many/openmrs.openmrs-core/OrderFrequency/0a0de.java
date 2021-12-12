diff --git a/api/src/main/java/org/openmrs/OrderFrequency.java b/api/src/main/java/org/openmrs/OrderFrequency.java
index cb5da6f..8f5a553 100644
--- a/api/src/main/java/org/openmrs/OrderFrequency.java
+++ b/api/src/main/java/org/openmrs/OrderFrequency.java
@@ -105,7 +105,7 @@
 	 */
 	@Override
 	public String getName() {
-		if (getConcept() != null || getConcept().getName() != null) {
+		if (getConcept() != null && getConcept().getName() != null) {
 			return getConcept().getName().toString();
 		}
 		return null;
@@ -116,7 +116,7 @@
 	 */
 	@Override
 	public String getDescription() {
-		if (getConcept() != null || getConcept().getDescription() != null) {
+		if (getConcept() != null && getConcept().getDescription() != null) {
 			return getConcept().getDescription().getDescription();
 		}
 		return null;
