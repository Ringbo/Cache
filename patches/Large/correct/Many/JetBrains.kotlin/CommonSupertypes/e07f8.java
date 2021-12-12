diff --git a/compiler/frontend/src/org/jetbrains/kotlin/types/CommonSupertypes.java b/compiler/frontend/src/org/jetbrains/kotlin/types/CommonSupertypes.java
index f26c0ae..8d783dd 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/types/CommonSupertypes.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/types/CommonSupertypes.java
@@ -214,7 +214,7 @@
         assert order != null;
 
         Set<TypeConstructor> notSource = new HashSet<>();
-        Map<TypeConstructor, Set<SimpleType>> result = new HashMap<>();
+        Map<TypeConstructor, Set<SimpleType>> result = new LinkedHashMap<>();
         for (TypeConstructor superConstructor : order) {
             if (!commonSuperclasses.contains(superConstructor)) {
                 continue;
@@ -381,7 +381,7 @@
                     @Override
                     public boolean beforeChildren(SimpleType current) {
                         Set<SimpleType> instances =
-                                constructorToAllInstances.computeIfAbsent(current.getConstructor(), k -> new HashSet<>());
+                                constructorToAllInstances.computeIfAbsent(current.getConstructor(), k -> new LinkedHashSet<>());
                         instances.add(current);
 
                         return true;
