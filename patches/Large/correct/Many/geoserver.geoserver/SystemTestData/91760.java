diff --git a/src/main/src/test/java/org/geoserver/data/test/SystemTestData.java b/src/main/src/test/java/org/geoserver/data/test/SystemTestData.java
index 2fbd606..0b0da02 100644
--- a/src/main/src/test/java/org/geoserver/data/test/SystemTestData.java
+++ b/src/main/src/test/java/org/geoserver/data/test/SystemTestData.java
@@ -1063,12 +1063,12 @@
     @Override
     public void tearDown() throws Exception {
         int MAX_ATTEMPTS = 100;
-        for (int i = 0; i < MAX_ATTEMPTS; i++) {
+        for (int i = 1; i <= MAX_ATTEMPTS; i++) {
             try {
                 deleteFilesOnExit(data);
                 break;
             } catch (IOException e) {
-                if (i >= MAX_ATTEMPTS && data.exists()) {
+                if (i == MAX_ATTEMPTS && data.exists()) {
                     throw new IOException(
                             "Failed to clean up test data dir after " + MAX_ATTEMPTS + " attempts",
                             e);
