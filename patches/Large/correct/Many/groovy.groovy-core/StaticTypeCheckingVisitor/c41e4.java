diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index d1f6112..231a00d 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -2577,7 +2577,7 @@
                 // not in a closure
                 ClassNode parent = receiver;
                 while (parent instanceof InnerClassNode && !parent.isStaticClass()) {
-                    parent = receiver.getOuterClass();
+                    parent = parent.getOuterClass();
                     methods.addAll(parent.getMethods(name));
                 }
             }
