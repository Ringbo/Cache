diff --git a/platform/projectModel-impl/src/com/intellij/openapi/components/impl/stores/StorageData.java b/platform/projectModel-impl/src/com/intellij/openapi/components/impl/stores/StorageData.java
index 5a88184..cc8defc 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/components/impl/stores/StorageData.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/components/impl/stores/StorageData.java
@@ -85,7 +85,7 @@
         return merger.merge(serverElement, localElement);
       }
     }
-    return localElement;
+    return serverElement;
   }
 
   @Nullable
