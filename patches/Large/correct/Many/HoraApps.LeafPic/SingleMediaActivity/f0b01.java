diff --git a/app/src/main/java/org/horaapps/leafpic/activities/SingleMediaActivity.java b/app/src/main/java/org/horaapps/leafpic/activities/SingleMediaActivity.java
index 1cbfe15..5fd8678 100644
--- a/app/src/main/java/org/horaapps/leafpic/activities/SingleMediaActivity.java
+++ b/app/src/main/java/org/horaapps/leafpic/activities/SingleMediaActivity.java
@@ -215,7 +215,7 @@
             findViewById(R.id.ll_emoji_easter_egg).setVisibility(Hawk.get("emoji_easter_egg", 0) == 1 ? View.VISIBLE : View.GONE);
         }
 
-        media = new ArrayList<>(Collections.singletonList(new Media(getApplicationContext(), uri)));
+        media = new ArrayList<>(Collections.singletonList(new Media(uri)));
         position = 0;
         customUri = true;
     }
