diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 470fde8..aa25d23 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -1224,7 +1224,7 @@
                     switch (p2) {
                         case BEFORE_DEFAULT:
                         case FIRST_BEFORE_DEFAULT:
-                            orderResult = -1;
+                            orderResult = 1;
                             break;
                     }
                     break;
@@ -1232,10 +1232,10 @@
                 case BEFORE_DEFAULT:
                     switch (p2) {
                         case AFTER_DEFAULT:
-                            orderResult = 1;
+                            orderResult = -1;
                             break;
                         case FIRST_BEFORE_DEFAULT:
-                            orderResult = -1;
+                            orderResult = 1;
                             break;
                     }
                     break;
@@ -1244,7 +1244,7 @@
                     switch (p2) {
                         case AFTER_DEFAULT:
                         case BEFORE_DEFAULT:
-                            orderResult = 1;
+                            orderResult = -1;
                             break;
                     }
                     break;
