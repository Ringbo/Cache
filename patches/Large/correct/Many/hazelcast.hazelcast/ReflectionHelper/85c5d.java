diff --git a/hazelcast/src/main/java/com/hazelcast/query/impl/ReflectionHelper.java b/hazelcast/src/main/java/com/hazelcast/query/impl/ReflectionHelper.java
index 22ee8a9..75ea459 100644
--- a/hazelcast/src/main/java/com/hazelcast/query/impl/ReflectionHelper.java
+++ b/hazelcast/src/main/java/com/hazelcast/query/impl/ReflectionHelper.java
@@ -107,7 +107,7 @@
         try {
             Getter parent = null;
             List<String> possibleMethodNames = new ArrayList<String>(INITIAL_CAPACITY);
-            for (final String name : attribute.split("\\.")) {
+            for (final String name : paramAttribute.split("\\.")) {
                 Getter localGetter = null;
                 possibleMethodNames.clear();
                 possibleMethodNames.add(name);
