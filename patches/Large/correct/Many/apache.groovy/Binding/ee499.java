diff --git a/src/main/groovy/lang/Binding.java b/src/main/groovy/lang/Binding.java
index 8af7792..1eee99b 100644
--- a/src/main/groovy/lang/Binding.java
+++ b/src/main/groovy/lang/Binding.java
@@ -85,7 +85,8 @@
         Object result = variables.get(name);
         
         if (result == null && !variables.containsKey(name)) {
-        		throw new MissingPropertyException(name, Binding.class);
+            throw new MissingPropertyException("The property '" + name + "' is missing from the binding.",
+                                               name, Binding.class);
         }
         
         return result;
