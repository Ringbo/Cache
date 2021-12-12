diff --git a/translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java b/translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java
index 392d42b..16611aa 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/util/ProGuardUsageParser.java
@@ -166,7 +166,9 @@
 
       @Override
       public boolean processLine(String line) throws IOException {
-        if (line.startsWith("ProGuard, version") || line.startsWith("Reading ")) {
+        if (line.startsWith("ProGuard, version")
+            || line.startsWith("Reading ")
+            || line.startsWith("    processed in")) {
           // ignore output header
         } else if (!line.startsWith("    ")) {
           handleClass(line);
