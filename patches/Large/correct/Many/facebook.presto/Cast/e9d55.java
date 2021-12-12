diff --git a/presto-parser/src/main/java/com/facebook/presto/sql/tree/Cast.java b/presto-parser/src/main/java/com/facebook/presto/sql/tree/Cast.java
index 4a2a21e..b3fcac2 100644
--- a/presto-parser/src/main/java/com/facebook/presto/sql/tree/Cast.java
+++ b/presto-parser/src/main/java/com/facebook/presto/sql/tree/Cast.java
@@ -64,7 +64,7 @@
         requireNonNull(type, "type is null");
 
         this.expression = expression;
-        this.type = type.toUpperCase(ENGLISH);
+        this.type = type.toLowerCase(ENGLISH);
         this.safe = safe;
         this.typeOnly = typeOnly;
     }
