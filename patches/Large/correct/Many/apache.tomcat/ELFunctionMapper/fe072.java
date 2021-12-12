diff --git a/java/org/apache/jasper/compiler/ELFunctionMapper.java b/java/org/apache/jasper/compiler/ELFunctionMapper.java
index 6c8b214..a3aba09 100644
--- a/java/org/apache/jasper/compiler/ELFunctionMapper.java
+++ b/java/org/apache/jasper/compiler/ELFunctionMapper.java
@@ -312,7 +312,7 @@
             }
 
             try {
-                clazz = Class.forName(className, true, tccl);
+                clazz = Class.forName(className, false, tccl);
             } catch (ClassNotFoundException e) {
                 throw new JasperException(e);
             }
