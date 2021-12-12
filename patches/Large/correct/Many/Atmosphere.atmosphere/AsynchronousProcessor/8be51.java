diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
index 16e20f3..7714a73 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
@@ -490,7 +490,7 @@
                     invokeAtmosphereHandler(r);
 
                     try {
-                        r.getResponse().sendError(503);
+                        r.getResponse().sendError(503, "Remotely closed");
                         r.getResponse().getOutputStream().close();
                     } catch (Throwable t) {
                         try {
