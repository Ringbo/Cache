diff --git a/querydsl-core/src/main/java/com/mysema/query/types/Converter.java b/querydsl-core/src/main/java/com/mysema/query/types/Converter.java
index d8ac0cf..178e1f8 100644
--- a/querydsl-core/src/main/java/com/mysema/query/types/Converter.java
+++ b/querydsl-core/src/main/java/com/mysema/query/types/Converter.java
@@ -14,7 +14,7 @@
  *
  * @param <D>
  */
-interface Converter<Source extends Expr<?>, Target extends Expr<?>>{
+interface Converter<S extends Expr<?>, T extends Expr<?>>{
     
     Converter<EString,EString> toLowerCase = new Converter<EString,EString>(){
         @Override
@@ -55,5 +55,5 @@
      * @param arg
      * @return
      */
-    Target convert(Source arg); 
+    T convert(S arg); 
 }
