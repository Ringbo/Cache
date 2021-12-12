diff --git a/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java b/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java
index a09d4bb..25d8160 100644
--- a/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java
+++ b/liquibase-core/src/test/java/liquibase/util/SpringBootFatJarTest.java
@@ -8,13 +8,13 @@
     @Test
     public void testGetPathForResourceWithTwoBangs() {
         String result = SpringBootFatJar.getPathForResource("some/path!/that/has!/two/bangs");
-        assertEquals(result, "that/has/two/bangs");
+        assertEquals("that/has/two/bangs", result);
     }
 
     @Test
     public void testGetPathForResourceWithOneBang() {
         String result = SpringBootFatJar.getPathForResource("some/path!/that/has/one/bang");
-        assertEquals(result, "that/has/one/bang");
+        assertEquals("that/has/one/bang", result);
     }
 
     @Test
