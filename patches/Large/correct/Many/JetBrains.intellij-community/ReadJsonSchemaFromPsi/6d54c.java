diff --git a/json/src/com/jetbrains/jsonSchema/impl/ReadJsonSchemaFromPsi.java b/json/src/com/jetbrains/jsonSchema/impl/ReadJsonSchemaFromPsi.java
index 96df014..c4613a6 100644
--- a/json/src/com/jetbrains/jsonSchema/impl/ReadJsonSchemaFromPsi.java
+++ b/json/src/com/jetbrains/jsonSchema/impl/ReadJsonSchemaFromPsi.java
@@ -179,7 +179,7 @@
           if (value instanceof JsonStringLiteral) {
             objects.add("\"" + StringUtil.unquoteString(((JsonStringLiteral)value).getValue()) + "\"");
           } else if (value instanceof JsonNumberLiteral) {
-            objects.add(getNumber(value));
+            objects.add(getNumber((JsonNumberLiteral)value));
           } else if (value instanceof JsonBooleanLiteral) {
             objects.add(((JsonBooleanLiteral)value).getValue());
           } else if (value instanceof JsonNullLiteral) {
@@ -192,12 +192,12 @@
   }
 
   @NotNull
-  private static Number getNumber(@NotNull JsonValue value) {
+  private static Number getNumber(@NotNull JsonNumberLiteral value) {
     Number numberValue;
     try {
       numberValue = Integer.parseInt(value.getText());
     } catch (NumberFormatException e) {
-      numberValue = ((JsonNumberLiteral)value).getValue();
+      numberValue = value.getValue();
     }
     return numberValue;
   }
