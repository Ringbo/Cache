diff --git a/src/com/google/javascript/jscomp/ImplicitNullabilityCheck.java b/src/com/google/javascript/jscomp/ImplicitNullabilityCheck.java
index 192b2d4..1a9a5c2 100644
--- a/src/com/google/javascript/jscomp/ImplicitNullabilityCheck.java
+++ b/src/com/google/javascript/jscomp/ImplicitNullabilityCheck.java
@@ -75,7 +75,7 @@
               }
             });
 
-    Scope scope = t.getScope();
+    final Scope scope = t.getScope();
     for (Node typeRoot : info.getTypeNodes()) {
       NodeUtil.visitPreOrder(
           typeRoot,
