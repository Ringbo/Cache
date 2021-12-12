diff --git a/src/main/java/net/sf/jabref/imports/BibtexParser.java b/src/main/java/net/sf/jabref/imports/BibtexParser.java
index 8e7ebde..14b8eb3 100644
--- a/src/main/java/net/sf/jabref/imports/BibtexParser.java
+++ b/src/main/java/net/sf/jabref/imports/BibtexParser.java
@@ -376,7 +376,7 @@
                                     + Globals.lang("grouping may not work for this entry") + ")");
                         }
                     } catch (IOException ex) {
-                        LOGGER.debug("Could not parse entry", ex);
+                        LOGGER.warn("Could not parse entry", ex);
                         parserResult.addWarning(Globals.lang("Error occured when parsing entry") + ": '"
                                 + ex.getMessage() + "'. " + Globals.lang("Skipped entry."));
 
