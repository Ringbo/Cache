diff --git a/app/src/processing/app/Base.java b/app/src/processing/app/Base.java
index f8380c0..30c7f3c 100644
--- a/app/src/processing/app/Base.java
+++ b/app/src/processing/app/Base.java
@@ -150,10 +150,10 @@
         public void run() {
           try {
             createAndShowGUI(args);
-          } catch (Exception e) {
+          } catch (Throwable t) {
             showBadnessTrace("It was not meant to be",
                              "A serious problem happened during startup. Please report:\n" +
-                             "http://github.com/processing/processing/issues/new", e, true);
+                             "http://github.com/processing/processing/issues/new", t, true);
           }
         }
     });
