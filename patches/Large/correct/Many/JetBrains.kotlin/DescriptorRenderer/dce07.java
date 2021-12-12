diff --git a/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java b/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java
index 4eeb163..868e7ec 100644
--- a/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java
+++ b/compiler/frontend/src/org/jetbrains/jet/resolve/DescriptorRenderer.java
@@ -73,7 +73,7 @@
     }
 
     public String renderType(JetType type) {
-        if (type != null) {
+        if (type == null) {
             return escape("<?>");
         } else {
             return escape(type.toString());
