diff --git a/app/src/main/java/org/schabi/newpipe/settings/SelectKioskFragment.java b/app/src/main/java/org/schabi/newpipe/settings/SelectKioskFragment.java
index 204b359..3f84f90 100644
--- a/app/src/main/java/org/schabi/newpipe/settings/SelectKioskFragment.java
+++ b/app/src/main/java/org/schabi/newpipe/settings/SelectKioskFragment.java
@@ -125,7 +125,7 @@
                 throws Exception {
 
             for(StreamingService service : NewPipe.getServices()) {
-                for(String kioskId : service.getKioskList().getAvailableKisoks()) {
+                for(String kioskId : service.getKioskList().getAvailableKiosks()) {
                     String name = service.getServiceInfo().name;
                     name += "/";
                     name += KioskTranslator.getTranslatedKioskName(kioskId, getContext());
