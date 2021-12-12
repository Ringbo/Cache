diff --git a/modules/selenium/src/main/java/org/testcontainers/containers/BrowserWebDriverContainer.java b/modules/selenium/src/main/java/org/testcontainers/containers/BrowserWebDriverContainer.java
index fcc8b6f..76feff2 100644
--- a/modules/selenium/src/main/java/org/testcontainers/containers/BrowserWebDriverContainer.java
+++ b/modules/selenium/src/main/java/org/testcontainers/containers/BrowserWebDriverContainer.java
@@ -206,7 +206,7 @@
 
     @Override
     public void afterTest(TestDescription description, Optional<Throwable> throwable) {
-        retainRecordingIfNeeded(description.getFilesystemFriendlyName(), throwable.isPresent());
+        retainRecordingIfNeeded(description.getFilesystemFriendlyName(), !throwable.isPresent());
     }
 
     @Override
