diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/expr/EqualityVisitor.java b/exec/java-exec/src/main/java/org/apache/drill/exec/expr/EqualityVisitor.java
index 433e95f..5f79f32 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/expr/EqualityVisitor.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/expr/EqualityVisitor.java
@@ -290,7 +290,7 @@
     if (!(value instanceof TypedNullConstant)) {
       return false;
     }
-    return e.getMajorType().equals(e.getMajorType());
+    return value.getMajorType().equals(e.getMajorType());
   }
 
   @Override
