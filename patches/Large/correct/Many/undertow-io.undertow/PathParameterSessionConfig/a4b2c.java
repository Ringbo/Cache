diff --git a/core/src/main/java/io/undertow/server/session/PathParameterSessionConfig.java b/core/src/main/java/io/undertow/server/session/PathParameterSessionConfig.java
index ee9bfb5..65a6801 100644
--- a/core/src/main/java/io/undertow/server/session/PathParameterSessionConfig.java
+++ b/core/src/main/java/io/undertow/server/session/PathParameterSessionConfig.java
@@ -91,7 +91,7 @@
             anchor = path.substring(pound);
             path = path.substring(0, pound);
         }
-        int fragmentIndex = url.lastIndexOf(';');
+        int fragmentIndex = path.lastIndexOf(';');
         if(fragmentIndex >= 0) {
             fragment = path.substring(fragmentIndex);
             path = path.substring(0, fragmentIndex);
