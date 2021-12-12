diff --git a/demo/extras/src/main/java/it/gmariotti/cardslib/demo/extras/fragment/ActionbarpullFragment.java b/demo/extras/src/main/java/it/gmariotti/cardslib/demo/extras/fragment/ActionbarpullFragment.java
index b21ffb4..a5fa042 100644
--- a/demo/extras/src/main/java/it/gmariotti/cardslib/demo/extras/fragment/ActionbarpullFragment.java
+++ b/demo/extras/src/main/java/it/gmariotti/cardslib/demo/extras/fragment/ActionbarpullFragment.java
@@ -36,8 +36,8 @@
 import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshLayout;
 
 /**
- * This example uses a list card with Thumbnail loaded with built-in method and Picasso library
- * Please refer to https://github.com/square/picasso for full doc
+ * This example uses ActionBar-PullToRefresh
+ * Please refer to https://github.com/chrisbanes/ActionBar-PullToRefresh for full doc
  *
  * @author Gabriele Mariotti (gabri.mariotti@gmail.com)
  */
@@ -92,11 +92,11 @@
 
         //Init an array of Cards
         ArrayList<Card> cards = new ArrayList<Card>();
-        for (int i = 0; i < 5; i++) {
+        for (int i = 0; i < 25; i++) {
             ColorCard card = new ColorCard(this.getActivity());
             card.setTitle("A simple colored card " + i);
             card.setCount(i);
-            switch (i) {
+            switch (i%5) {
                 case 0:
                     card.setBackgroundResourceId(R.drawable.demoextra_card_selector_color1);
                     break;
@@ -119,7 +119,6 @@
 
         CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(getActivity(), cards);
 
-       // CardListView listView = (CardListView) getActivity().findViewById(R.id.carddemo_extra_list_picasso);
         if (listView != null) {
             listView.setAdapter(mCardArrayAdapter);
         }
