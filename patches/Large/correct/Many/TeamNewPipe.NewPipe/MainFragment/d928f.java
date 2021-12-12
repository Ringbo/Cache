diff --git a/app/src/main/java/org/schabi/newpipe/fragments/MainFragment.java b/app/src/main/java/org/schabi/newpipe/fragments/MainFragment.java
index ba09f40..f26f973 100644
--- a/app/src/main/java/org/schabi/newpipe/fragments/MainFragment.java
+++ b/app/src/main/java/org/schabi/newpipe/fragments/MainFragment.java
@@ -234,7 +234,7 @@
         StreamingService service = NewPipe.getService(currentServiceId);
         KioskList kl = service.getKioskList();
         int i = 0;
-        for(final String ks : kl.getAvailableKisoks()) {
+        for(final String ks : kl.getAvailableKiosks()) {
             menu.add(0, KIOSK_MENU_OFFSETT + i, Menu.NONE,
                     KioskTranslator.getTranslatedKioskName(ks, getContext()))
                     .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
