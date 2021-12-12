diff --git a/nifi-bootstrap/src/main/java/org/apache/nifi/bootstrap/RunNiFi.java b/nifi-bootstrap/src/main/java/org/apache/nifi/bootstrap/RunNiFi.java
index a3d3de7..098be03 100644
--- a/nifi-bootstrap/src/main/java/org/apache/nifi/bootstrap/RunNiFi.java
+++ b/nifi-bootstrap/src/main/java/org/apache/nifi/bootstrap/RunNiFi.java
@@ -705,9 +705,9 @@
         } catch (final IOException ioe) {
             if (pid == null) {
                 logger.error("Failed to send shutdown command to port {} due to {}. No PID found for the NiFi process, so unable to kill process; "
-                    + "the process should be killed manually.", new Object[] {port, ioe.toString(), ioe});
+                    + "the process should be killed manually.", new Object[] {port, ioe.toString()});
             } else {
-                logger.error("Failed to send shutdown command to port {} due to {}. Will kill the NiFi Process with PID {}.", new Object[] {port, ioe.toString(), ioe, pid});
+                logger.error("Failed to send shutdown command to port {} due to {}. Will kill the NiFi Process with PID {}.", new Object[] {port, ioe.toString(), pid});
                 killProcessTree(pid, logger);
             }
         } finally {
