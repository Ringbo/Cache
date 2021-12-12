diff --git a/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java b/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java
index 7451b4a..9028fd7 100644
--- a/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java
+++ b/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java
@@ -237,7 +237,7 @@
 // null, runtime().config.narrowOopBase, runtime().config.narrowOopShift,
 // runtime().config.logMinObjAlignment));
                 throw GraalInternalError.unimplemented();
-            } else if (runtime().config.useCompressedKlassPointers && kind == Kind.Long) {
+            } else if (runtime().config.useCompressedClassPointers && kind == Kind.Long) {
 // append(new LoadCompressedPointer(kind, result, loadAddress, access != null ? state(access) :
 // null, runtime().config.narrowKlassBase, runtime().config.narrowKlassShift,
 // runtime().config.logKlassAlignment));
@@ -261,7 +261,7 @@
                 if (inputVal.getKind() == Kind.Object) {
                     append(new StoreConstantOp(kind, storeAddress, c, state, runtime().config.useCompressedOops && isCompressCandidate(access)));
                 } else if (inputVal.getKind() == Kind.Long) {
-                    append(new StoreConstantOp(kind, storeAddress, c, state, runtime().config.useCompressedKlassPointers && isCompressCandidate(access)));
+                    append(new StoreConstantOp(kind, storeAddress, c, state, runtime().config.useCompressedClassPointers && isCompressCandidate(access)));
                 } else {
                     append(new StoreConstantOp(kind, storeAddress, c, state, false));
                 }
@@ -281,7 +281,7 @@
 // append(new StoreOp(input.getKind(), storeAddress, input, state));
 // }
                 throw GraalInternalError.unimplemented();
-            } else if (runtime().config.useCompressedKlassPointers && kind == Kind.Long) {
+            } else if (runtime().config.useCompressedClassPointers && kind == Kind.Long) {
 // Variable scratch = newVariable(Kind.Long);
 // append(new StoreCompressedPointer(kind, storeAddress, input, scratch, state,
 // runtime().config.narrowKlassBase, runtime().config.narrowKlassShift,
