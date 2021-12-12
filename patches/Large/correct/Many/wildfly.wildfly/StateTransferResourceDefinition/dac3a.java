diff --git a/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/StateTransferResourceDefinition.java b/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/StateTransferResourceDefinition.java
index 0af1e8c..72c5c67 100644
--- a/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/StateTransferResourceDefinition.java
+++ b/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/StateTransferResourceDefinition.java
@@ -53,7 +53,7 @@
     static final PathElement PATH = pathElement("state-transfer");
 
     enum Attribute implements org.jboss.as.clustering.controller.Attribute {
-        CHUNK_SIZE("chunk-size", ModelType.INT, new ModelNode(10000)),
+        CHUNK_SIZE("chunk-size", ModelType.INT, new ModelNode(512)),
         TIMEOUT("timeout", ModelType.LONG, new ModelNode(TimeUnit.MINUTES.toMillis(4))),
         ;
         private final AttributeDefinition definition;
@@ -98,7 +98,10 @@
         ResourceTransformationDescriptionBuilder builder = InfinispanModel.VERSION_4_0_0.requiresTransformation(version) ? parent.addChildRedirection(PATH, LEGACY_PATH) : parent.addChildResource(PATH);
 
         if (InfinispanModel.VERSION_4_0_0.requiresTransformation(version)) {
-            builder.getAttributeBuilder().setValueConverter(new AttributeConverter.DefaultValueAttributeConverter(Attribute.TIMEOUT.getDefinition()), Attribute.TIMEOUT.getDefinition());
+            builder.getAttributeBuilder()
+                    .setValueConverter(new AttributeConverter.DefaultValueAttributeConverter(Attribute.TIMEOUT.getDefinition()), Attribute.TIMEOUT.getDefinition())
+                    .setValueConverter(new AttributeConverter.DefaultValueAttributeConverter(Attribute.CHUNK_SIZE.getDefinition()), Attribute.CHUNK_SIZE.getDefinition())
+            ;
         }
     }
 
