diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/tasks/cache/GZipTaskOutputPacker.java b/subprojects/core/src/main/java/org/gradle/api/internal/tasks/cache/GZipTaskOutputPacker.java
index 5cab676..3b0a13c 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/tasks/cache/GZipTaskOutputPacker.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/tasks/cache/GZipTaskOutputPacker.java
@@ -29,9 +29,9 @@
  * Adds compression and CRC32 checks to the packed task output.
  */
 public class GZipTaskOutputPacker implements TaskOutputPacker {
-    private final TarTaskOutputPacker delegate;
+    private final TaskOutputPacker delegate;
 
-    public GZipTaskOutputPacker(TarTaskOutputPacker delegate) {
+    public GZipTaskOutputPacker(TaskOutputPacker delegate) {
         this.delegate = delegate;
     }
 
