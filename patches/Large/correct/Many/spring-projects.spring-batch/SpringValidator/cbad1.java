diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java
index bed1815..d33981d 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/validator/SpringValidator.java
@@ -58,7 +58,7 @@
 	 * @return string of field errors followed by global errors.
 	 */
 	private String errorsToString(Errors errors) {
-		StringBuilder builder = new StringBuilder();
+		StringBuffer builder = new StringBuffer();
 
 		appendCollection(errors.getFieldErrors(), builder);
 		appendCollection(errors.getGlobalErrors(), builder);
@@ -70,7 +70,7 @@
 	 * Append the string representation of elements of the collection (separated
 	 * by new lines) to the given StringBuilder.
 	 */
-	private void appendCollection(Collection collection, StringBuilder builder) {
+	private void appendCollection(Collection collection, StringBuffer builder) {
 		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
 			builder.append("\n");
 			builder.append(iterator.next().toString());
