diff --git a/controller/src/main/java/org/jboss/as/controller/operations/common/AddNamespaceHandler.java b/controller/src/main/java/org/jboss/as/controller/operations/common/AddNamespaceHandler.java
index 791a788..6de6dc6 100644
--- a/controller/src/main/java/org/jboss/as/controller/operations/common/AddNamespaceHandler.java
+++ b/controller/src/main/java/org/jboss/as/controller/operations/common/AddNamespaceHandler.java
@@ -96,7 +96,7 @@
     private String validate(ModelNode param, ModelNode namespaces) {
         String failure = typeValidator.validateParameter(NAMESPACE, param);
         String name = param.asProperty().getName();
-        if (failure == null && !namespaces.isDefined()) {
+        if (failure == null && namespaces.isDefined()) {
             for (ModelNode node : namespaces.asList()) {
                 if (name.equals(node.asProperty().getName())) {
                     failure = "Namespace with prefix " + name + " already registered with schema URI " + node.asProperty().getValue().asString();
