diff --git a/nar-bundles/framework-bundle/framework/core/src/main/java/org/apache/nifi/controller/FileSystemSwapManager.java b/nar-bundles/framework-bundle/framework/core/src/main/java/org/apache/nifi/controller/FileSystemSwapManager.java
index bf76bad..c1ebc97 100644
--- a/nar-bundles/framework-bundle/framework/core/src/main/java/org/apache/nifi/controller/FileSystemSwapManager.java
+++ b/nar-bundles/framework-bundle/framework/core/src/main/java/org/apache/nifi/controller/FileSystemSwapManager.java
@@ -549,7 +549,7 @@
 
                         swapQueue.getQueue().add(swapFile);
                     } else {
-                        swapFile.delete();
+                        swapTempFile.delete();
                     }
                 }
             }
