diff --git a/demo/stock/src/main/java/it/gmariotti/cardslib/demo/fragment/CardWithListArrayFragment.java b/demo/stock/src/main/java/it/gmariotti/cardslib/demo/fragment/CardWithListArrayFragment.java
index bfb8c10..cc50495 100644
--- a/demo/stock/src/main/java/it/gmariotti/cardslib/demo/fragment/CardWithListArrayFragment.java
+++ b/demo/stock/src/main/java/it/gmariotti/cardslib/demo/fragment/CardWithListArrayFragment.java
@@ -72,7 +72,7 @@
         for (int i=0;i<200;i++) {
             //Create a Card
             GoogleNowWeatherCard card = new GoogleNowWeatherCard(getActivity());
-            card.init(i);
+            card.init();
             cards.add(card);
         }
 
