diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/mapping/PropertyMatches.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/mapping/PropertyMatches.java
index f73af33..0c232b8 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/mapping/PropertyMatches.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/mapping/PropertyMatches.java
@@ -99,7 +99,7 @@
 	 * indicating the possible property matches.
 	 */
 	public String buildErrorMessage() {
-		StringBuffer buf = new StringBuffer();
+		StringBuilder buf = new StringBuilder();
 		buf.append("Bean property '");
 		buf.append(this.propertyName);
 		buf.append("' is not writable or has an invalid setter method. ");
