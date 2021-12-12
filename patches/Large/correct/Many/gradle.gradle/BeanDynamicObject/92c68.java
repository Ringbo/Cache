diff --git a/subprojects/core/src/main/java/org/gradle/internal/metaobject/BeanDynamicObject.java b/subprojects/core/src/main/java/org/gradle/internal/metaobject/BeanDynamicObject.java
index 8d86b72..fc1551e 100644
--- a/subprojects/core/src/main/java/org/gradle/internal/metaobject/BeanDynamicObject.java
+++ b/subprojects/core/src/main/java/org/gradle/internal/metaobject/BeanDynamicObject.java
@@ -522,7 +522,7 @@
 
         @Nullable
         protected MetaMethod lookupMethod(MetaClass metaClass, String name, Class[] arguments) {
-            return metaClass.getMetaMethod(name, arguments);
+            return metaClass.pickMethod(name, arguments);
         }
 
         protected DynamicInvokeResult invokeOpaqueMethod(MetaClass metaClass, String name, Object[] arguments) {
