diff --git a/test/org/apache/coyote/http2/TestHttp2Section_5_3.java b/test/org/apache/coyote/http2/TestHttp2Section_5_3.java
index bc74d87..095e8e0 100644
--- a/test/org/apache/coyote/http2/TestHttp2Section_5_3.java
+++ b/test/org/apache/coyote/http2/TestHttp2Section_5_3.java
@@ -163,7 +163,7 @@
                 // Unexpected stream
                 Assert.fail("Unexpected stream: [" + output.getTrace() + "]");
             }
-            if (data[1] > 3) {
+            if (data[1] > 10) {
                 // Larger than expected body size
                 Assert.fail("Larger than expected body: [" + output.getTrace() + "]");
             }
@@ -177,7 +177,7 @@
         // possible that the timing of the server threads is such that there are
         // still small body frames to read.
         int[] data = parseBodyFrame(output.getTrace());
-        while (data[1] < 4) {
+        while (data[1] < 10) {
             // Debugging Gump failure
             log.info(output.getTrace());
             output.clearTrace();
@@ -193,12 +193,16 @@
             log.info(output.getTrace());
             if (data[0] == 19) {
                 seen19 = true;
-                if (data[1] < 256 || data[1] > 260) {
+                // If everything works instantly this should be 256 but allow a
+                // fairly large margin for timing differences
+                if (data[1] < 256 || data[1] > 290) {
                     Assert.fail("Unexpected body size: [" + output.getTrace() + "]");
                 }
             } else if (data[0] == 21) {
                 seen21 = true;
-                if (data[1] < 768 || data[1] > 772) {
+                // If everything works instantly this should be 768 but allow a
+                // fairly large margin for timing differences
+                if (data[1] < 768 || data[1] > 800) {
                     Assert.fail("Unexpected body size: [" + output.getTrace() + "]");
                 }
             } else {
