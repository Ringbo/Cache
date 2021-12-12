diff --git a/src/main/groovy/lang/MetaClassImpl.java b/src/main/groovy/lang/MetaClassImpl.java
index f568f1e..c6c706f 100644
--- a/src/main/groovy/lang/MetaClassImpl.java
+++ b/src/main/groovy/lang/MetaClassImpl.java
@@ -2308,7 +2308,8 @@
         }
 
         // check for a category method named like a setter
-        if (!useSuper && !isStatic && GroovyCategorySupport.hasCategoryInCurrentThread()) {
+        if (!useSuper && !isStatic && GroovyCategorySupport.hasCategoryInCurrentThread()
+        		&& name.length() > 0) {
             String getterName = "set" + MetaClassHelper.capitalize(name);
             MetaMethod categoryMethod = getCategoryMethodSetter(sender, getterName, false);
             if (categoryMethod != null) {
