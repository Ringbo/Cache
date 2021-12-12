diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java
index ab56ec1..9e14dac 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java
@@ -181,7 +181,7 @@
 
         ListMultimap<DataFlowValue, JetType> newTypeInfo = Multimaps.newListMultimap(Maps.<DataFlowValue, Collection<JetType>>newHashMap(), CommonSuppliers.<JetType>getArrayListSupplier());
 
-        Set<DataFlowValue> keys = newTypeInfo.keySet();
+        Set<DataFlowValue> keys = typeInfo.keySet();
         keys.retainAll(other.typeInfo.keySet());
 
         for (DataFlowValue key : keys) {
