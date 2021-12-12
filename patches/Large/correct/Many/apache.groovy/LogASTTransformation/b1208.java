diff --git a/src/main/org/codehaus/groovy/transform/LogASTTransformation.java b/src/main/org/codehaus/groovy/transform/LogASTTransformation.java
index 5ab4fb6..2b8523a 100644
--- a/src/main/org/codehaus/groovy/transform/LogASTTransformation.java
+++ b/src/main/org/codehaus/groovy/transform/LogASTTransformation.java
@@ -247,7 +247,7 @@
         }
 
         public String getCategoryName(ClassNode classNode, String categoryName){
-            if(categoryName == DEFAULT_CATEGORY_NAME){
+            if(categoryName.equals(DEFAULT_CATEGORY_NAME)){
                 return classNode.getName();
             }
             return categoryName;
@@ -258,7 +258,7 @@
             try {
                 return ClassHelper.make(Class.forName(name, false, cl));
             } catch (ClassNotFoundException e) {
-                throw new GroovyRuntimeException(e);
+                throw new GroovyRuntimeException("Unable to load logging class", e);
             }
         }
     }
