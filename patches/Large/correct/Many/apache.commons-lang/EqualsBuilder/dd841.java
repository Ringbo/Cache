diff --git a/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java
index 156106a..3e41469 100644
--- a/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java
+++ b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java
@@ -175,7 +175,7 @@
      * @param rhs the other object to register
      */
     static void register(Object lhs, Object rhs) {
-        synchronized (HashCodeBuilder.class) {
+        synchronized (EqualsBuilder.class) {
             if (getRegistry() == null) {
                 REGISTRY.set(new HashSet<Pair<IDKey, IDKey>>());
             }
@@ -203,7 +203,7 @@
         if (registry != null) {
             Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
             registry.remove(pair);
-            synchronized (HashCodeBuilder.class) {
+            synchronized (EqualsBuilder.class) {
                 //read again
                 registry = getRegistry();
                 if (registry != null && registry.isEmpty()) {
