diff --git a/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/sql/SelectTest.java b/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/sql/SelectTest.java
index be51aff..5385431 100644
--- a/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/sql/SelectTest.java
+++ b/dbflow/src/androidTest/java/com/raizlabs/android/dbflow/test/sql/SelectTest.java
@@ -52,11 +52,11 @@
 //
         //assertEquals("SELECT * FROM `TestModel32` WHERE `name`='Test'", where5.getQuery().trim());
 
-        Where<TestModel3> where6 = new Select(Method.date(type))
+        Where<TestModel3> where6 = new Select(Method.count(type))
                 .from(TestModel3.class)
                 .orderBy(name, true)
                 .orderBy(type, true);
-        assertEquals("SELECT DATE(`type`)  FROM `TestModel32` ORDER BY `type`, `name` ASC", where6.getQuery().trim());
+        assertEquals("SELECT COUNT(`type`)  FROM `TestModel32` ORDER BY `type`, `name` ASC", where6.getQuery().trim());
     }
 
     public void testJoins() {
