diff --git a/dex-translator/src/main/java/com/googlecode/dex2jar/v3/LocalCurrect.java b/dex-translator/src/main/java/com/googlecode/dex2jar/v3/LocalCurrect.java
index ed23f8e..4da6af8 100644
--- a/dex-translator/src/main/java/com/googlecode/dex2jar/v3/LocalCurrect.java
+++ b/dex-translator/src/main/java/com/googlecode/dex2jar/v3/LocalCurrect.java
@@ -95,7 +95,7 @@
         Type t2 = LocalType.type(e2.op1.value);
         if (t2 == null && e2.op1.value.vt == VT.ARRAY) {
             Type t3 = detectArray((E2Expr) e2.op1.value);
-            if (t3 != null && t3.getSize() == Type.ARRAY) {
+            if (t3 != null && t3.getSort() == Type.ARRAY) {
                 Type t4 = Type.getType(t3.getDescriptor().substring(1));
                 LocalType.type(e2, t4);
                 return t4;
