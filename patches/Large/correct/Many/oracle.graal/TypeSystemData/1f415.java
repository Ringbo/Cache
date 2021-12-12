diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/TypeSystemData.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/TypeSystemData.java
index 97ab223..cbcd426 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/TypeSystemData.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/TypeSystemData.java
@@ -35,7 +35,7 @@
     private List<TypeData> types;
     private List<TypeMirror> primitiveTypeMirrors = new ArrayList<>();
     private List<TypeMirror> boxedTypeMirrors = new ArrayList<>();
-    private Map<TypeMirror, TypeData> cachedTypes = new HashMap<>();
+    private Map<String, TypeData> cachedTypes = new HashMap<>();
 
     private List<ImplicitCastData> implicitCasts;
     private List<TypeCastData> casts;
@@ -59,7 +59,7 @@
             for (TypeData typeData : types) {
                 primitiveTypeMirrors.add(typeData.getPrimitiveType());
                 boxedTypeMirrors.add(typeData.getBoxedType());
-                cachedTypes.put(typeData.getPrimitiveType(), typeData);
+                cachedTypes.put(typeData.getPrimitiveType().toString(), typeData);
             }
         }
     }
@@ -154,7 +154,7 @@
     }
 
     public int findType(TypeMirror type) {
-        TypeData data = cachedTypes.get(type);
+        TypeData data = cachedTypes.get(type.toString());
         if (data != null) {
             return data.getIndex();
         }
