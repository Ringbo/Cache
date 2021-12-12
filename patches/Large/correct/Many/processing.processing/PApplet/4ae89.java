diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index 8c26892..cb84f67 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -7413,7 +7413,7 @@
       URL jarURL =
           PApplet.class.getProtectionDomain().getCodeSource().getLocation();
       // Decode URL
-      String jarPath = jarURL.toURI().getPath();
+      String jarPath = jarURL.toURI().getSchemeSpecificPart();
 
       // Workaround for bug in Java for OS X from Oracle (7u51)
       // https://github.com/processing/processing/issues/2181
