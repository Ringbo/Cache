diff --git a/src/main/java/graphql/schema/Coercing.java b/src/main/java/graphql/schema/Coercing.java
index d168177..9c201a1 100644
--- a/src/main/java/graphql/schema/Coercing.java
+++ b/src/main/java/graphql/schema/Coercing.java
@@ -1,7 +1,7 @@
 package graphql.schema;
 
 
-public interface Coercing<T> {
+public interface Coercing<I, O> {
 
 
     /**
@@ -10,7 +10,7 @@
      * @param input is never null
      * @return null if not possible/invalid
      */
-    T serialize(Object input);
+    O serialize(Object input);
 
     /**
      * Called to resolve a input from a variable.
@@ -19,7 +19,7 @@
      * @param input is never null
      * @return null if not possible/invalid
      */
-    T parseValue(Object input);
+    I parseValue(Object input);
 
     /**
      * Called to convert a AST node
@@ -27,5 +27,5 @@
      * @param input is never null
      * @return null if not possible/invalid
      */
-    T parseLiteral(Object input);
+    I parseLiteral(Object input);
 }
