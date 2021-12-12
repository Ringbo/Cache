diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/DoFnInvokers.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/DoFnInvokers.java
index f622015..edc1dc0 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/DoFnInvokers.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/DoFnInvokers.java
@@ -397,7 +397,7 @@
     private Object describeType(Type type) {
       switch (type.getSort()) {
         case Type.OBJECT:
-          return type.getDescriptor();
+          return type.getInternalName();
         case Type.INT:
         case Type.BYTE:
         case Type.BOOLEAN:
