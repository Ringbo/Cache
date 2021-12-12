diff --git a/documentation/src/test/java/org/hibernate/userguide/pc/PersistenceContextTest.java b/documentation/src/test/java/org/hibernate/userguide/pc/PersistenceContextTest.java
index fa566a6..87d7c75 100644
--- a/documentation/src/test/java/org/hibernate/userguide/pc/PersistenceContextTest.java
+++ b/documentation/src/test/java/org/hibernate/userguide/pc/PersistenceContextTest.java
@@ -223,7 +223,7 @@
 			//tag::pc-managed-state-native-example[]
 			Person person = session.byId( Person.class ).load( personId );
 			person.setName("John Doe");
-			entityManager.flush();
+			session.flush();
 			//end::pc-managed-state-native-example[]
 		} );
 
