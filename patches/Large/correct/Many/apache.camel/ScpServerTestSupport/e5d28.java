diff --git a/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpServerTestSupport.java b/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpServerTestSupport.java
index 34aa27c..fef2c1e 100644
--- a/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpServerTestSupport.java
+++ b/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpServerTestSupport.java
@@ -95,7 +95,7 @@
 
         if (sshd != null) {
             try {
-                sshd.stop();
+                sshd.stop(true);
                 sshd = null;
             } catch (Exception e) {
                 // ignore while shutting down as we could be polling during shutdown
