diff --git a/modules/sdk/project-templates/src/main/java/com/liferay/project/templates/ProjectTemplates.java b/modules/sdk/project-templates/src/main/java/com/liferay/project/templates/ProjectTemplates.java
index a2b9072..938467c 100644
--- a/modules/sdk/project-templates/src/main/java/com/liferay/project/templates/ProjectTemplates.java
+++ b/modules/sdk/project-templates/src/main/java/com/liferay/project/templates/ProjectTemplates.java
@@ -87,7 +87,7 @@
 				while (enumeration.hasMoreElements()) {
 					JarEntry jarEntry = enumeration.nextElement();
 
-					if (!jarEntry.isDirectory()) {
+					if (jarEntry.isDirectory()) {
 						continue;
 					}
 
