diff --git a/runtime/src/jet/runtime/Ranges.java b/runtime/src/jet/runtime/Ranges.java
index 2616ddb..96eab78 100644
--- a/runtime/src/jet/runtime/Ranges.java
+++ b/runtime/src/jet/runtime/Ranges.java
@@ -29,7 +29,7 @@
     }
 
     public static ByteRange upTo(byte from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return ByteRange.empty;
         }
         else {
@@ -38,7 +38,7 @@
     }
 
     public static ByteRange downTo(byte from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return new ByteRange(from, to - from - 1);
         }
         else {
@@ -47,7 +47,7 @@
     }
 
     public static ShortRange upTo(byte from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return ShortRange.empty;
         }
         else {
@@ -56,7 +56,7 @@
     }
 
     public static ShortRange downTo(byte from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return new ShortRange(from, to - from - 1);
         }
         else {
@@ -65,7 +65,7 @@
     }
 
     public static IntRange upTo(byte from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -74,7 +74,7 @@
     }
 
     public static IntRange downTo(byte from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -83,7 +83,7 @@
     }
 
     public static LongRange upTo(byte from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -92,7 +92,7 @@
     }
 
     public static LongRange downTo(byte from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -117,7 +117,7 @@
     }
 
     public static CharRange upTo(byte from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return CharRange.empty;
         }
         else {
@@ -126,7 +126,7 @@
     }
 
     public static CharRange downTo(byte from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return new CharRange((char) from, to - from - 1);
         }
         else {
@@ -135,7 +135,7 @@
     }
 
     public static ShortRange upTo(short from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return ShortRange.empty;
         }
         else {
@@ -144,7 +144,7 @@
     }
 
     public static ShortRange downTo(short from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return new ShortRange(from, to - from - 1);
         }
         else {
@@ -153,7 +153,7 @@
     }
 
     public static ShortRange upTo(short from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return ShortRange.empty;
         }
         else {
@@ -162,7 +162,7 @@
     }
 
     public static ShortRange downTo(short from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return new ShortRange(from, to - from - 1);
         }
         else {
@@ -171,7 +171,7 @@
     }
 
     public static IntRange upTo(short from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -180,7 +180,7 @@
     }
 
     public static IntRange downTo(short from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -189,7 +189,7 @@
     }
 
     public static LongRange upTo(short from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -198,7 +198,7 @@
     }
 
     public static LongRange downTo(short from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -223,7 +223,7 @@
     }
 
     public static ShortRange upTo(short from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return ShortRange.empty;
         }
         else {
@@ -232,7 +232,7 @@
     }
 
     public static ShortRange downTo(short from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return new ShortRange(from, to - from - 1);
         }
         else {
@@ -241,7 +241,7 @@
     }
 
     public static IntRange upTo(int from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -250,7 +250,7 @@
     }
 
     public static IntRange downTo(int from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -259,7 +259,7 @@
     }
 
     public static IntRange upTo(int from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -268,7 +268,7 @@
     }
 
     public static IntRange downTo(int from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -277,7 +277,7 @@
     }
 
     public static IntRange upTo(int from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -286,7 +286,7 @@
     }
 
     public static IntRange downTo(int from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -295,7 +295,7 @@
     }
 
     public static LongRange upTo(int from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -304,7 +304,7 @@
     }
 
     public static LongRange downTo(int from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -329,7 +329,7 @@
     }
 
     public static IntRange upTo(int from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -338,7 +338,7 @@
     }
 
     public static IntRange downTo(int from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -347,7 +347,7 @@
     }
 
     public static LongRange upTo(long from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -356,7 +356,7 @@
     }
 
     public static LongRange downTo(long from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -365,7 +365,7 @@
     }
 
     public static LongRange upTo(long from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -374,7 +374,7 @@
     }
 
     public static LongRange downTo(long from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -383,7 +383,7 @@
     }
 
     public static LongRange upTo(long from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -392,7 +392,7 @@
     }
 
     public static LongRange downTo(long from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -401,7 +401,7 @@
     }
 
     public static LongRange upTo(long from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -410,7 +410,7 @@
     }
 
     public static LongRange downTo(long from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -435,7 +435,7 @@
     }
 
     public static LongRange upTo(long from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -444,7 +444,7 @@
     }
 
     public static LongRange downTo(long from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -565,7 +565,7 @@
     }
 
     public static CharRange upTo(char from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return CharRange.empty;
         }
         else {
@@ -574,7 +574,7 @@
     }
 
     public static CharRange downTo(char from, byte to) {
-        if (from >= to) {
+        if (from > to) {
             return new CharRange(from, to - from - 1);
         }
         else {
@@ -583,7 +583,7 @@
     }
 
     public static ShortRange upTo(char from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return ShortRange.empty;
         }
         else {
@@ -592,7 +592,7 @@
     }
 
     public static ShortRange downTo(char from, short to) {
-        if (from >= to) {
+        if (from > to) {
             return new ShortRange((short) from, to - from - 1);
         }
         else {
@@ -601,7 +601,7 @@
     }
 
     public static IntRange upTo(char from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return IntRange.empty;
         }
         else {
@@ -610,7 +610,7 @@
     }
 
     public static IntRange downTo(char from, int to) {
-        if (from >= to) {
+        if (from > to) {
             return new IntRange(from, to - from - 1);
         }
         else {
@@ -619,7 +619,7 @@
     }
 
     public static LongRange upTo(char from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return LongRange.empty;
         }
         else {
@@ -628,7 +628,7 @@
     }
 
     public static LongRange downTo(char from, long to) {
-        if (from >= to) {
+        if (from > to) {
             return new LongRange(from, to - from - 1);
         }
         else {
@@ -653,7 +653,7 @@
     }
 
     public static CharRange upTo(char from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return CharRange.empty;
         }
         else {
@@ -662,7 +662,7 @@
     }
 
     public static CharRange downTo(char from, char to) {
-        if (from >= to) {
+        if (from > to) {
             return new CharRange(from, to - from - 1);
         }
         else {
@@ -707,7 +707,7 @@
                 }
                 else {
                     System.out.println("\npublic static " + resType + " upTo(" + t1 + " from, " + t2 + " to) {" +
-                                       "\n  if(from >= to) {\n" +
+                                       "\n  if(from > to) {\n" +
                                        "    return " + resType + ".empty;\n" +
                                        "  }\n" +
                                        "  else {\n" +
@@ -715,7 +715,7 @@
                                        "  }\n" +
                                        "}");
                     System.out.println("\npublic static " + resType + " downTo(" + t1 + " from, " + t2 + " to) {" +
-                                       "\n  if(from >= to) {\n" +
+                                       "\n  if(from > to) {\n" +
                                        "    return new " + resType + "(from, to-from-1);\n" +
                                        "  }\n" +
                                        "  else {\n" +
