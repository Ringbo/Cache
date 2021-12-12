diff --git a/spring-context/src/main/java/org/springframework/context/support/ReloadableResourceBundleMessageSource.java b/spring-context/src/main/java/org/springframework/context/support/ReloadableResourceBundleMessageSource.java
index c8d5669..3f650e1 100644
--- a/spring-context/src/main/java/org/springframework/context/support/ReloadableResourceBundleMessageSource.java
+++ b/spring-context/src/main/java/org/springframework/context/support/ReloadableResourceBundleMessageSource.java
@@ -451,11 +451,11 @@
 	 */
 	protected PropertiesHolder getProperties(String filename) {
 		PropertiesHolder propHolder = this.cachedProperties.get(filename);
-		long originalTimestamp = -1;
+		long originalTimestamp = -2;
 
 		if (propHolder != null) {
 			originalTimestamp = propHolder.getRefreshTimestamp();
-			if (originalTimestamp < 0 || originalTimestamp > System.currentTimeMillis() - this.cacheMillis) {
+			if (originalTimestamp == -1 || originalTimestamp > System.currentTimeMillis() - this.cacheMillis) {
 				// Up to date
 				return propHolder;
 			}
