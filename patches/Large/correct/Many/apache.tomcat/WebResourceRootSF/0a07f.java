diff --git a/java/org/apache/catalina/storeconfig/WebResourceRootSF.java b/java/org/apache/catalina/storeconfig/WebResourceRootSF.java
index 865326b..a1d663b 100644
--- a/java/org/apache/catalina/storeconfig/WebResourceRootSF.java
+++ b/java/org/apache/catalina/storeconfig/WebResourceRootSF.java
@@ -65,7 +65,7 @@
                             + ".[JarResources]");
             if (jarResourcesElementDesc != null) {
                 for (WebResourceSet jarResources : jarResourcesArray) {
-                    preResourcesElementDesc.getStoreFactory().store(aWriter, indent,
+                    jarResourcesElementDesc.getStoreFactory().store(aWriter, indent,
                             jarResources);
                 }
             }
@@ -77,7 +77,7 @@
                             + ".[PostResources]");
             if (postResourcesElementDesc != null) {
                 for (WebResourceSet postResources : postResourcesArray) {
-                    preResourcesElementDesc.getStoreFactory().store(aWriter, indent,
+                    postResourcesElementDesc.getStoreFactory().store(aWriter, indent,
                             postResources);
                 }
             }
