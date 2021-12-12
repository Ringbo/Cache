diff --git a/modules/util/portal-tools-bundle-support/src/main/java/com/liferay/portal/tools/bundle/support/maven/CleanMojo.java b/modules/util/portal-tools-bundle-support/src/main/java/com/liferay/portal/tools/bundle/support/maven/CleanMojo.java
index 86b47d1..59563bb 100644
--- a/modules/util/portal-tools-bundle-support/src/main/java/com/liferay/portal/tools/bundle/support/maven/CleanMojo.java
+++ b/modules/util/portal-tools-bundle-support/src/main/java/com/liferay/portal/tools/bundle/support/maven/CleanMojo.java
@@ -32,7 +32,7 @@
 	public void execute() throws MojoExecutionException {
 		String packaging = project.getPackaging();
 
-		if (packaging.equals("jar") && !packaging.equals("war")) {
+		if (!packaging.equals("jar") && !packaging.equals("war")) {
 			return;
 		}
 
