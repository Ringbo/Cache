diff --git a/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java b/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java
index 58d4744..6f8315c 100644
--- a/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java
+++ b/sample/src/main/java/com/afollestad/materialdialogssample/MainActivity.java
@@ -257,7 +257,7 @@
                         Toast.makeText(getApplicationContext(), which + ": " + text, Toast.LENGTH_SHORT).show();
                     }
                 })
-                .itemProessor(new ButtonItemProcessor(this))
+                .itemProcessor(new ButtonItemProcessor(this))
                 .build()
                 .show();
     }
