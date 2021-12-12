diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/nativeblas/Nd4jCpuPresets.java b/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/nativeblas/Nd4jCpuPresets.java
index 339b775..425e337 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/nativeblas/Nd4jCpuPresets.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/nativeblas/Nd4jCpuPresets.java
@@ -196,7 +196,7 @@
         files.addAll(Arrays.asList(new File(file.getParent(), "headers").listFiles()));
         Collections.sort(files);
         for (File f : files) {
-            try (Scanner scanner = new Scanner(f)) {
+            try (Scanner scanner = new Scanner(f, "UTF-8")) {
                 while (scanner.hasNextLine()) {
                     String line = scanner.nextLine().trim();
                     if (line.startsWith("DECLARE_")) {
