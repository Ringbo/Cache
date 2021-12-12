diff --git a/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/MetaUtil.java b/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/MetaUtil.java
index 091f116..68352ae 100644
--- a/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/MetaUtil.java
+++ b/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/MetaUtil.java
@@ -70,7 +70,7 @@
         ResolvedJavaType elementalType = getElementalType(type);
         Class elementalClass;
         if (elementalType.isPrimitive()) {
-            elementalClass = type.getKind().toJavaClass();
+            elementalClass = elementalType.getKind().toJavaClass();
         } else {
             try {
                 elementalClass = Class.forName(toJavaName(elementalType), true, loader);
