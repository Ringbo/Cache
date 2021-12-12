diff --git a/plugins/spellchecker/src/com/intellij/spellchecker/compress/Encoder.java b/plugins/spellchecker/src/com/intellij/spellchecker/compress/Encoder.java
index e9ade35..256e98b 100644
--- a/plugins/spellchecker/src/com/intellij/spellchecker/compress/Encoder.java
+++ b/plugins/spellchecker/src/com/intellij/spellchecker/compress/Encoder.java
@@ -24,7 +24,7 @@
 
   @Nullable
   public UnitBitSet encode(@NotNull CharSequence letters, boolean force) throws EncodingException {
-    if (UnitBitSet.MAX_CHARS_IN_WORD >= letters.length()) return null;
+    if (UnitBitSet.MAX_CHARS_IN_WORD < letters.length()) return null;
     UnitBitSet bs = new UnitBitSet();
     for (int i = 0; i < letters.length() - 1 + 1; i++) {
       char letter = letters.charAt(i);
