diff --git a/realm/src/androidTest/java/io/realm/RealmLinkTests.java b/realm/src/androidTest/java/io/realm/RealmLinkTests.java
index 75f70c1..d07359e 100644
--- a/realm/src/androidTest/java/io/realm/RealmLinkTests.java
+++ b/realm/src/androidTest/java/io/realm/RealmLinkTests.java
@@ -447,7 +447,7 @@
         }
         try {
             RealmResults<Owner> owners = testRealm.where(Owner.class).equalTo("not.there", true).findAll();
-        } catch (ArrayIndexOutOfBoundsException e) {
+        } catch (IllegalArgumentException e) {
 
         }
     }
