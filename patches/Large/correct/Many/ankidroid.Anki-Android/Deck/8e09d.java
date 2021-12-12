diff --git a/src/com/ichi2/anki/Deck.java b/src/com/ichi2/anki/Deck.java
index 4a9ae1d..f77cca4 100644
--- a/src/com/ichi2/anki/Deck.java
+++ b/src/com/ichi2/anki/Deck.java
@@ -3251,7 +3251,7 @@
         String col = row.getString(3);
         int align = row.getInt(4);
         String rtl = row.getString(5);
-        int pre = row.getInt(4);
+        int pre = row.getInt(6);
         if (fam != null) {
             t += "font-family:\"" + fam + "\";";
         }
