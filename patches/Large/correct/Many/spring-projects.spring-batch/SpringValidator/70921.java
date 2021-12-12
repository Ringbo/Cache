diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java
index 8880980..8c86372 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java
@@ -59,7 +59,7 @@
 	 * @return string of field errors followed by global errors.
 	 */
 	private String errorsToString(Errors errors) {
-		StringBuffer builder = new StringBuffer();
+		StringBuilder builder = new StringBuilder();
 
 		appendCollection(errors.getFieldErrors(), builder);
 		appendCollection(errors.getGlobalErrors(), builder);
@@ -71,7 +71,7 @@
 	 * Append the string representation of elements of the collection (separated
 	 * by new lines) to the given StringBuilder.
 	 */
-	private void appendCollection(Collection<?> collection, StringBuffer builder) {
+	private void appendCollection(Collection<?> collection, StringBuilder builder) {
 		for (Object value : collection) {
 			builder.append("\n");
 			builder.append(value.toString());
