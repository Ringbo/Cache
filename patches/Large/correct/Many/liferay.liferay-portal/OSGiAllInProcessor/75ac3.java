diff --git a/modules/test/arquillian-extension-junit-bridge/src/main/java/com/liferay/arquillian/extension/junit/bridge/remote/processor/OSGiAllInProcessor.java b/modules/test/arquillian-extension-junit-bridge/src/main/java/com/liferay/arquillian/extension/junit/bridge/remote/processor/OSGiAllInProcessor.java
index ef83c42..36c3578 100644
--- a/modules/test/arquillian-extension-junit-bridge/src/main/java/com/liferay/arquillian/extension/junit/bridge/remote/processor/OSGiAllInProcessor.java
+++ b/modules/test/arquillian-extension-junit-bridge/src/main/java/com/liferay/arquillian/extension/junit/bridge/remote/processor/OSGiAllInProcessor.java
@@ -190,7 +190,7 @@
 					javaArchive.getContent();
 
 				for (ArchivePath archivePath : javaArchiveContentMap.keySet()) {
-					String archivePathString = archivePath.toString();
+					String archivePathString = archivePath.get();
 
 					if (archivePathString.endsWith(path)) {
 						testClassFound = true;
