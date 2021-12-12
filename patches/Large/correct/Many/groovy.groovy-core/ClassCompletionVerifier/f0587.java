diff --git a/src/main/org/codehaus/groovy/classgen/ClassCompletionVerifier.java b/src/main/org/codehaus/groovy/classgen/ClassCompletionVerifier.java
index 7fdcf3b..48d454a 100644
--- a/src/main/org/codehaus/groovy/classgen/ClassCompletionVerifier.java
+++ b/src/main/org/codehaus/groovy/classgen/ClassCompletionVerifier.java
@@ -104,7 +104,7 @@
     }
 
     private String getDescription(MethodNode node) {
-        return "method '" + node.getName() + "'";
+        return "method '" + node.getTypeDescriptor() + "'";
     }
 
     private String getDescription(FieldNode node) {
