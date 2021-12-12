diff --git a/tests/JankBench/app/src/main/java/com/android/benchmark/app/RunLocalBenchmarksActivity.java b/tests/JankBench/app/src/main/java/com/android/benchmark/app/RunLocalBenchmarksActivity.java
index 7641d00..aa6e787 100644
--- a/tests/JankBench/app/src/main/java/com/android/benchmark/app/RunLocalBenchmarksActivity.java
+++ b/tests/JankBench/app/src/main/java/com/android/benchmark/app/RunLocalBenchmarksActivity.java
@@ -323,7 +323,7 @@
                 intent = new Intent(getApplicationContext(), EditTextInputActivity.class);
                 break;
             case R.id.benchmark_overdraw:
-                intent = new Intent(getApplicationContext(), BitmapUploadActivity.class);
+                intent = new Intent(getApplicationContext(), FullScreenOverdrawActivity.class);
                 break;
             case R.id.benchmark_memory_bandwidth:
                 syntheticTestId = 0;
