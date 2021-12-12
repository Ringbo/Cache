diff --git a/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/TypeClassInitializer.java b/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/TypeClassInitializer.java
index bb69600..1c3dced 100644
--- a/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/TypeClassInitializer.java
+++ b/rt/databinding/jaxb/src/main/java/org/apache/cxf/endpoint/dynamic/TypeClassInitializer.java
@@ -65,7 +65,7 @@
     @Override
     public void begin(MessagePartInfo part) {
         OperationInfo op = part.getMessageInfo().getOperation();
-        if (!allowWrapperOperations && op.isUnwrappedCapable() && !op.isUnwrapped()) {
+        if (!isFault && !allowWrapperOperations && op.isUnwrappedCapable() && !op.isUnwrapped()) {
             return;
         }
         
