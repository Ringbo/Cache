diff --git a/hazelcast/src/main/java/com/hazelcast/map/MapPortableHook.java b/hazelcast/src/main/java/com/hazelcast/map/MapPortableHook.java
index 946dd59..f4d2d2f 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/MapPortableHook.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/MapPortableHook.java
@@ -128,7 +128,7 @@
 
     public PortableFactory createFactory() {
         return new PortableFactory() {
-            final ConstructorFunction<Integer, Portable>[] constructors = new ConstructorFunction[EVICT_ALL + 1];
+            final ConstructorFunction<Integer, Portable>[] constructors = new ConstructorFunction[IS_EMPTY + 1];
 
             {
                 constructors[GET] = new ConstructorFunction<Integer, Portable>() {
