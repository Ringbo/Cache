diff --git a/src/com/facebook/buck/rules/coercer/CollectionTypeCoercer.java b/src/com/facebook/buck/rules/coercer/CollectionTypeCoercer.java
index 7b43287..669c2c5 100644
--- a/src/com/facebook/buck/rules/coercer/CollectionTypeCoercer.java
+++ b/src/com/facebook/buck/rules/coercer/CollectionTypeCoercer.java
@@ -67,8 +67,11 @@
               buildRuleResolver, filesystem, pathRelativeToProjectRoot, element);
           builder.add(coercedElement);
         } catch (CoerceFailedException e) {
-          CoerceFailedException wrappingException =
-              CoerceFailedException.simple(pathRelativeToProjectRoot, object, getOutputClass());
+          CoerceFailedException wrappingException = CoerceFailedException.simple(
+              pathRelativeToProjectRoot,
+              object,
+              getOutputClass(),
+              e.getMessage());
           wrappingException.initCause(e);
           throw wrappingException;
         }
