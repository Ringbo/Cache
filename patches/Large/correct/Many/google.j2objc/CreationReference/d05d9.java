diff --git a/translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java b/translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java
index 79a70b9..01788b7 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/ast/CreationReference.java
@@ -27,7 +27,7 @@
 
   public CreationReference(CreationReference other) {
     super(other);
-    type.set(other.getType());
+    type.copyFrom(other.getType());
   }
 
   @Override
