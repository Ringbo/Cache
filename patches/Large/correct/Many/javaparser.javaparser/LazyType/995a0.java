diff --git a/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/model/typesystem/LazyType.java b/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/model/typesystem/LazyType.java
index a7d05d1..44dbdec 100644
--- a/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/model/typesystem/LazyType.java
+++ b/javaparser-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/model/typesystem/LazyType.java
@@ -64,7 +64,7 @@
 
     @Override
     public boolean isWildcard() {
-        return getType().isArray();
+        return getType().isWildcard();
     }
 
     @Override
