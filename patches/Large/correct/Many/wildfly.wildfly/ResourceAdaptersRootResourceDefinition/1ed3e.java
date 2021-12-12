diff --git a/connector/src/main/java/org/jboss/as/connector/subsystems/resourceadapters/ResourceAdaptersRootResourceDefinition.java b/connector/src/main/java/org/jboss/as/connector/subsystems/resourceadapters/ResourceAdaptersRootResourceDefinition.java
index f17e77f..8bf5474 100644
--- a/connector/src/main/java/org/jboss/as/connector/subsystems/resourceadapters/ResourceAdaptersRootResourceDefinition.java
+++ b/connector/src/main/java/org/jboss/as/connector/subsystems/resourceadapters/ResourceAdaptersRootResourceDefinition.java
@@ -68,7 +68,7 @@
         TransformationDescription.Tools.register(builder120.build(), subsystem, ModelVersion.create(1, 3, 0));
         ResourceTransformationDescriptionBuilder builder200 = TransformationDescriptionBuilder.Factory.createSubsystemInstance();
         ResourceAdapterResourceDefinition.registerTransformers200(builder200);
-        TransformationDescription.Tools.register(builder120.build(), subsystem, ModelVersion.create(2, 0, 0));
+        TransformationDescription.Tools.register(builder200.build(), subsystem, ModelVersion.create(2, 0, 0));
 
     }
 }
