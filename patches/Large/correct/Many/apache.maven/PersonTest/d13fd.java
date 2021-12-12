diff --git a/maven-core-integration-tests/src/test/resources/it0000/src/test/java/org/apache/maven/it0000/PersonTest.java b/maven-core-integration-tests/src/test/resources/it0000/src/test/java/org/apache/maven/it0000/PersonTest.java
index 69f1a6c..354f917 100644
--- a/maven-core-integration-tests/src/test/resources/it0000/src/test/java/org/apache/maven/it0000/PersonTest.java
+++ b/maven-core-integration-tests/src/test/resources/it0000/src/test/java/org/apache/maven/it0000/PersonTest.java
@@ -7,7 +7,7 @@
 {
     public void testPerson()
     {
-        IT0000Person person = new IT0000Person();
+        Person person = new Person();
         
         person.setName( "foo" );
         
