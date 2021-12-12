diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
index 2b46e1a..1042389 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
@@ -437,11 +437,11 @@
             PsiTreeUtil.treeWalkUp(psiClass, null, new PairProcessor<PsiElement, PsiElement>() {
               @Override
               public boolean process(PsiElement element, PsiElement element2) {
-                sb.append(element);
+                sb.append('\n').append(element);
                 return true;
               }
             });
-            LOG.error("Local or anonymous class " + psiClass + " has no non-local parent, parents:" + sb);
+            LOG.info("Local or anonymous class " + psiClass + " has no non-local parent, parents:" + sb);
           }
         }
         else {
