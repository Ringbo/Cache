diff --git a/src/main/groovy/lang/MetaClassImpl.java b/src/main/groovy/lang/MetaClassImpl.java
index b875b47..152554a 100644
--- a/src/main/groovy/lang/MetaClassImpl.java
+++ b/src/main/groovy/lang/MetaClassImpl.java
@@ -1909,7 +1909,7 @@
         if (!useSuper && !isStatic && GroovyCategorySupport.hasCategoryInCurrentThread()) {
             String getterName = GroovyCategorySupport.getPropertyCategoryGetterName(name);
             if (getterName != null) {
-                MetaMethod categoryMethod = getCategoryMethodGetter(sender, getterName, false);
+                MetaMethod categoryMethod = getCategoryMethodGetter(theClass, getterName, false);
                 if (categoryMethod != null)
                     method = categoryMethod;
             }
