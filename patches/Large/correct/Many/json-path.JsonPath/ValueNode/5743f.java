diff --git a/json-path/src/main/java/com/jayway/jsonpath/internal/filter/ValueNode.java b/json-path/src/main/java/com/jayway/jsonpath/internal/filter/ValueNode.java
index 98e2d1c..3f3914e 100644
--- a/json-path/src/main/java/com/jayway/jsonpath/internal/filter/ValueNode.java
+++ b/json-path/src/main/java/com/jayway/jsonpath/internal/filter/ValueNode.java
@@ -154,7 +154,7 @@
         if ((c0 == '[' && c1 == ']') || (c0 == '{' && c1 == '}')){
             try {
                 Configuration.defaultConfiguration().jsonProvider().parse(str);
-                return false;
+                return true;
             } catch(Exception e){
                 return false;
             }
