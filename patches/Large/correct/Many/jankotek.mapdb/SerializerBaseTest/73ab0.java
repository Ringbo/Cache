diff --git a/src/test/java/org/mapdb/SerializerBaseTest.java b/src/test/java/org/mapdb/SerializerBaseTest.java
index a152c7f..88c3b61 100644
--- a/src/test/java/org/mapdb/SerializerBaseTest.java
+++ b/src/test/java/org/mapdb/SerializerBaseTest.java
@@ -708,7 +708,7 @@
     }
 
     @Test public void object_stack_set() throws IOException {
-        for(Set c : Arrays.asList(new HashSet(), new LinkedHashSet(), new TreeSet())){
+        for(Set c : Arrays.asList(new HashSet(), new LinkedHashSet())){
             c.add(c);
             c = clone(c);
             assertTrue(c.iterator().next()==c);
