diff --git a/dex-reader-api/src/main/java/com/googlecode/d2j/node/DexAnnotationNode.java b/dex-reader-api/src/main/java/com/googlecode/d2j/node/DexAnnotationNode.java
index 930aec8..a444456 100644
--- a/dex-reader-api/src/main/java/com/googlecode/d2j/node/DexAnnotationNode.java
+++ b/dex-reader-api/src/main/java/com/googlecode/d2j/node/DexAnnotationNode.java
@@ -122,7 +122,7 @@
 
     public void accept(DexAnnotationAble av) {
         DexAnnotationVisitor av1 = av.visitAnnotation(type, visibility);
-        if (av != null) {
+        if (av1 != null) {
             for (Item item : items) {
                 acceptAnnotationItem(av1, item.name, item.value);
             }
