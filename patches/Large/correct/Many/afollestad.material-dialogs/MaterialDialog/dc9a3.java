diff --git a/library/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java b/library/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java
index 58a0a8e..ff4ae10 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/MaterialDialog.java
@@ -504,13 +504,13 @@
                         this.mediumFont = Typeface.create("sans-serif-medium", Typeface.NORMAL);
                     else
                         this.mediumFont = Typeface.create("sans-serif", Typeface.BOLD);
-                } catch (Throwable ignored) {
+                } catch (Exception ignored) {
                 }
             }
             if (this.regularFont == null) {
                 try {
                     this.regularFont = Typeface.create("sans-serif", Typeface.NORMAL);
-                } catch (Throwable ignored) {
+                } catch (Exception ignored) {
                 }
             }
         }
