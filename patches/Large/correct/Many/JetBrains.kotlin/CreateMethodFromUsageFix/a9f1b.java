diff --git a/idea/src/org/jetbrains/jet/plugin/quickfix/CreateMethodFromUsageFix.java b/idea/src/org/jetbrains/jet/plugin/quickfix/CreateMethodFromUsageFix.java
index 3b7d777..9e05f4f 100644
--- a/idea/src/org/jetbrains/jet/plugin/quickfix/CreateMethodFromUsageFix.java
+++ b/idea/src/org/jetbrains/jet/plugin/quickfix/CreateMethodFromUsageFix.java
@@ -624,7 +624,7 @@
 
         JetScope scope;
         if (isExtension) {
-            NamespaceDescriptor namespaceDescriptor = currentFileContext.get(BindingContext.FILE_TO_NAMESPACE, containingFile);
+            NamespaceDescriptor namespaceDescriptor = currentFileContext.get(BindingContext.FILE_TO_NAMESPACE, currentFile);
             assert namespaceDescriptor != null;
             scope = namespaceDescriptor.getMemberScope();
         } else {
