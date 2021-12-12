diff --git a/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/ExecutableTypeMethodParser.java b/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/ExecutableTypeMethodParser.java
index 90629c5..9d4e143 100644
--- a/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/ExecutableTypeMethodParser.java
+++ b/graal/com.oracle.truffle.codegen.processor/src/com/oracle/truffle/codegen/processor/node/ExecutableTypeMethodParser.java
@@ -47,7 +47,7 @@
         types.addAll(Arrays.asList(getNode().getTypeSystem().getPrimitiveTypeMirrors()));
         types.add(getContext().getType(void.class));
 
-        ParameterSpec returnTypeSpec = new ParameterSpec("executedValue", types.toArray(new TypeMirror[types.size()]), getNode().getTypeSystem().getGenericType(), false, Cardinality.ONE);
+        ParameterSpec returnTypeSpec = new ParameterSpec("executedValue", types.toArray(new TypeMirror[types.size()]), false, Cardinality.ONE);
 
         List<ParameterSpec> parameters = new ArrayList<>();
         parameters.add(new ParameterSpec("frame", getContext().getTruffleTypes().getFrame(), true));
