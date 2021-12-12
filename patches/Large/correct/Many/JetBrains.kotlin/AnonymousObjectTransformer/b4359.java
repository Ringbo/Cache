diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/inline/AnonymousObjectTransformer.java b/compiler/backend/src/org/jetbrains/jet/codegen/inline/AnonymousObjectTransformer.java
index 465a4f7..501982d 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/inline/AnonymousObjectTransformer.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/inline/AnonymousObjectTransformer.java
@@ -79,7 +79,7 @@
                 if (file == null) {
                     throw new RuntimeException("Couldn't find virtual file for " + objectInternalName);
                 }
-                reader = new ClassReader(file.getInputStream());
+                reader = new ClassReader(file.contentsToByteArray());
             }
         }
         catch (IOException e) {
