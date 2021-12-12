diff --git a/library/src/test/java/com/orm/util/ReflectionUtilTest.java b/library/src/test/java/com/orm/util/ReflectionUtilTest.java
index 18123b8..5d0dd12 100644
--- a/library/src/test/java/com/orm/util/ReflectionUtilTest.java
+++ b/library/src/test/java/com/orm/util/ReflectionUtilTest.java
@@ -72,7 +72,7 @@
     @Test
     public void testGetAllClasses() {
         List<Class> classes = ReflectionUtil.getDomainClasses();
-        Assert.assertEquals(40, classes.size());
+        Assert.assertEquals(41, classes.size());
     }
 
     @Test(expected = NoSuchFieldException.class)
