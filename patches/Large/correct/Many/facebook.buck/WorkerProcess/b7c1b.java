diff --git a/src/com/facebook/buck/shell/WorkerProcess.java b/src/com/facebook/buck/shell/WorkerProcess.java
index aff50d5..a78f18e 100644
--- a/src/com/facebook/buck/shell/WorkerProcess.java
+++ b/src/com/facebook/buck/shell/WorkerProcess.java
@@ -145,7 +145,7 @@
         protocol.close();
       }
       Files.deleteIfExists(stdErr);
-    } catch (IOException e) {
+    } catch (Exception e) {
       LOG.debug(e, "Error closing worker process %s.", this.hashCode());
       throw new HumanReadableException(e,
           "Error while trying to close the process %s at the end of the build.",
