diff --git a/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java
index 4e24bc5..d2cf7c7 100644
--- a/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java
+++ b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java
@@ -157,7 +157,7 @@
     static boolean isRegistered(final Object lhs, final Object rhs) {
         final Set<Pair<IDKey, IDKey>> registry = getRegistry();
         final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
-        final Pair<IDKey, IDKey> swappedPair = Pair.of(pair.getLeft(), pair.getRight());
+        final Pair<IDKey, IDKey> swappedPair = Pair.of(pair.getRight(), pair.getLeft());
 
         return registry != null
                 && (registry.contains(pair) || registry.contains(swappedPair));
