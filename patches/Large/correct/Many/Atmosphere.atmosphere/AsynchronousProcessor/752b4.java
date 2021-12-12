diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
index dc809ff..03b97e0 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
@@ -417,7 +417,7 @@
             synchronized (impl) {
                 try {
                     if (impl.isCancelled()) {
-                        logger.trace("{} is already cancelled", impl.uuid());
+                        logger.error("{} is already cancelled", impl.uuid());
                         return false;
                     }
 
