diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverridingUtil.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverridingUtil.java
index c91957f..ec6a001 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverridingUtil.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/OverridingUtil.java
@@ -289,7 +289,7 @@
         }
         else {
             if (descriptor.getOverriddenDescriptors().isEmpty()) {
-                throw new IllegalStateException();
+                throw new IllegalStateException("No overridden descriptors found for (fake override) " + descriptor);
             }
             for (CallableMemberDescriptor overridden : descriptor.getOverriddenDescriptors()) {
                 getOverriddenDeclarations(overridden, r);
