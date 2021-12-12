diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java
index 9e14dac..b74b1d2 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/calls/autocasts/DataFlowInfo.java
@@ -109,7 +109,7 @@
 
         boolean changed = false;
         changed |= putNullability(builder, a, nullabilityOfA.refine(nullabilityOfB));
-        changed |= putNullability(builder, b, nullabilityOfA.refine(nullabilityOfA));
+        changed |= putNullability(builder, b, nullabilityOfB.refine(nullabilityOfA));
         return changed ? new DataFlowInfo(ImmutableMap.copyOf(builder), typeInfo) : this;
     }
 
