diff --git a/streams/src/test/java/org/apache/kafka/streams/kstream/internals/KTableImplTest.java b/streams/src/test/java/org/apache/kafka/streams/kstream/internals/KTableImplTest.java
index 399e519..0b9c1ab 100644
--- a/streams/src/test/java/org/apache/kafka/streams/kstream/internals/KTableImplTest.java
+++ b/streams/src/test/java/org/apache/kafka/streams/kstream/internals/KTableImplTest.java
@@ -472,7 +472,7 @@
 
     @Test(expected = NullPointerException.class)
     public void shouldThrowNullPointerOnOuterJoinWhenMaterializedIsNull() {
-        table.leftJoin(table, MockValueJoiner.TOSTRING_JOINER, (Materialized) null);
+        table.outerJoin(table, MockValueJoiner.TOSTRING_JOINER, (Materialized) null);
     }
 
     @Test(expected = NullPointerException.class)
