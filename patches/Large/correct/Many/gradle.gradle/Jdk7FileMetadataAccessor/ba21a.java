diff --git a/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/filesystem/jdk7/Jdk7FileMetadataAccessor.java b/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/filesystem/jdk7/Jdk7FileMetadataAccessor.java
index ba9a820..f72d210 100644
--- a/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/filesystem/jdk7/Jdk7FileMetadataAccessor.java
+++ b/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/filesystem/jdk7/Jdk7FileMetadataAccessor.java
@@ -40,7 +40,7 @@
             if (bfa.isDirectory()) {
                 return DefaultFileMetadata.directory();
             }
-            return new FileMetadataSnapshot(FileType.RegularFile, bfa.lastModifiedTime().toMillis(), bfa.size());
+            return new DefaultFileMetadata(FileType.RegularFile, bfa.lastModifiedTime().toMillis(), bfa.size());
         } catch (IOException e) {
             throw UncheckedException.throwAsUncheckedException(e);
         }
