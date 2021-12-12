diff --git a/butterknife-gradle-plugin/src/main/java/butterknife/plugin/FinalRClassBuilder.java b/butterknife-gradle-plugin/src/main/java/butterknife/plugin/FinalRClassBuilder.java
index a08f9c3..672da6d 100644
--- a/butterknife-gradle-plugin/src/main/java/butterknife/plugin/FinalRClassBuilder.java
+++ b/butterknife-gradle-plugin/src/main/java/butterknife/plugin/FinalRClassBuilder.java
@@ -81,7 +81,7 @@
   }
 
   private static boolean isInt(FieldDeclaration field) {
-    Type type = field.getElementType();
+    Type type = field.getCommonType();
     return type instanceof PrimitiveType
         && ((PrimitiveType) type).getType() == PrimitiveType.Primitive.INT;
   }
