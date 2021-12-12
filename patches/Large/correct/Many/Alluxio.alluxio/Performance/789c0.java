diff --git a/core/src/main/java/tachyon/examples/Performance.java b/core/src/main/java/tachyon/examples/Performance.java
index 80612c4..6278c4c 100644
--- a/core/src/main/java/tachyon/examples/Performance.java
+++ b/core/src/main/java/tachyon/examples/Performance.java
@@ -74,7 +74,7 @@
 
   public static void logPerIteration(long startTimeMs, int times, String msg, int workerId) {
     long takenTimeMs = System.currentTimeMillis() - startTimeMs;
-    double result = 1000L * FILE_BYTES / takenTimeMs / 1024 / 1024;
+    double result = 1000.0 * FILE_BYTES / takenTimeMs / 1024 / 1024;
     LOG.info(times + msg + workerId + " : " + result + " Mb/sec. Took " + takenTimeMs + " ms. ");
   }
 
@@ -410,7 +410,7 @@
       }
     }
     long takenTimeMs = System.currentTimeMillis() - startTimeMs;
-    double result = 1000L * FILES_BYTES / takenTimeMs / 1024 / 1024;
+    double result = 1000.0 * FILES_BYTES / takenTimeMs / 1024 / 1024;
 
     LOG.info(result + " Mb/sec. " + RESULT_PREFIX + "Entire " + msg + " Test : " + " Took "
         + takenTimeMs + " ms. Current System Time: " + System.currentTimeMillis());
@@ -450,7 +450,7 @@
       }
     }
     long takenTimeMs = System.currentTimeMillis() - startTimeMs;
-    double result = FILES_BYTES * 1000L / takenTimeMs / 1024 / 1024;
+    double result = FILES_BYTES * 1000.0 / takenTimeMs / 1024 / 1024;
     LOG.info(result + " Mb/sec. " + RESULT_PREFIX + "Entire " + (write ? "Write " : "Read ")
         + " Took " + takenTimeMs + " ms. Current System Time: " + System.currentTimeMillis());
   }
@@ -486,7 +486,7 @@
       }
     }
     long takenTimeMs = System.currentTimeMillis() - startTimeMs;
-    double result = FILES_BYTES * 1000L / takenTimeMs / 1024 / 1024;
+    double result = FILES_BYTES * 1000.0 / takenTimeMs / 1024 / 1024;
     LOG.info(result + " Mb/sec. " + RESULT_PREFIX + "Entire " + (write ? "Write " : "Read ")
         + " Took " + takenTimeMs + " ms. Current System Time: " + System.currentTimeMillis());
   }
