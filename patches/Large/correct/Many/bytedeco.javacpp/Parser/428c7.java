diff --git a/src/main/java/org/bytedeco/javacpp/tools/Parser.java b/src/main/java/org/bytedeco/javacpp/tools/Parser.java
index e8d9e19..dde32f8 100644
--- a/src/main/java/org/bytedeco/javacpp/tools/Parser.java
+++ b/src/main/java/org/bytedeco/javacpp/tools/Parser.java
@@ -166,7 +166,7 @@
                     indexFunction = "";
                     valueType.javaName = "boolean";
                     resizable = false;
-                } else if (containerName.endsWith("set")) {
+                } else if (containerName.endsWith("list") || containerName.endsWith("set")) {
                     indexType = null;
                     resizable = false;
                 }
