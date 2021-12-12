diff --git a/src/main/java/net/sf/jabref/collab/StringChange.java b/src/main/java/net/sf/jabref/collab/StringChange.java
index 28c29be..8994c05 100644
--- a/src/main/java/net/sf/jabref/collab/StringChange.java
+++ b/src/main/java/net/sf/jabref/collab/StringChange.java
@@ -90,7 +90,7 @@
                 panel.database().addString(bs);
                 undoEdit.addEdit(new UndoableInsertString(panel, panel.database(), bs));
             } catch (KeyCollisionException ex) {
-                LOGGER.info("Error: could not add string '" + string.getName() + "': " + ex.getMessage(), ex);
+                LOGGER.info("Error: could not add string '" + bs.getName() + "': " + ex.getMessage(), ex);
             }
         }
 
