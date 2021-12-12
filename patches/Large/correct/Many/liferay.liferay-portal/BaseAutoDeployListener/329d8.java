diff --git a/portal-service/src/com/liferay/portal/kernel/deploy/auto/BaseAutoDeployListener.java b/portal-service/src/com/liferay/portal/kernel/deploy/auto/BaseAutoDeployListener.java
index 903482e..2fe9caf 100644
--- a/portal-service/src/com/liferay/portal/kernel/deploy/auto/BaseAutoDeployListener.java
+++ b/portal-service/src/com/liferay/portal/kernel/deploy/auto/BaseAutoDeployListener.java
@@ -32,7 +32,7 @@
 	public boolean isExtPlugin(File file) {
 		String fileName = file.getName();
 
-		if (fileName.contains("-ext") || !isJarFile(file)) {
+		if (fileName.contains("-ext") && !isJarFile(file)) {
 			return true;
 		}
 
