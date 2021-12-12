diff --git a/examples/introExample/src/main/java/io/realm/examples/intro/IntroExampleActivity.java b/examples/introExample/src/main/java/io/realm/examples/intro/IntroExampleActivity.java
index f98acf5..f056fed 100644
--- a/examples/introExample/src/main/java/io/realm/examples/intro/IntroExampleActivity.java
+++ b/examples/introExample/src/main/java/io/realm/examples/intro/IntroExampleActivity.java
@@ -145,7 +145,7 @@
         realm.beginTransaction();
         Dog fido = realm.createObject(Dog.class);
         fido.setName("fido");
-        for (int i = 0; i <= 10; i++) {
+        for (int i = 0; i < 10; i++) {
             Person person = realm.createObject(Person.class);
             person.setId(i);
             person.setName("Person no. " + i);
