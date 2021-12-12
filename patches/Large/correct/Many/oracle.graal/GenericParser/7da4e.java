diff --git a/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/GenericParser.java b/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/GenericParser.java
index 35d1a2b..01f725b 100644
--- a/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/GenericParser.java
+++ b/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/GenericParser.java
@@ -52,7 +52,7 @@
             types.add(type.getType().getPrimitiveType());
         }
         TypeMirror[] array = types.toArray(new TypeMirror[types.size()]);
-        return new ParameterSpec(valueName, array, nodeData.getTypeSystem().getGenericType(), false, Cardinality.ONE);
+        return new ParameterSpec(valueName, array, false, Cardinality.ONE);
     }
 
     @Override
