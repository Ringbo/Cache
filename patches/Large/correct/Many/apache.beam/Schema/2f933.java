diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/schemas/Schema.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/schemas/Schema.java
index a923c0e..d256b32 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/schemas/Schema.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/schemas/Schema.java
@@ -228,7 +228,8 @@
     return true;
   }
 
-  enum EquivalenceNullablePolicy {
+  /** Control whether nullable is included in equivalence check. */
+  public enum EquivalenceNullablePolicy {
     SAME,
     WEAKEN,
     IGNORE
@@ -581,7 +582,8 @@
       return true;
     }
 
-    private boolean equivalent(FieldType other, EquivalenceNullablePolicy nullablePolicy) {
+    /** Check whether two types are equivalent. */
+    public boolean equivalent(FieldType other, EquivalenceNullablePolicy nullablePolicy) {
       if (nullablePolicy == EquivalenceNullablePolicy.SAME
           && !other.getNullable().equals(getNullable())) {
         return false;
