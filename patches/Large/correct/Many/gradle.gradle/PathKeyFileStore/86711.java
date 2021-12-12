diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/filestore/PathKeyFileStore.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/filestore/PathKeyFileStore.java
index 35daeae..d8392b4 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/filestore/PathKeyFileStore.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/filestore/PathKeyFileStore.java
@@ -87,13 +87,13 @@
         File markerFile = getMarkerFile(destination);
         try {
             markerFile.createNewFile();
-            destination.delete();
+            deleteAction.delete(destination);
             addAction.execute(destination);
         } catch (Exception exception) {
-            destination.delete();
+            deleteAction.delete(destination);
             throw new GradleException(String.format("Failed to add file with key '%s' into filestore at '%s' ", key, getBaseDir().getAbsolutePath()), exception);
         } finally {
-            markerFile.delete();
+            deleteAction.delete(markerFile);
         }
         return entryAt(destination);
     }
