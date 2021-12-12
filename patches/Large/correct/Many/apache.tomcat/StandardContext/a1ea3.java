diff --git a/java/org/apache/catalina/core/StandardContext.java b/java/org/apache/catalina/core/StandardContext.java
index c7789ac..ef8e67f 100644
--- a/java/org/apache/catalina/core/StandardContext.java
+++ b/java/org/apache/catalina/core/StandardContext.java
@@ -4954,7 +4954,7 @@
 
         // Acquire (or calculate) the work directory path
         String workDir = getWorkDir();
-        if (workDir == null) {
+        if (workDir == null || workDir.length() == 0) {
 
             // Retrieve our parent (normally a host) name
             String hostName = null;
