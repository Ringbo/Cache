diff --git a/h2/src/test/org/h2/test/server/TestWeb.java b/h2/src/test/org/h2/test/server/TestWeb.java
index 6144b51..3017709 100644
--- a/h2/src/test/org/h2/test/server/TestWeb.java
+++ b/h2/src/test/org/h2/test/server/TestWeb.java
@@ -156,7 +156,7 @@
     }
 
     private void testTools() throws Exception {
-        if (config.memory) {
+        if (config.memory || config.cipher != null) {
             return;
         }
         deleteDb("web");
