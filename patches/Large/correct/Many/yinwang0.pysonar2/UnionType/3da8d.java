diff --git a/src/main/java/org/yinwang/pysonar/types/UnionType.java b/src/main/java/org/yinwang/pysonar/types/UnionType.java
index cc5c08b..903aafb 100644
--- a/src/main/java/org/yinwang/pysonar/types/UnionType.java
+++ b/src/main/java/org/yinwang/pysonar/types/UnionType.java
@@ -95,9 +95,9 @@
     public static Type union(@NotNull Type u, @NotNull Type v) {
         if (u.equals(v)) {
             return u;
-        } else if (u.isUnknownType()) {
+        } else if (u.isUnknownType() || u == Indexer.idx.builtins.None) {
             return v;
-        } else if (v.isUnknownType()) {
+        } else if (v.isUnknownType() || v == Indexer.idx.builtins.None) {
             return u;
         } else {
             return new UnionType(u, v);
