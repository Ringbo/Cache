diff --git a/src/main/java/org/reflections/Reflections.java b/src/main/java/org/reflections/Reflections.java
index b9726b4..5099b6f 100644
--- a/src/main/java/org/reflections/Reflections.java
+++ b/src/main/java/org/reflections/Reflections.java
@@ -249,7 +249,7 @@
                     Object classObject = null;
                     for (Scanner scanner : configuration.getScanners()) {
                         try {
-                            if (scanner.acceptsInput(path) || scanner.acceptResult(fqn)) {
+                            if (scanner.acceptsInput(path) || scanner.acceptsInput(fqn)) {
                                 classObject = scanner.scan(file, classObject);
                             }
                         } catch (Exception e) {
