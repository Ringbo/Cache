diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java
index 10679ff..f65ebf2 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DelegatedPropertyResolver.java
@@ -217,7 +217,7 @@
             JetPropertyDelegate delegate = property.getDelegate();
             if (delegate != null) {
                 PsiElement byKeyword = delegate.getByKeywordNode().getPsi();
-                symbolUsageValidator.validateCall(resultingCall.getResultingDescriptor(), trace, byKeyword);
+                symbolUsageValidator.validateCall(resultingCall, resultingCall.getResultingDescriptor(), trace, byKeyword);
             }
         }
         trace.record(DELEGATED_PROPERTY_RESOLVED_CALL, accessor, resultingCall);
