diff --git a/app/src/main/java/io/plaidapp/ui/SearchActivity.java b/app/src/main/java/io/plaidapp/ui/SearchActivity.java
index 0f031ab..9239414 100644
--- a/app/src/main/java/io/plaidapp/ui/SearchActivity.java
+++ b/app/src/main/java/io/plaidapp/ui/SearchActivity.java
@@ -193,7 +193,7 @@
                 searchBack.setImageDrawable(ContextCompat.getDrawable(SearchActivity.this,
                         R.drawable.ic_arrow_back_padded));
             }
-        }, 600);
+        }, 600L);
 
         // fade in the other search chrome
         searchBackground.animate()
