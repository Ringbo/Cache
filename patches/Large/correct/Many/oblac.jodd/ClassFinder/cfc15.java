diff --git a/jodd-core/src/main/java/jodd/io/findfile/ClassFinder.java b/jodd-core/src/main/java/jodd/io/findfile/ClassFinder.java
index 555a130..1fa3e35 100644
--- a/jodd-core/src/main/java/jodd/io/findfile/ClassFinder.java
+++ b/jodd-core/src/main/java/jodd/io/findfile/ClassFinder.java
@@ -102,12 +102,18 @@
 		return systemJars;
 	}
 
+	/**
+	 * Specify excluded jars.
+	 */
 	public void setExcludedJars(String... excludedJars) {
 		for (String excludedJar : excludedJars) {
-			rulesJars.include(excludedJar);
+			rulesJars.exclude(excludedJar);
 		}
 	}
 
+	/**
+	 * Specify included jars.
+	 */
 	public void setIncludedJars(String... includedJars) {
 		for (String includedJar : includedJars) {
 			rulesJars.include(includedJar);
