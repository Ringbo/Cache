diff --git a/documentation/src/test/java/org/hibernate/userguide/hql/HQLTest.java b/documentation/src/test/java/org/hibernate/userguide/hql/HQLTest.java
index 9199f98..f9567bc 100644
--- a/documentation/src/test/java/org/hibernate/userguide/hql/HQLTest.java
+++ b/documentation/src/test/java/org/hibernate/userguide/hql/HQLTest.java
@@ -1891,10 +1891,10 @@
 			List<Person> persons = entityManager.createQuery(
 				"select p " +
 				"from Person p " +
-				"where p.createdOn between '2000-01-01' and '2000-01-02'", Person.class )
+				"where p.createdOn between '1999-01-01' and '2001-01-02'", Person.class )
 			.getResultList();
 			//end::hql-between-predicate-example[]
-			assertEquals(1, persons.size());
+			assertEquals(2, persons.size());
 		});
 	}
 
