diff --git a/core/java/com/android/internal/os/KernelCpuSpeedReader.java b/core/java/com/android/internal/os/KernelCpuSpeedReader.java
index e16ae0b..5b776ac 100644
--- a/core/java/com/android/internal/os/KernelCpuSpeedReader.java
+++ b/core/java/com/android/internal/os/KernelCpuSpeedReader.java
@@ -58,7 +58,7 @@
             TextUtils.SimpleStringSplitter splitter = new TextUtils.SimpleStringSplitter(' ');
             String line;
             int speedIndex = 0;
-            while ((line = reader.readLine()) != null) {
+            while (speedIndex < mLastSpeedTimes.length && (line = reader.readLine()) != null) {
                 splitter.setString(line);
                 Long.parseLong(splitter.next());
 
