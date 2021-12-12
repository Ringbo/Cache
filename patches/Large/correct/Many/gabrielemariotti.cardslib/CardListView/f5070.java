diff --git a/library/src/main/java/it/gmariotti/cardslib/library/view/CardListView.java b/library/src/main/java/it/gmariotti/cardslib/library/view/CardListView.java
index 7d45661..98d957e 100644
--- a/library/src/main/java/it/gmariotti/cardslib/library/view/CardListView.java
+++ b/library/src/main/java/it/gmariotti/cardslib/library/view/CardListView.java
@@ -176,7 +176,7 @@
         }else if (adapter instanceof CardCursorAdapter){
             setAdapter((CardCursorAdapter)adapter);
         }else {
-            Log.e(TAG,"You are using a generic adapter. Pay attention: your adapter has to call cardArrayAdapter#getView method" );
+            Log.w(TAG,"You are using a generic adapter. Pay attention: your adapter has to call cardArrayAdapter#getView method" );
             super.setAdapter(adapter);
         }
     }
