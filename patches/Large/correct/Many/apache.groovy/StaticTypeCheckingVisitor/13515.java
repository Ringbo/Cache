diff --git a/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index c28604a..c538352 100644
--- a/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -3255,7 +3255,7 @@
                             storeType(call, returnType);
                             storeTargetMethod(call, directMethodCallCandidate);
                             ClassNode declaringClass = directMethodCallCandidate.getDeclaringClass();
-                            if (declaringClass.isInterface() && directMethodCallCandidate.isStatic()) {
+                            if (declaringClass.isInterface() && directMethodCallCandidate.isStatic() && !(directMethodCallCandidate instanceof ExtensionMethodNode)) {
                                 typeCheckingContext.getEnclosingClassNode().putNodeMetaData(MINIMUM_BYTECODE_VERSION, Opcodes.V1_8);
                             }
                             String data = chosenReceiver.getData();
