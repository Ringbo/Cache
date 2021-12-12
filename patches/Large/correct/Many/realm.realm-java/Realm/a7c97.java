diff --git a/realm/src/main/java/io/realm/Realm.java b/realm/src/main/java/io/realm/Realm.java
index 8bb57b4..b216742 100644
--- a/realm/src/main/java/io/realm/Realm.java
+++ b/realm/src/main/java/io/realm/Realm.java
@@ -961,12 +961,12 @@
      * reflected in the Realm copies.
      *
      * @param objects RealmObjects to copy to the Realm.
-     * @return A collection of the the converted RealmObjects that all has their properties managed by the Realm.
+     * @return A list of the the converted RealmObjects that all has their properties managed by the Realm.
      *
      * @throws io.realm.exceptions.RealmException if any of the objects has already been added to Realm.
      * @throws java.lang.IllegalArgumentException if any of the elements in the input collection is {@code null}.
      */
-    public <E extends RealmObject> Collection<E> copyToRealm(Iterable<E> objects) {
+    public <E extends RealmObject> List<E> copyToRealm(Iterable<E> objects) {
         if (objects == null) new ArrayList<E>();
 
         ArrayList<E> realmObjects = new ArrayList<E>();
