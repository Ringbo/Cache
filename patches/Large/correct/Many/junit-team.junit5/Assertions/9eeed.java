diff --git a/junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java b/junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java
index 76e87b7..7c7e6a2 100644
--- a/junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java
+++ b/junit-jupiter-api/src/main/java/org/junit/jupiter/api/Assertions.java
@@ -1076,7 +1076,7 @@
 	 * @see #assertAll(Stream)
 	 * @see #assertAll(String, Stream)
 	 */
-	public static void assertAll(Collection<Executable> executables) {
+	public static void assertAll(Collection<Executable> executables) throws MultipleFailuresError {
 		AssertAll.assertAll(executables);
 	}
 
@@ -1093,7 +1093,7 @@
 	 * @see #assertAll(Stream)
 	 * @see #assertAll(String, Stream)
 	 */
-	public static void assertAll(String heading, Collection<Executable> executables) {
+	public static void assertAll(String heading, Collection<Executable> executables) throws MultipleFailuresError {
 		AssertAll.assertAll(heading, executables);
 	}
 
