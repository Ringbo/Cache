diff --git a/EmPubLite-AndroidStudio/T19-LargeScreen/EmPubLite/app/src/main/java/com/commonsware/empublite/EmPubLiteActivity.java b/EmPubLite-AndroidStudio/T19-LargeScreen/EmPubLite/app/src/main/java/com/commonsware/empublite/EmPubLiteActivity.java
index a0c1804..57a0117 100644
--- a/EmPubLite-AndroidStudio/T19-LargeScreen/EmPubLite/app/src/main/java/com/commonsware/empublite/EmPubLiteActivity.java
+++ b/EmPubLite-AndroidStudio/T19-LargeScreen/EmPubLite/app/src/main/java/com/commonsware/empublite/EmPubLiteActivity.java
@@ -193,7 +193,7 @@
       }
 
       getFragmentManager().beginTransaction().addToBackStack(null)
-          .replace(R.id.sidebar, about).commit();
+          .replace(R.id.sidebar, about, ABOUT).commit();
     }
     else {
       Intent i=new Intent(this, SimpleContentActivity.class);
@@ -212,7 +212,7 @@
       }
 
       getFragmentManager().beginTransaction().addToBackStack(null)
-          .replace(R.id.sidebar, help).commit();
+          .replace(R.id.sidebar, help, HELP).commit();
     }
     else {
       Intent i=new Intent(this, SimpleContentActivity.class);
