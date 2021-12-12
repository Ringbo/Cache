diff --git a/dubbo-config/src/main/java/com/alibaba/dubbo/config/ServiceConfig.java b/dubbo-config/src/main/java/com/alibaba/dubbo/config/ServiceConfig.java
index 528ac61..0c050b2 100644
--- a/dubbo-config/src/main/java/com/alibaba/dubbo/config/ServiceConfig.java
+++ b/dubbo-config/src/main/java/com/alibaba/dubbo/config/ServiceConfig.java
@@ -250,7 +250,7 @@
     }
 
     public synchronized void unexport() {
-        if (exported) {
+        if (!exported) {
             throw new IllegalStateException("No exported!");
         }
         if (unexported) {
