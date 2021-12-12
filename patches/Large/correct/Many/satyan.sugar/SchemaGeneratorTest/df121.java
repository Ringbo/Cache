diff --git a/library/src/test/java/com/orm/SchemaGeneratorTest.java b/library/src/test/java/com/orm/SchemaGeneratorTest.java
index 90f35c0..811d1aa 100644
--- a/library/src/test/java/com/orm/SchemaGeneratorTest.java
+++ b/library/src/test/java/com/orm/SchemaGeneratorTest.java
@@ -137,7 +137,7 @@
         Cursor c = sqLiteDatabase.rawQuery(sql, null);
 
         if (c.moveToFirst()) {
-            Assert.assertEquals(47, c.getInt(0));
+            Assert.assertEquals(48, c.getInt(0));
         }
 
         if (!c.isClosed()) {
