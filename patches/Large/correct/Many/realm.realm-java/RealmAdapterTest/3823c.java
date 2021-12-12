diff --git a/realm/src/androidTest/java/io/realm/RealmAdapterTest.java b/realm/src/androidTest/java/io/realm/RealmAdapterTest.java
index 9f75b0e..4128f8e 100644
--- a/realm/src/androidTest/java/io/realm/RealmAdapterTest.java
+++ b/realm/src/androidTest/java/io/realm/RealmAdapterTest.java
@@ -77,7 +77,7 @@
 
         realmAdapter.updateRealmResults(realmAdapter.getRealmResults()
                 .sort(FIELD_STRING));
-        assertEquals(resultList.first(), realmAdapter.getRealmResults().first());
+        assertEquals(resultList.last(), realmAdapter.getRealmResults().first());
         assertEquals(resultList.size(), realmAdapter.getRealmResults().size());
 
     }
