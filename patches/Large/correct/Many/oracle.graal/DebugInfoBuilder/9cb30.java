diff --git a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/gen/DebugInfoBuilder.java b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/gen/DebugInfoBuilder.java
index 638ab48..6fda173 100644
--- a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/gen/DebugInfoBuilder.java
+++ b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/gen/DebugInfoBuilder.java
@@ -53,7 +53,6 @@
         FrameState current = topState;
         do {
             for (EscapeObjectState state : current.virtualObjectMappings()) {
-                // null states occur for objects with 0 fields
                 if (objectStates == null) {
                     objectStates = new IdentityHashMap<>();
                 }
@@ -146,7 +145,8 @@
         if (value instanceof VirtualObjectNode) {
             VirtualObjectNode obj = (VirtualObjectNode) value;
             EscapeObjectState state = objectStates.get(obj);
-            if (state == null) {
+            if (state == null && obj.fieldsCount() > 0) {
+                // null states occur for objects with 0 fields
                 throw new GraalInternalError("no mapping found for virtual object %s", obj);
             }
             if (state instanceof MaterializedObjectState) {
