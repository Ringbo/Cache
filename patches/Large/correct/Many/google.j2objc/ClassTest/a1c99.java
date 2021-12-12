diff --git a/jre_emul/apache_harmony/classlib/modules/luni/src/test/api/common/org/apache/harmony/luni/tests/java/lang/ClassTest.java b/jre_emul/apache_harmony/classlib/modules/luni/src/test/api/common/org/apache/harmony/luni/tests/java/lang/ClassTest.java
index 0fe4924..da3b237 100644
--- a/jre_emul/apache_harmony/classlib/modules/luni/src/test/api/common/org/apache/harmony/luni/tests/java/lang/ClassTest.java
+++ b/jre_emul/apache_harmony/classlib/modules/luni/src/test/api/common/org/apache/harmony/luni/tests/java/lang/ClassTest.java
@@ -154,7 +154,7 @@
     /**
      * @tests java.lang.Class#getClasses()
      */
-    /* TODO(tball): enable if Class.getClasses is mapped.
+    /* TODO(tball): enable if SecurityManager is implemented.
     public void test_getClasses_subtest0() {
         final Permission privCheckPermission = new BasicPermission("Privilege check") {
             private static final long serialVersionUID = 1L;
@@ -462,10 +462,10 @@
      */
     public void test_getFields() throws Exception {
         Field[] f = TestClass.class.getFields();
-        assertEquals("Incorrect number of fields", 4, f.length);
+        assertEquals("Incorrect number of fields", 2, f.length);
         f = SubTestClass.class.getFields();
         // Check inheritance of pub fields
-        assertEquals("Incorrect number of fields", 4, f.length);
+        assertEquals("Incorrect number of fields", 2, f.length);
     }
 
     /**
@@ -624,7 +624,7 @@
         Class<?> clazz = null;
         clazz = Class.forName("[I");
         assertEquals("Class toString printed wrong value",
-                     "class int[]", clazz.toString());
+                     "class [I", clazz.toString());
 
         clazz = Class.forName("java.lang.Object");
         assertEquals("Class toString printed wrong value",
@@ -632,6 +632,6 @@
 
         clazz = Class.forName("[Ljava.lang.Object;");
         assertEquals("Class toString printed wrong value",
-                     "class java.lang.Object[]", clazz.toString());
+                     "class [Ljava.lang.Object;", clazz.toString());
     }
 }
