diff --git a/src/main/org/codehaus/groovy/control/ResolveVisitor.java b/src/main/org/codehaus/groovy/control/ResolveVisitor.java
index 585608b..548ccf8 100644
--- a/src/main/org/codehaus/groovy/control/ResolveVisitor.java
+++ b/src/main/org/codehaus/groovy/control/ResolveVisitor.java
@@ -1131,7 +1131,7 @@
             }
             for (ImportNode importNode : module.getStaticStarImports().values()) {
                 ClassNode type = importNode.getType();
-                if (resolve(type, false, false, true)) continue;
+                if (resolve(type, true, false, true)) continue;
                 // May be this type belongs in the same package as the node that is doing the
                 // static import. In that case, the package may not have been explicitly specified.
                 // Try with the node's package too. If still not found, revert to original type name.
