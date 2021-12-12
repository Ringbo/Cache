diff --git a/spring-core/src/main/java/org/springframework/core/env/SystemEnvironmentPropertySource.java b/spring-core/src/main/java/org/springframework/core/env/SystemEnvironmentPropertySource.java
index b6237da..6277fa9 100644
--- a/spring-core/src/main/java/org/springframework/core/env/SystemEnvironmentPropertySource.java
+++ b/spring-core/src/main/java/org/springframework/core/env/SystemEnvironmentPropertySource.java
@@ -102,7 +102,7 @@
 	 * any underscore / uppercase variation thereof. Return the resolved name if one is
 	 * found or otherwise the original name. Never returns {@code null}.
 	 */
-	private String resolvePropertyName(String name) {
+	protected final String resolvePropertyName(String name) {
 		Assert.notNull(name, "Property name must not be null");
 		String resolvedName = checkPropertyName(name);
 		if (resolvedName != null) {
