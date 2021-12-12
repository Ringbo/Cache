diff --git a/junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java b/junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java
index 0b5e9a5..a0b80dd 100644
--- a/junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java
+++ b/junit-platform-engine/src/main/java/org/junit/platform/engine/discovery/DiscoverySelectors.java
@@ -251,7 +251,7 @@
 	 */
 	public static PackageSelector selectPackage(String packageName) {
 		Preconditions.notNull(packageName, "Package name must not be null");
-		Preconditions.condition(packageName.equals("") || packageName.trim().length() != 0,
+		Preconditions.condition(packageName.isEmpty() || !packageName.trim().isEmpty(),
 			"Package name must not contain only whitespace");
 		return new PackageSelector(packageName.trim());
 	}
