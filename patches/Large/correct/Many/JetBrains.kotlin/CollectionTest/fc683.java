diff --git a/libraries/kotlin-java/src/test/java/test/kotlin/jtests/CollectionTest.java b/libraries/kotlin-java/src/test/java/test/kotlin/jtests/CollectionTest.java
index f2f80bf..3530409 100644
--- a/libraries/kotlin-java/src/test/java/test/kotlin/jtests/CollectionTest.java
+++ b/libraries/kotlin-java/src/test/java/test/kotlin/jtests/CollectionTest.java
@@ -17,7 +17,7 @@
     public void testCollections() throws Exception {
         List<String> list = arrayList("foo", "bar");
 
-        String text = join(list, ",", "(", ")");
+        String text = makeString(list, ",", "(", ")");
         System.out.println("Have text: " + text);
         assertEquals("(foo,bar)", text);
 
@@ -29,6 +29,6 @@
         });
 
         System.out.println("Filtered list is " + actual);
-        assertEquals("(bar)", join(actual, ",", "(", ")"));
+        assertEquals("(bar)", makeString(actual, ",", "(", ")"));
     }
 }
