diff --git a/modules/codegen/src/main/java/org/apache/ignite/codegen/MessageCodeGenerator.java b/modules/codegen/src/main/java/org/apache/ignite/codegen/MessageCodeGenerator.java
index 81e4410..7962a4b 100644
--- a/modules/codegen/src/main/java/org/apache/ignite/codegen/MessageCodeGenerator.java
+++ b/modules/codegen/src/main/java/org/apache/ignite/codegen/MessageCodeGenerator.java
@@ -322,7 +322,7 @@
 
         indent = 2;
 
-        boolean hasSuper = cls.getSuperclass() != BASE_CLS;
+        boolean hasSuper = cls.getSuperclass() != Object.class;
 
         start(write, hasSuper ? "writeTo" : null, true);
         start(read, hasSuper ? "readFrom" : null, false);
@@ -354,7 +354,7 @@
 
         state = 0;
 
-        while (cls.getSuperclass() != BASE_CLS) {
+        while (cls.getSuperclass() != Object.class) {
             cls = cls.getSuperclass();
 
             for (Field field : cls.getDeclaredFields()) {
@@ -396,7 +396,7 @@
             if (write)
                 returnFalseIfFailed(code, "super." + superMtd, BUF_VAR, "writer");
             else
-                returnFalseIfFailed(code, "super." + superMtd, BUF_VAR);
+                returnFalseIfFailed(code, "super." + superMtd, BUF_VAR, "reader");
 
             code.add(EMPTY);
         }
@@ -571,19 +571,21 @@
             returnFalseIfFailed(write, "writer.writeMessage", field, name);
         else if (type.isArray()) {
             returnFalseIfFailed(write, "writer.writeObjectArray", field, name,
-                "Type." + typeEnum(type.getComponentType()));
+                "MessageCollectionItemType." + typeEnum(type.getComponentType()));
         }
         else if (Collection.class.isAssignableFrom(type) && !Set.class.isAssignableFrom(type)) {
             assert colItemType != null;
 
-            returnFalseIfFailed(write, "writer.writeCollection", field, name, "Type." + typeEnum(colItemType));
+            returnFalseIfFailed(write, "writer.writeCollection", field, name,
+                "MessageCollectionItemType." + typeEnum(colItemType));
         }
         else if (Map.class.isAssignableFrom(type)) {
             assert mapKeyType != null;
             assert mapValType != null;
 
-            returnFalseIfFailed(write, "writer.writeMap", field, name, "Type." + typeEnum(mapKeyType),
-                "Type." + typeEnum(mapValType));
+            returnFalseIfFailed(write, "writer.writeMap", field, name,
+                "MessageCollectionItemType." + typeEnum(mapKeyType),
+                "MessageCollectionItemType." + typeEnum(mapValType));
         }
         else
             throw new IllegalStateException("Unsupported type: " + type);
@@ -658,13 +660,15 @@
         else if (type.isArray()) {
             Class<?> compType = type.getComponentType();
 
-            returnFalseIfReadFailed(name, "reader.readObjectArray", field, "Type." + typeEnum(compType),
+            returnFalseIfReadFailed(name, "reader.readObjectArray", field,
+                "MessageCollectionItemType." + typeEnum(compType),
                 compType.getSimpleName() + ".class");
         }
         else if (Collection.class.isAssignableFrom(type) && !Set.class.isAssignableFrom(type)) {
             assert colItemType != null;
 
-            returnFalseIfReadFailed(name, "reader.readCollection", field, "Type." + typeEnum(colItemType));
+            returnFalseIfReadFailed(name, "reader.readCollection", field,
+                "MessageCollectionItemType." + typeEnum(colItemType));
         }
         else if (Map.class.isAssignableFrom(type)) {
             assert mapKeyType != null;
@@ -672,8 +676,10 @@
 
             boolean linked = type.equals(LinkedHashMap.class);
 
-            returnFalseIfReadFailed(name, "reader.readMap", field, "Type." + typeEnum(mapKeyType),
-                "Type." + typeEnum(mapValType), linked ? "true" : "false");
+            returnFalseIfReadFailed(name, "reader.readMap", field,
+                "MessageCollectionItemType." + typeEnum(mapKeyType),
+                "MessageCollectionItemType." + typeEnum(mapValType),
+                linked ? "true" : "false");
         }
         else
             throw new IllegalStateException("Unsupported type: " + type);
