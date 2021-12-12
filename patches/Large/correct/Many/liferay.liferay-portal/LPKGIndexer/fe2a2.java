diff --git a/modules/core/portal-target-platform-indexer/src/main/java/com/liferay/portal/target/platform/indexer/internal/LPKGIndexer.java b/modules/core/portal-target-platform-indexer/src/main/java/com/liferay/portal/target/platform/indexer/internal/LPKGIndexer.java
index 2359ab8..623a888 100644
--- a/modules/core/portal-target-platform-indexer/src/main/java/com/liferay/portal/target/platform/indexer/internal/LPKGIndexer.java
+++ b/modules/core/portal-target-platform-indexer/src/main/java/com/liferay/portal/target/platform/indexer/internal/LPKGIndexer.java
@@ -90,7 +90,9 @@
 
 				File file = new File(tempDir, name);
 
-				Files.copy(zipFile.getInputStream(zipEntry), file.toPath());
+				Files.copy(
+					zipFile.getInputStream(zipEntry), file.toPath(),
+					StandardCopyOption.REPLACE_EXISTING);
 
 				files.add(file);
 			}
