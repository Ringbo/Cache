diff --git a/src/main/java/net/sf/jabref/RightClickMenu.java b/src/main/java/net/sf/jabref/RightClickMenu.java
index fe4c4661..51f2b6e 100644
--- a/src/main/java/net/sf/jabref/RightClickMenu.java
+++ b/src/main/java/net/sf/jabref/RightClickMenu.java
@@ -78,7 +78,7 @@
                 try {
                     panel.runCommand("copy");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute copy", ex);
+                    LOGGER.warn("Could not execute copy", ex);
                 }
             }
         });
@@ -89,7 +89,7 @@
                 try {
                     panel.runCommand("paste");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute paste", ex);
+                    LOGGER.warn("Could not execute paste", ex);
                 }
             }
         });
@@ -100,7 +100,7 @@
                 try {
                     panel.runCommand("cut");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute cut", ex);
+                    LOGGER.warn("Could not execute cut", ex);
                 }
             }
         });
@@ -114,7 +114,7 @@
                 try {
                     panel.runCommand("delete");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute delete", ex);
+                    LOGGER.warn("Could not execute delete", ex);
                 }
                 /*}
                 }); */
@@ -129,7 +129,7 @@
                 try {
                     panel.runCommand("exportToClipboard");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute exportToClipboard", ex);
+                    LOGGER.warn("Could not execute exportToClipboard", ex);
                 }
             }
         });
@@ -140,7 +140,7 @@
                 try {
                     panel.runCommand("sendAsEmail");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute sendAsEmail", ex);
+                    LOGGER.warn("Could not execute sendAsEmail", ex);
                 }
             }
         });
@@ -160,7 +160,7 @@
                     try {
                         panel.runCommand("markEntries");
                     } catch (Throwable ex) {
-                        LOGGER.debug("Could not execute markEntries", ex);
+                        LOGGER.warn("Could not execute markEntries", ex);
                     }
                 }
             });
@@ -174,7 +174,7 @@
                     try {
                         panel.runCommand("unmarkEntries");
                     } catch (Throwable ex) {
-                        LOGGER.debug("Could not execute unmarkEntries", ex);
+                        LOGGER.warn("Could not execute unmarkEntries", ex);
                     }
                 }
             });
@@ -190,7 +190,7 @@
                         try {
                             panel.runCommand("markEntries");
                         } catch (Throwable ex) {
-                            LOGGER.debug("Could not execute markEntries", ex);
+                            LOGGER.warn("Could not execute markEntries", ex);
                         }
                     }
                 });
@@ -205,7 +205,7 @@
                         try {
                             panel.runCommand("unmarkEntries");
                         } catch (Throwable ex) {
-                            LOGGER.debug("Could not execute unmarkEntries", ex);
+                            LOGGER.warn("Could not execute unmarkEntries", ex);
                         }
                     }
                 });
@@ -255,7 +255,7 @@
                 try {
                     panel.runCommand("openFolder");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not open folder", ex);
+                    LOGGER.warn("Could not open folder", ex);
                 }
             }
         });
@@ -267,7 +267,7 @@
                 try {
                     panel.runCommand("openExternalFile");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not open external file", ex);
+                    LOGGER.warn("Could not open external file", ex);
                 }
             }
         });
@@ -279,7 +279,7 @@
                 try {
                     panel.runCommand("addFileLink");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not attach file", ex);
+                    LOGGER.warn("Could not attach file", ex);
                 }
             }
         });
@@ -298,7 +298,7 @@
                 try {
                     panel.runCommand("openUrl");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not execute open URL", ex);
+                    LOGGER.warn("Could not execute open URL", ex);
                 }
             }
         });
@@ -310,7 +310,7 @@
                 try {
                     panel.runCommand("copyKey");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not copy BibTex key", ex);
+                    LOGGER.warn("Could not copy BibTex key", ex);
                 }
             }
         });
@@ -322,7 +322,7 @@
                 try {
                     panel.runCommand("copyCiteKey");
                 } catch (Throwable ex) {
-                    LOGGER.debug("Could not copy cite key", ex);
+                    LOGGER.warn("Could not copy cite key", ex);
                 }
             }
         });
