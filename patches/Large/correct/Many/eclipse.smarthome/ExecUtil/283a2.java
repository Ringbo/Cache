diff --git a/bundles/io/org.eclipse.smarthome.io.net/src/main/java/org/eclipse/smarthome/io/net/exec/ExecUtil.java b/bundles/io/org.eclipse.smarthome.io.net/src/main/java/org/eclipse/smarthome/io/net/exec/ExecUtil.java
index de795b2..ea9632a 100644
--- a/bundles/io/org.eclipse.smarthome.io.net/src/main/java/org/eclipse/smarthome/io/net/exec/ExecUtil.java
+++ b/bundles/io/org.eclipse.smarthome.io.net/src/main/java/org/eclipse/smarthome/io/net/exec/ExecUtil.java
@@ -104,7 +104,7 @@
         ByteArrayOutputStream stdout = new ByteArrayOutputStream();
         PumpStreamHandler streamHandler = new PumpStreamHandler(stdout);
 
-        executor.setExitValue(1);
+        executor.setExitValues(null);
         executor.setStreamHandler(streamHandler);
         executor.setWatchdog(watchdog);
 
@@ -113,9 +113,9 @@
             executor.execute(cmdLine, resultHandler);
             logger.debug("executed commandLine '{}'", commandLine);
         } catch (ExecuteException e) {
-            logger.error("couldn't execute commandLine '" + commandLine + "'", e);
+            logger.warn("couldn't execute commandLine '" + commandLine + "'", e);
         } catch (IOException e) {
-            logger.error("couldn't execute commandLine '" + commandLine + "'", e);
+            logger.warn("couldn't execute commandLine '" + commandLine + "'", e);
         }
 
         // some time later the result handler callback was invoked so we
@@ -130,7 +130,7 @@
                 logger.debug("exit code '{}', result '{}'", exitCode, retval);
             }
         } catch (InterruptedException e) {
-            logger.error("Timeout occured when executing commandLine '" + commandLine + "'", e);
+            logger.warn("Timeout occured when executing commandLine '" + commandLine + "'", e);
         }
 
         return retval;
