diff --git a/library/src/test/java/com/orm/util/ReflectionUtilTest.java b/library/src/test/java/com/orm/util/ReflectionUtilTest.java
index 12738be..a93e059 100644
--- a/library/src/test/java/com/orm/util/ReflectionUtilTest.java
+++ b/library/src/test/java/com/orm/util/ReflectionUtilTest.java
@@ -74,7 +74,7 @@
     @Test
     public void testGetAllClasses() {
         List<Class> classes = ReflectionUtil.getDomainClasses();
-        Assert.assertEquals(45, classes.size());
+        Assert.assertEquals(46, classes.size());
     }
 
     @Test(expected = NoSuchFieldException.class)
