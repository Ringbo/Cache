diff --git a/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/exps/NewExprent.java b/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/exps/NewExprent.java
index f72e764..2db188f 100644
--- a/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/exps/NewExprent.java
+++ b/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/exps/NewExprent.java
@@ -191,7 +191,7 @@
             buf.append(GenericMain.getGenericCastTypeName(descriptor.superclass));
           }
           else {
-            if (descriptor.superinterfaces.size() > 1) {
+            if (descriptor.superinterfaces.size() > 1 && !lambda) {
               DecompilerContext.getLogger().writeMessage("Inconsistent anonymous class signature: " + child.classStruct.qualifiedName,
                                                          IFernflowerLogger.Severity.WARN);
             }
