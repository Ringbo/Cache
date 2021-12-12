diff --git a/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystemRootResource.java b/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystemRootResource.java
index cf0aeae..6895c30 100644
--- a/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystemRootResource.java
+++ b/remoting/src/main/java/org/jboss/as/remoting/RemotingSubsystemRootResource.java
@@ -78,7 +78,7 @@
     }
 
     private static SimpleAttributeDefinition createIntAttribute(String name, Attribute attribute, int defaultValue) {
-        return SimpleAttributeDefinitionBuilder.create(name, ModelType.INT, true).setDefaultValue(new ModelNode().set(defaultValue)).setXmlName(attribute.getLocalName()).setValidator(new IntRangeValidator(1)).build();
+        return SimpleAttributeDefinitionBuilder.create(name, ModelType.INT, true).setDefaultValue(new ModelNode().set(defaultValue)).setXmlName(attribute.getLocalName()).setValidator(new IntRangeValidator(1, true)).build();
     }
 
     private static class ThreadWriteAttributeHandler extends RestartParentWriteAttributeHandler {
