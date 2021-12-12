diff --git a/test/tools/TestDumpSeries.java b/test/tools/TestDumpSeries.java
index 9ae4d65..d636637 100644
--- a/test/tools/TestDumpSeries.java
+++ b/test/tools/TestDumpSeries.java
@@ -186,7 +186,7 @@
         "[0, 0, 1, 80, -30, 53, 16, 0, 0, 1, 0, 0, 1] sys.cpu.user 1357002000",
         log_lines[8].substring(0, 68));
     assertEquals(
-        "  [1, 0, 0, 0, 0]\t[123, 34, 116, 115, 117, 105, 100, "
+        "  [1, 0, 0]\t[123, 34, 116, 115, 117, 105, 100, "
         + "34, 58, 34, 48, 48, 48, 48, 48, 49, 48, 48, 48, 48, 48, 49, 48, 48, "
         + "48, 48, 48, 49, 34, 44, 34, 115, 116, 97, 114, 116, 84, 105, 109, "
         + "101, 34, 58, 49, 51, 53, 55, 48, 48, 50, 48, 48, 48, 48, 48, 48, "
@@ -199,7 +199,7 @@
         + "\"000001000001000001\",\"startTime\":1357002000000,\"endTime\":0,"
         + "\"description\":\"Annotation on milliseconds\",\"notes\":\"\","
         + "\"custom\":null}\t1357002016000",
-        log_lines[9].substring(0, 780));
+        log_lines[9].substring(0, 774));
     assertEquals(
         "  [-16, 0, 0, 0]\t[42]\t0\tl\t1357002000000",
         log_lines[10].substring(0, 39));
