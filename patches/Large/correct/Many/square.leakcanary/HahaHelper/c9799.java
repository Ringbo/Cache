diff --git a/leakcanary-analyzer/src/main/java/com/squareup/leakcanary/HahaHelper.java b/leakcanary-analyzer/src/main/java/com/squareup/leakcanary/HahaHelper.java
index a651572..072f709 100644
--- a/leakcanary-analyzer/src/main/java/com/squareup/leakcanary/HahaHelper.java
+++ b/leakcanary-analyzer/src/main/java/com/squareup/leakcanary/HahaHelper.java
@@ -66,7 +66,7 @@
     boolean extendsThread = false;
     ClassObj parentClass = clazz;
     while (parentClass.getSuperClassObj() != null) {
-      if (clazz.getClassName().equals(Thread.class.getName())) {
+      if (parentClass.getClassName().equals(Thread.class.getName())) {
         extendsThread = true;
         break;
       }
