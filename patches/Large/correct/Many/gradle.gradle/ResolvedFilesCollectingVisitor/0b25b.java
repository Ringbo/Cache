diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedFilesCollectingVisitor.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedFilesCollectingVisitor.java
index 1533871..f5ddb90 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedFilesCollectingVisitor.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedFilesCollectingVisitor.java
@@ -36,7 +36,7 @@
         try {
             File file = artifact.getFile(); // triggering file resolve
             this.files.add(file);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             failures.add(t);
         }
     }
