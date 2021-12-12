diff --git a/controller-client/src/main/java/org/jboss/as/controller/client/helpers/domain/impl/DomainClientImpl.java b/controller-client/src/main/java/org/jboss/as/controller/client/helpers/domain/impl/DomainClientImpl.java
index 5f7bf4c..ac536a1 100644
--- a/controller-client/src/main/java/org/jboss/as/controller/client/helpers/domain/impl/DomainClientImpl.java
+++ b/controller-client/src/main/java/org/jboss/as/controller/client/helpers/domain/impl/DomainClientImpl.java
@@ -138,7 +138,7 @@
         ModelNode op = new ModelNode();
         op.get("operation").set("read-children-names");
         op.get("child-type").set("server-config");
-        op.get("address").set("host", host);
+        op.get("address").add("host", host);
         ModelNode result = executeForResult(OperationBuilder.Factory.create(op).build());
         Set<String> servers = new HashSet<String>();
         for (ModelNode server : result.asList()) {
