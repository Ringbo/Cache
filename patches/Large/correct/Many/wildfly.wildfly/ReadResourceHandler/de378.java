diff --git a/controller/src/main/java/org/jboss/as/controller/operations/global/ReadResourceHandler.java b/controller/src/main/java/org/jboss/as/controller/operations/global/ReadResourceHandler.java
index a494143..3d2c0a2 100644
--- a/controller/src/main/java/org/jboss/as/controller/operations/global/ReadResourceHandler.java
+++ b/controller/src/main/java/org/jboss/as/controller/operations/global/ReadResourceHandler.java
@@ -265,7 +265,7 @@
                         // But filter inaccessible children
                         AuthorizationResult ar = context.authorize(rrOp, EnumSet.of(Action.ActionEffect.ADDRESS));
                         if (ar.getDecision() == AuthorizationResult.Decision.DENY) {
-                            filteredData.addAccessRestrictedResource(absoluteChildAddr);
+                            localFilteredData.addAccessRestrictedResource(absoluteChildAddr);
                         } else {
                             ModelNode childMap = directChildren.get(childType);
                             if (childMap == null) {
