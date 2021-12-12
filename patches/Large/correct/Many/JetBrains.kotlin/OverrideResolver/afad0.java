diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverrideResolver.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverrideResolver.java
index a59a66a..dfd60ff 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverrideResolver.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverrideResolver.java
@@ -261,7 +261,7 @@
 
                     if (checkPropertyKind(overridden, true) && checkPropertyKind(declared, false) && !kindMismatchError) {
                         context.getTrace().report(VAR_OVERRIDDEN_BY_VAL.on(member, ((JetProperty) member).getValOrVarNode(), (PropertyDescriptor) declared, (PropertyDescriptor) overridden));
-                        typeMismatchError = true;
+                        kindMismatchError = true;
                     }
                 }
             }
