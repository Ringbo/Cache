diff --git a/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java b/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
index ae80d7b..7f8c1ef 100644
--- a/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
+++ b/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
@@ -3973,7 +3973,7 @@
                 realm.close();
                 bgThreadDone.countDown();
             }
-        }).run();
+        }).start();
         TestHelper.awaitOrFail(bgThreadDone);
 
         realm.refresh();
@@ -3997,7 +3997,7 @@
                 realm.close();
                 bgThreadDone.countDown();
             }
-        }).run();
+        }).start();
         TestHelper.awaitOrFail(bgThreadDone);
 
         realm.refresh();
