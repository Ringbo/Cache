diff --git a/common/buildcraft/transport/client/render/PipeTransportRendererItems.java b/common/buildcraft/transport/client/render/PipeTransportRendererItems.java
index 1abe57f..15296f7 100644
--- a/common/buildcraft/transport/client/render/PipeTransportRendererItems.java
+++ b/common/buildcraft/transport/client/render/PipeTransportRendererItems.java
@@ -57,7 +57,7 @@
                 break;
             }
 
-            if (item == null) {
+            if (item == null || item.getContainer() != pipe.container) {
                 continue;
             }
 
