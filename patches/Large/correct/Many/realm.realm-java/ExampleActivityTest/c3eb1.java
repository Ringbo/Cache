diff --git a/examples/unitTestExample/src/test/java/io/realm/examples/unittesting/ExampleActivityTest.java b/examples/unitTestExample/src/test/java/io/realm/examples/unittesting/ExampleActivityTest.java
index 104c041..4e23a70 100644
--- a/examples/unitTestExample/src/test/java/io/realm/examples/unittesting/ExampleActivityTest.java
+++ b/examples/unitTestExample/src/test/java/io/realm/examples/unittesting/ExampleActivityTest.java
@@ -137,7 +137,7 @@
         RealmResults<Person> people = mockRealmResults();
 
         // When we ask Realm for all of the Person instances, return the mock RealmResults
-        when(mockRealm.allObjects(Person.class)).thenReturn(people);
+        when(mockRealm.where(Person.class).findAll()).thenReturn(people);
 
         // When a between query is performed with any string as the field and any int as the
         // value, then return the personQuery itself
@@ -191,14 +191,13 @@
         // Do not verify partial mock invocation count: https://github.com/jayway/powermock/issues/649
         //verify(mockRealm, times(5)).executeTransaction(Mockito.any(Realm.Transaction.class));
 
-        // Verify that we queried for all Person instance two times in this run (in the original
-        // onCreate, and then again in the button click). Was called two times previously in the
-        // setup, therefore we need to check if it was called again.
-        verify(mockRealm, times(3)).allObjects(Person.class);
+        // Verify that we queried for Person instances five times in this run (2 in basicCrud(),
+        // 2 in complexQuery() and 1 in the button click)
+        verify(mockRealm, times(5)).where(Person.class);
 
-        // Verify that the clear method was called. Clear is also called in the start of the
+        // Verify that the delete method was called. Delete is also called in the start of the
         // activity to ensure we start with a clean db.
-        verify(people, times(2)).deleteAllFromRealm();
+        verify(mockRealm, times(2)).delete(Person.class);
 
         // Call the destroy method so we can verify that the .close() method was called (below)
         controller.destroy();
