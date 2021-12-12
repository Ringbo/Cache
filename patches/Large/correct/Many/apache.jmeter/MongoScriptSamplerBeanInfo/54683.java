diff --git a/src/protocol/mongodb/org/apache/jmeter/protocol/mongodb/sampler/MongoScriptSamplerBeanInfo.java b/src/protocol/mongodb/org/apache/jmeter/protocol/mongodb/sampler/MongoScriptSamplerBeanInfo.java
index 0bc37d5..353801c 100644
--- a/src/protocol/mongodb/org/apache/jmeter/protocol/mongodb/sampler/MongoScriptSamplerBeanInfo.java
+++ b/src/protocol/mongodb/org/apache/jmeter/protocol/mongodb/sampler/MongoScriptSamplerBeanInfo.java
@@ -59,11 +59,11 @@
         p.setValue(NOT_UNDEFINED, Boolean.TRUE);
         p.setValue(DEFAULT, "");
 
-        p = property("script");
+        p = property("script", TypeEditor.TextAreaEditor);
         p.setValue(NOT_UNDEFINED, Boolean.FALSE);
         p.setValue(DEFAULT, "");
         p.setValue(NOT_EXPRESSION, Boolean.TRUE);
-        p.setPropertyEditorClass(TextAreaEditor.class);
+        p.setValue(TEXT_LANGUAGE, "javascript");  // $NON-NLS-1$
 
         if(log.isDebugEnabled()) {
             for (PropertyDescriptor pd : getPropertyDescriptors()) {
