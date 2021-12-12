diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java
index 7f280cb..87d7e7d 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/parser/parsing/statements/constructor/ConstructorBody.java
@@ -46,7 +46,7 @@
     if (b) {
       constructorInvokationMarker.done(EXPLICIT_CONSTRUCTOR);
     } else {
-      constructorInvokationMarker.drop();
+      constructorInvokationMarker.rollbackTo();
     }
 
     //explicit constructor invocation
