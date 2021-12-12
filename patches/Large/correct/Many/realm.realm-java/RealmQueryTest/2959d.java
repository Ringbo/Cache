diff --git a/realm/realm-library/src/androidTest/java/io/realm/RealmQueryTest.java b/realm/realm-library/src/androidTest/java/io/realm/RealmQueryTest.java
index b87e886..399f111 100644
--- a/realm/realm-library/src/androidTest/java/io/realm/RealmQueryTest.java
+++ b/realm/realm-library/src/androidTest/java/io/realm/RealmQueryTest.java
@@ -1094,8 +1094,7 @@
         TestHelper.populateAllNonNullRowsForNumericTesting(testRealm);
         RealmQuery<NullTypes> query = testRealm.where(NullTypes.class);
 
-        // TODO update expected value after core's fix
-        assertEquals(43.0 /* should be 2.0 */, query.average(NullTypes.FIELD_INTEGER_NULL), 0d);
+        assertEquals(2.0, query.average(NullTypes.FIELD_INTEGER_NULL), 0d);
         assertEquals(7.0 / 3, query.average(NullTypes.FIELD_FLOAT_NULL), 0.001d);
         assertEquals(8.0 / 3, query.average(NullTypes.FIELD_DOUBLE_NULL), 0.001d);
     }
@@ -1106,7 +1105,7 @@
         RealmQuery<NullTypes> query = testRealm.where(NullTypes.class);
 
         // TODO update expected values after core's fix
-        assertEquals(11.0/* should be 3.5 */, query.average(NullTypes.FIELD_INTEGER_NULL), 0d);
+        assertEquals((7/(double)3) /* should be 3.5 */, query.average(NullTypes.FIELD_INTEGER_NULL), 0d);
         assertEquals(3.0 /* should be 4.5 */, query.average(NullTypes.FIELD_FLOAT_NULL), 0f);
         assertEquals(3.666 /* should be 5.5 */, query.average(NullTypes.FIELD_DOUBLE_NULL), 0.001d);
     }
