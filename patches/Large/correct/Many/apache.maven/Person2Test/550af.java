diff --git a/maven-core-integration-tests/src/test/resources/it0039/project2/src/test/java/org/apache/maven/it0039/Person2Test.java b/maven-core-integration-tests/src/test/resources/it0039/project2/src/test/java/org/apache/maven/it0039/Person2Test.java
index cce3404..2fd5181 100644
--- a/maven-core-integration-tests/src/test/resources/it0039/project2/src/test/java/org/apache/maven/it0039/Person2Test.java
+++ b/maven-core-integration-tests/src/test/resources/it0039/project2/src/test/java/org/apache/maven/it0039/Person2Test.java
@@ -1,4 +1,4 @@
-package it0039.project2.src.test.java.org.apache.maven.it0039;
+package org.apache.maven.it0039;
 
 import junit.framework.TestCase;
 
@@ -7,7 +7,7 @@
 {
     public void testPerson()
     {
-        Person person = new Person();
+        Person2 person = new Person2();
 
         person.setName( "foo" );
 
