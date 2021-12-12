diff --git a/presto-main/src/main/java/com/facebook/presto/sql/gen/JoinCompiler.java b/presto-main/src/main/java/com/facebook/presto/sql/gen/JoinCompiler.java
index 35944b4..25ef990 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/gen/JoinCompiler.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/gen/JoinCompiler.java
@@ -163,7 +163,7 @@
         return defineClass(classDefinition, PagesHashStrategy.class, callSiteBinder.getBindings(), getClass().getClassLoader());
     }
 
-    private void generateConstructor(ClassDefinition classDefinition,
+    private static void generateConstructor(ClassDefinition classDefinition,
             List<Integer> joinChannels,
             FieldDefinition sizeField,
             List<FieldDefinition> channelFields,
@@ -238,7 +238,7 @@
         constructor.ret();
     }
 
-    private void generateGetChannelCountMethod(ClassDefinition classDefinition, List<FieldDefinition> channelFields)
+    private static void generateGetChannelCountMethod(ClassDefinition classDefinition, List<FieldDefinition> channelFields)
     {
         classDefinition.declareMethod(
                 a(PUBLIC),
@@ -249,7 +249,7 @@
                 .retInt();
     }
 
-    private void generateGetSizeInBytesMethod(ClassDefinition classDefinition, FieldDefinition sizeField)
+    private static void generateGetSizeInBytesMethod(ClassDefinition classDefinition, FieldDefinition sizeField)
     {
         MethodDefinition method = classDefinition.declareMethod(a(PUBLIC), "getSizeInBytes", type(long.class));
 
@@ -259,7 +259,7 @@
                 .retLong();
     }
 
-    private void generateAppendToMethod(ClassDefinition classDefinition, CallSiteBinder callSiteBinder, List<Type> types, List<FieldDefinition> channelFields)
+    private static void generateAppendToMethod(ClassDefinition classDefinition, CallSiteBinder callSiteBinder, List<Type> types, List<FieldDefinition> channelFields)
     {
         Parameter blockIndex = arg("blockIndex", int.class);
         Parameter blockPosition = arg("blockPosition", int.class);
@@ -294,7 +294,7 @@
         appendToBody.ret();
     }
 
-    private void generateHashPositionMethod(ClassDefinition classDefinition, CallSiteBinder callSiteBinder, List<Type> joinChannelTypes, List<FieldDefinition> joinChannelFields, FieldDefinition hashChannelField)
+    private static void generateHashPositionMethod(ClassDefinition classDefinition, CallSiteBinder callSiteBinder, List<Type> joinChannelTypes, List<FieldDefinition> joinChannelFields, FieldDefinition hashChannelField)
     {
         Parameter blockIndex = arg("blockIndex", int.class);
         Parameter blockPosition = arg("blockPosition", int.class);
@@ -353,7 +353,7 @@
                 .retInt();
     }
 
-    private void generateHashRowMethod(ClassDefinition classDefinition, CallSiteBinder callSiteBinder, List<Type> joinChannelTypes)
+    private static void generateHashRowMethod(ClassDefinition classDefinition, CallSiteBinder callSiteBinder, List<Type> joinChannelTypes)
     {
         Parameter position = arg("position", int.class);
         Parameter blocks = arg("blocks", Block[].class);
@@ -392,7 +392,7 @@
             .ifFalse(type.invoke("hash", int.class, blockRef, blockPosition));
     }
 
-    private void generateRowEqualsRowMethod(
+    private static void generateRowEqualsRowMethod(
             ClassDefinition classDefinition,
             CallSiteBinder callSiteBinder,
             List<Type> joinChannelTypes)
@@ -439,7 +439,7 @@
                 .retInt();
     }
 
-    private void generatePositionEqualsRowMethod(
+    private static void generatePositionEqualsRowMethod(
             ClassDefinition classDefinition,
             CallSiteBinder callSiteBinder,
             List<Type> joinChannelTypes,
@@ -486,7 +486,7 @@
                 .retInt();
     }
 
-    private void generatePositionEqualsPositionMethod(
+    private static void generatePositionEqualsPositionMethod(
             ClassDefinition classDefinition,
             CallSiteBinder callSiteBinder,
             List<Type> joinChannelTypes,
