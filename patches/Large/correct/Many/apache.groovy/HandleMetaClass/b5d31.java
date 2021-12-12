diff --git a/src/main/org/codehaus/groovy/runtime/HandleMetaClass.java b/src/main/org/codehaus/groovy/runtime/HandleMetaClass.java
index 47a5007..8bce446 100644
--- a/src/main/org/codehaus/groovy/runtime/HandleMetaClass.java
+++ b/src/main/org/codehaus/groovy/runtime/HandleMetaClass.java
@@ -31,7 +31,7 @@
     public HandleMetaClass(MetaClass mc, Object obj) {
         super(mc);
         if (obj != null) {
-            if (InvokerHelper.getMetaClass(obj.getClass()) == mc)
+            if (InvokerHelper.getMetaClass(obj.getClass()) == mc || !(mc instanceof ExpandoMetaClass))
               object = obj; // object has default meta class, so we need to replace it on demand
             else
               object = NONE; // object already has per instance meta class
