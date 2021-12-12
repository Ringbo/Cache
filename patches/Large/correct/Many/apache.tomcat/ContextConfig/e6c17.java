diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index dd034d3..5274815 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -1010,7 +1010,8 @@
         try {
             fixDocBase();
         } catch (IOException e) {
-            log.error(sm.getString("contextConfig.fixDocBase"), e);
+            log.error(sm.getString(
+                    "contextConfig.fixDocBase", context.getPath()), e);
         }
         
     }
