diff --git a/dex-translator/src/main/java/com/googlecode/dex2jar/v3/AnnotationNode.java b/dex-translator/src/main/java/com/googlecode/dex2jar/v3/AnnotationNode.java
index 0aadf1c..9810575 100644
--- a/dex-translator/src/main/java/com/googlecode/dex2jar/v3/AnnotationNode.java
+++ b/dex-translator/src/main/java/com/googlecode/dex2jar/v3/AnnotationNode.java
@@ -197,7 +197,7 @@
 
         @Override
         public DexAnnotationVisitor visitAnnotation(String name, String desc) {
-            AnnotationNode node = new AnnotationNode();
+            AnnotationNode node = new AnnotationNode(desc, true);
             list.add(node);
             return node;
         }
