diff --git a/controller/src/main/java/org/jboss/as/controller/operations/common/AddSchemaLocationHandler.java b/controller/src/main/java/org/jboss/as/controller/operations/common/AddSchemaLocationHandler.java
index 8e5bfa3..2c6f855 100644
--- a/controller/src/main/java/org/jboss/as/controller/operations/common/AddSchemaLocationHandler.java
+++ b/controller/src/main/java/org/jboss/as/controller/operations/common/AddSchemaLocationHandler.java
@@ -96,7 +96,7 @@
     private String validate(ModelNode param, ModelNode locations) {
         String failure = typeValidator.validateParameter(SCHEMA_LOCATION, param);
         String uri = param.asProperty().getName();
-        if (failure == null && !locations.isDefined()) {
+        if (failure == null && locations.isDefined()) {
             for (ModelNode node : locations.asList()) {
                 if (uri.equals(node.asProperty().getName())) {
                     failure = "Schema with URI " + uri + " already registered with location " + node.asProperty().getValue().asString();
