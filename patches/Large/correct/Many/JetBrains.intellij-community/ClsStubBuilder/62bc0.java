diff --git a/source/com/intellij/psi/impl/compiled/ClsStubBuilder.java b/source/com/intellij/psi/impl/compiled/ClsStubBuilder.java
index 7e6e30e..6e702a1 100644
--- a/source/com/intellij/psi/impl/compiled/ClsStubBuilder.java
+++ b/source/com/intellij/psi/impl/compiled/ClsStubBuilder.java
@@ -545,7 +545,7 @@
     if (value == null) return null;
 
     if (value instanceof String) return "\"" + StringUtil.escapeStringCharacters((String)value) + "\"";
-    if (value instanceof Integer) return value.toString();
+    if (value instanceof Integer || value instanceof Boolean) return value.toString();
     if (value instanceof Long) return value.toString() + "L";
 
     if (value instanceof Double) {
