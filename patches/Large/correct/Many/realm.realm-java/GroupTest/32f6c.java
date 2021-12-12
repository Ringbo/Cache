diff --git a/tightdb-java-test/src/test/java/com/tightdb/lib/GroupTest.java b/tightdb-java-test/src/test/java/com/tightdb/lib/GroupTest.java
index 56ce5b9..265ba47 100644
--- a/tightdb-java-test/src/test/java/com/tightdb/lib/GroupTest.java
+++ b/tightdb-java-test/src/test/java/com/tightdb/lib/GroupTest.java
@@ -70,9 +70,9 @@
 		
 		// check table info retrieval
 		assertEquals(1, group.getTableCount());
-		assertEquals(TestEmployeeTable.class.getCanonicalName(),
+		assertEquals(TestEmployeeTable.class.getSimpleName(),
 				group.getTableName(0));
-		assertTrue(group.hasTable(TestEmployeeTable.class.getCanonicalName()));
+		assertTrue(group.hasTable(TestEmployeeTable.class.getSimpleName()));
 		assertFalse(group.hasTable("xxxxxx"));
 
 		// check table retrieval
