diff --git a/subprojects/dependency-management/src/main/java/org/gradle/internal/locking/LockFileReaderWriter.java b/subprojects/dependency-management/src/main/java/org/gradle/internal/locking/LockFileReaderWriter.java
index 5ffd4b3..8b60980 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/internal/locking/LockFileReaderWriter.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/internal/locking/LockFileReaderWriter.java
@@ -80,7 +80,7 @@
                 return null;
             }
         } catch (IOException e) {
-            throw new RuntimeException("Unable to load lock file");
+            throw new RuntimeException("Unable to load lock file", e);
         }
 
     }
@@ -88,7 +88,7 @@
     private void filterNonModuleLines(List<String> lines) {
         Iterator<String> iterator = lines.iterator();
         while (iterator.hasNext()) {
-            String value = iterator.next();
+            String value = iterator.next().trim();
             if (value.startsWith("#") || value.isEmpty()) {
                 iterator.remove();
             }
