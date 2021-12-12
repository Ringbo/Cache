diff --git a/hibernate-core/src/test/java/org/hibernate/test/readonly/ReadOnlyCriteriaQueryTest.java b/hibernate-core/src/test/java/org/hibernate/test/readonly/ReadOnlyCriteriaQueryTest.java
index f66d46f..45c320a 100755
--- a/hibernate-core/src/test/java/org/hibernate/test/readonly/ReadOnlyCriteriaQueryTest.java
+++ b/hibernate-core/src/test/java/org/hibernate/test/readonly/ReadOnlyCriteriaQueryTest.java
@@ -1143,7 +1143,7 @@
 			assertEquals( list.size(), 2 );
 
 			Enrolment e = ( Enrolment ) list.get( 0 );
-			if ( e.getStudent().getStudentNumber() == xam.getStudentNumber() ) {
+			if ( e.getStudent().getStudentNumber() == gavin.getStudentNumber() ) {
 				enrolment1 = e;
 				enrolment2 = ( Enrolment ) list.get( 1 );
 			}
@@ -1181,7 +1181,7 @@
 			assertEquals( list.size(), 2 );
 
 			e = ( Enrolment ) list.get( 0 );
-			if ( e.getStudent().getStudentNumber() == xam.getStudentNumber() ) {
+			if ( e.getStudent().getStudentNumber() == gavin.getStudentNumber() ) {
 				enrolment1 = e;
 				enrolment2 = ( Enrolment ) list.get( 1 );
 			}
@@ -1218,7 +1218,7 @@
 			assertEquals( list.size(), 2 );
 
 			e = ( Enrolment ) list.get( 0 );
-			if ( e.getStudent().getStudentNumber() == xam.getStudentNumber() ) {
+			if ( e.getStudent().getStudentNumber() == gavin.getStudentNumber() ) {
 				enrolment1 = e;
 				enrolment2 = ( Enrolment ) list.get( 1 );
 			}
