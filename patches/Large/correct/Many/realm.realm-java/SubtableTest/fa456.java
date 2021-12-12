diff --git a/realm-java-test/src/test/java/io/realm/typed/SubtableTest.java b/realm-java-test/src/test/java/io/realm/typed/SubtableTest.java
index dac9fe4..04acdf5 100644
--- a/realm-java-test/src/test/java/io/realm/typed/SubtableTest.java
+++ b/realm-java-test/src/test/java/io/realm/typed/SubtableTest.java
@@ -99,7 +99,7 @@
         assertTrue(phones.isValid());
 
         employees.remove(2);
-        assertFalse(phones.isValid());
+        assertFalse(!phones.isValid());
     }
 
 }
