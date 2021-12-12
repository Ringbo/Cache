diff --git a/requery-jackson/src/main/java/io/requery/jackson/EntityBeanDeserializer.java b/requery-jackson/src/main/java/io/requery/jackson/EntityBeanDeserializer.java
index 9b398a8..13c9f9c 100644
--- a/requery-jackson/src/main/java/io/requery/jackson/EntityBeanDeserializer.java
+++ b/requery-jackson/src/main/java/io/requery/jackson/EntityBeanDeserializer.java
@@ -103,7 +103,7 @@
             if (method == null) {
                 Class<?> target = getValueType().getRawClass();
                 for (Method m : parentClass.getDeclaredMethods()) {
-                    if (target.isAssignableFrom(m.getReturnType()) && m.getParameters().length == 0) {
+                    if (target.isAssignableFrom(m.getReturnType()) && m.getParameterTypes().length == 0) {
                         embeddedGetters.put(parentClass, m);
                         method = m;
                         break;
