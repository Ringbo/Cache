diff --git a/src/main/java/com/alibaba/druid/sql/visitor/SchemaStatVisitor.java b/src/main/java/com/alibaba/druid/sql/visitor/SchemaStatVisitor.java
index fdb88d4..bc06fee 100644
--- a/src/main/java/com/alibaba/druid/sql/visitor/SchemaStatVisitor.java
+++ b/src/main/java/com/alibaba/druid/sql/visitor/SchemaStatVisitor.java
@@ -967,7 +967,7 @@
             return false;
         }
 
-        if ("LEVEL".equalsIgnoreCase(ident)) {
+        if ("LEVEL".equalsIgnoreCase(ident) || "CONNECT_BY_ISCYCLE".equalsIgnoreCase(ident)) {
             SQLObject parent = x.getParent();
             if (parent instanceof SQLSelectItem) {
                 SQLObject parent2 = parent.getParent();
