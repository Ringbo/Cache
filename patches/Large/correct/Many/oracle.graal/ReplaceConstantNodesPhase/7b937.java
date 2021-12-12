diff --git a/compiler/src/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/phases/aot/ReplaceConstantNodesPhase.java b/compiler/src/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/phases/aot/ReplaceConstantNodesPhase.java
index db0dc75..2223e35 100644
--- a/compiler/src/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/phases/aot/ReplaceConstantNodesPhase.java
+++ b/compiler/src/org.graalvm.compiler.hotspot/src/org/graalvm/compiler/hotspot/phases/aot/ReplaceConstantNodesPhase.java
@@ -129,9 +129,9 @@
             if (type.getElementalType().isPrimitive()) {
                 return false;
             }
-            return ((HotSpotResolvedObjectType) (type.getElementalType())).getFingerprint() == 0;
+            return ((HotSpotResolvedObjectType) (type.getElementalType())).getFingerprint() != 0;
         }
-        return ((HotSpotResolvedObjectType) type).getFingerprint() == 0;
+        return ((HotSpotResolvedObjectType) type).getFingerprint() != 0;
     }
 
     /**
