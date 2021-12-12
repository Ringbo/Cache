diff --git a/h2/src/tools/org/h2/dev/util/JavaProcessKiller.java b/h2/src/tools/org/h2/dev/util/JavaProcessKiller.java
index 1a33154..e49265d 100644
--- a/h2/src/tools/org/h2/dev/util/JavaProcessKiller.java
+++ b/h2/src/tools/org/h2/dev/util/JavaProcessKiller.java
@@ -103,7 +103,7 @@
     }
 
     private static void copyInThread(final InputStream in, final OutputStream out) {
-        new Thread("Profiler stream copy") {
+        new Thread("Stream copy") {
             @Override
             public void run() {
                 byte[] buffer = new byte[4096];
@@ -119,7 +119,7 @@
                     throw new RuntimeException(e);
                 }
             }
-        }.run();
+        }.start();
     }
 
 }
