diff --git a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LayoutImpl.java b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LayoutImpl.java
index aaa523e..1798dfa 100644
--- a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LayoutImpl.java
+++ b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/LayoutImpl.java
@@ -135,7 +135,7 @@
             newLocation = oldLocation;
         } else if (oldLocation instanceof DoubleLocation && (value instanceof Double || this.isAllowedIntToDouble() && value instanceof Integer)) {
             newLocation = oldLocation;
-        } else if (oldLocation instanceof LongLocation && (value instanceof Long || this.isAllowedIntToLong() && value instanceof Long)) {
+        } else if (oldLocation instanceof LongLocation && (value instanceof Long || this.isAllowedIntToLong() && value instanceof Integer)) {
             newLocation = oldLocation;
         } else if (oldLocation instanceof DeclaredLocation) {
             return oldShape.allocator().locationForValue(value, EnumSet.of(LocationModifier.Final, LocationModifier.NonNull));
