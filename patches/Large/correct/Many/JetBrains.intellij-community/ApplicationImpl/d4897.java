diff --git a/source/com/intellij/openapi/application/impl/ApplicationImpl.java b/source/com/intellij/openapi/application/impl/ApplicationImpl.java
index f804a23..f9b6638 100644
--- a/source/com/intellij/openapi/application/impl/ApplicationImpl.java
+++ b/source/com/intellij/openapi/application/impl/ApplicationImpl.java
@@ -116,7 +116,7 @@
 
     loadApplicationComponents();
 
-    if (SystemInfo.isMac) {
+    if (SystemInfo.isMac || myTestModeFlag) {
       registerShutdownHook();
     }
   }
