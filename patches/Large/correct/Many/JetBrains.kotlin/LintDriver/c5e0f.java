diff --git a/plugins/lint/lint-api/src/com/android/tools/klint/client/api/LintDriver.java b/plugins/lint/lint-api/src/com/android/tools/klint/client/api/LintDriver.java
index 00cb864..b50ff82 100644
--- a/plugins/lint/lint-api/src/com/android/tools/klint/client/api/LintDriver.java
+++ b/plugins/lint/lint-api/src/com/android/tools/klint/client/api/LintDriver.java
@@ -1490,7 +1490,7 @@
             @NotNull List<UastScanner> detectors,
             @NotNull List<File> files) {
         com.intellij.openapi.project.Project intellijProject = mClient.getProject();
-        if (intellijProject == null) {
+        if (intellijProject == null || intellijProject.isDisposed()) {
             return;
         }
 
