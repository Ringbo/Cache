diff --git a/hazelcast/src/main/java/com/hazelcast/internal/serialization/impl/PortableUtils.java b/hazelcast/src/main/java/com/hazelcast/internal/serialization/impl/PortableUtils.java
index 42818f8..131a29c 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/serialization/impl/PortableUtils.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/serialization/impl/PortableUtils.java
@@ -44,9 +44,9 @@
     static int validateAndGetArrayQuantifierFromCurrentToken(String token, String fullPath) {
         String quantifier = extractArgumentsFromAttributeName(token);
         if (quantifier == null) {
-            throw new IllegalArgumentException("Malformed quantifier " + quantifier + " in " + fullPath);
+            throw new IllegalArgumentException("Malformed quantifier in " + fullPath);
         }
-        int index = Integer.valueOf(quantifier);
+        int index = Integer.parseInt(quantifier);
         if (index < 0) {
             throw new IllegalArgumentException("Array index " + index + " cannot be negative in " + fullPath);
         }
