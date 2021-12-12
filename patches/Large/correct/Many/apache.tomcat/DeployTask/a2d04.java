diff --git a/java/org/apache/catalina/ant/DeployTask.java b/java/org/apache/catalina/ant/DeployTask.java
index ec406b6..82a0515 100644
--- a/java/org/apache/catalina/ant/DeployTask.java
+++ b/java/org/apache/catalina/ant/DeployTask.java
@@ -140,7 +140,7 @@
         String contentType = null;
         int contentLength = -1;
         if (war != null) {
-            if (war.startsWith("file:")) {
+            if (!war.startsWith("file:")) {
                 try {
                     URL url = new URL(war);
                     URLConnection conn = url.openConnection();
