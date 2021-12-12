diff --git a/src/main/groovy/lang/MetaMethod.java b/src/main/groovy/lang/MetaMethod.java
index 211560b..b13f7ff 100644
--- a/src/main/groovy/lang/MetaMethod.java
+++ b/src/main/groovy/lang/MetaMethod.java
@@ -174,7 +174,7 @@
         if (signature == null) {
             CachedClass [] parameters = getParameterTypes();
             final String name = getName();
-            StringBuffer buf = new StringBuffer(name.length()+parameters.length*10);
+            StringBuilder buf = new StringBuilder(name.length()+parameters.length*10);
             buf.append(getReturnType().getName());
             //
             buf.append(' ');
