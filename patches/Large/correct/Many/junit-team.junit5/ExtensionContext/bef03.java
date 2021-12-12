diff --git a/junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java b/junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java
index 42d687f..f6be0ae 100644
--- a/junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java
+++ b/junit-jupiter-api/src/main/java/org/junit/jupiter/api/extension/ExtensionContext.java
@@ -134,7 +134,7 @@
 	 * @throws PreconditionViolationException if the test class is not present
 	 * in this {@code ExtensionContext}
 	 */
-	default Object getRequiredTestClass() {
+	default Class<?> getRequiredTestClass() {
 		return Preconditions.notNull(getTestClass().orElse(null),
 			"Illegal state: required test class is not present in the current ExtensionContext");
 	}
@@ -185,7 +185,7 @@
 	 * @throws PreconditionViolationException if the test method is not present
 	 * in this {@code ExtensionContext}
 	 */
-	default Object getRequiredTestMethod() {
+	default Method getRequiredTestMethod() {
 		return Preconditions.notNull(getTestMethod().orElse(null),
 			"Illegal state: required test method is not present in the current ExtensionContext");
 	}
