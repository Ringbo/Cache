diff --git a/tools/corba/src/main/java/org/apache/cxf/tools/corba/processors/idl/TypesUtils.java b/tools/corba/src/main/java/org/apache/cxf/tools/corba/processors/idl/TypesUtils.java
index a10a7f2..01e4a18 100644
--- a/tools/corba/src/main/java/org/apache/cxf/tools/corba/processors/idl/TypesUtils.java
+++ b/tools/corba/src/main/java/org/apache/cxf/tools/corba/processors/idl/TypesUtils.java
@@ -109,7 +109,7 @@
             if (corbaType instanceof Const) {
                 Const corbaConst = (Const) corbaType;
                 String name = corbaConst.getQName().getLocalPart();
-                if (name.equals(node.getText())) {
+                if (name.endsWith(node.getText())) {
                     return corbaConst.getValue();
                 }
             }             
