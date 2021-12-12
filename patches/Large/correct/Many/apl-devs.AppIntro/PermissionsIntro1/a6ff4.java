diff --git a/example/src/main/java/com/amqtech/opensource/appintroexample/ui/permsTabs/intro/PermissionsIntro1.java b/example/src/main/java/com/amqtech/opensource/appintroexample/ui/permsTabs/intro/PermissionsIntro1.java
index b0b366d..b678457 100644
--- a/example/src/main/java/com/amqtech/opensource/appintroexample/ui/permsTabs/intro/PermissionsIntro1.java
+++ b/example/src/main/java/com/amqtech/opensource/appintroexample/ui/permsTabs/intro/PermissionsIntro1.java
@@ -50,7 +50,7 @@
         addSlide(AppIntroFragment.newInstance(sliderPage4));
 
         // Here we load a string array with a camera permission, and tell the library to request permissions on slide 2
-        askForPermissions(new String[]{Manifest.permission.CAMERA}, 4);
+        askForPermissions(new String[]{Manifest.permission.CAMERA}, 2);
     }
 
     @Override
