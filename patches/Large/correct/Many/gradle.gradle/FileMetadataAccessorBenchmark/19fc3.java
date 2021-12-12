diff --git a/subprojects/native/src/jmh/java/org/gradle/internal/nativeintegration/filesystem/FileMetadataAccessorBenchmark.java b/subprojects/native/src/jmh/java/org/gradle/internal/nativeintegration/filesystem/FileMetadataAccessorBenchmark.java
index 945fb43..315cac0 100644
--- a/subprojects/native/src/jmh/java/org/gradle/internal/nativeintegration/filesystem/FileMetadataAccessorBenchmark.java
+++ b/subprojects/native/src/jmh/java/org/gradle/internal/nativeintegration/filesystem/FileMetadataAccessorBenchmark.java
@@ -104,11 +104,11 @@
             try {
                 BasicFileAttributes bfa = java.nio.file.Files.readAttributes(f.toPath(), BasicFileAttributes.class);
                 if (bfa.isDirectory()) {
-                    return FileMetadataSnapshot.directory();
+                    return DefaultFileMetadata.directory();
                 }
-                return new FileMetadataSnapshot(FileType.RegularFile, bfa.lastModifiedTime().toMillis(), bfa.size());
+                return new DefaultFileMetadata(FileType.RegularFile, bfa.lastModifiedTime().toMillis(), bfa.size());
             } catch (IOException e) {
-                return FileMetadataSnapshot.missing();
+                return DefaultFileMetadata.missing();
             }
         }
     }
