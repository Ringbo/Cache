diff --git a/querydsl-core/src/main/java/com/mysema/query/CascadingBoolean.java b/querydsl-core/src/main/java/com/mysema/query/CascadingBoolean.java
index ffdf0f9..59387e3 100644
--- a/querydsl-core/src/main/java/com/mysema/query/CascadingBoolean.java
+++ b/querydsl-core/src/main/java/com/mysema/query/CascadingBoolean.java
@@ -9,7 +9,6 @@
 
 import com.mysema.query.types.expr.EBoolean;
 
-// TODO: Auto-generated Javadoc
 /**
  * CascadingBoolean is a cascading builder for Boolean expressions.
  * 
@@ -22,7 +21,6 @@
     private EBoolean expr;
 
     public CascadingBoolean and(EBoolean right) {
-//        expr = (expr == null) ? right : expr.and(right);
         if (expr == null){
             expr = right;
         }else{
@@ -41,11 +39,10 @@
 
 
     public CascadingBoolean or(EBoolean right) {
-//        expr = (expr == null) ? right : expr.or(right);
         if (expr == null){
             expr = right;
         }else{
-            expr = expr.and(right);
+            expr = expr.or(right);
         }
         return this;
     }
