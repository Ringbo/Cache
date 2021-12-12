diff --git a/xabber/src/main/java/com/xabber/android/ui/activity/ContactAdd.java b/xabber/src/main/java/com/xabber/android/ui/activity/ContactAdd.java
index f60edb3..2f2c5e8 100644
--- a/xabber/src/main/java/com/xabber/android/ui/activity/ContactAdd.java
+++ b/xabber/src/main/java/com/xabber/android/ui/activity/ContactAdd.java
@@ -83,7 +83,7 @@
     }
 
     private void addContact() {
-        ((ContactAdder) getSupportFragmentManager().findFragmentById(R.id.fragment_container)).addContact();
+        ((ContactAdder) getFragmentManager().findFragmentById(R.id.fragment_container)).addContact();
     }
 
     @Override
