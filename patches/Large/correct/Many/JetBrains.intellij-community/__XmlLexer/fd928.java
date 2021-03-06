diff --git a/source/com/intellij/lexer/__XmlLexer.java b/source/com/intellij/lexer/__XmlLexer.java
index a762a35..597e50d 100644
--- a/source/com/intellij/lexer/__XmlLexer.java
+++ b/source/com/intellij/lexer/__XmlLexer.java
@@ -1,4 +1,4 @@
-/* The following code was generated by JFlex 1.4 on 6/3/05 5:06 PM */
+/* The following code was generated by JFlex 1.4 on 6/18/05 11:34 PM */
 
  /* It's an automatically generated code. Do not modify it. */
 package com.intellij.lexer;
@@ -11,7 +11,7 @@
 /**
  * This class is a scanner generated by 
  * <a href="http://www.jflex.de/">JFlex</a> 1.4
- * on 6/3/05 5:06 PM from the specification file
+ * on 6/18/05 11:34 PM from the specification file
  * <tt>C:/Irida/tools/lexer/_XmlLexer.flex</tt>
  */
 public class __XmlLexer implements FlexLexer,ELHostLexer {
@@ -37,13 +37,13 @@
    * Translates characters to character classes
    */
   private static final String ZZ_CMAP_PACKED = 
-    "\11\0\2\3\1\0\2\3\22\0\1\3\1\12\1\54\1\37\1\4"+
-    "\1\0\1\22\1\55\5\0\1\10\1\7\1\57\12\2\1\1\1\25"+
-    "\1\11\1\60\1\21\1\56\1\0\1\16\1\51\1\14\1\15\1\45"+
-    "\1\41\2\1\1\53\2\1\1\52\1\47\1\1\1\42\1\44\2\1"+
-    "\1\46\1\17\1\50\3\1\1\43\1\1\1\13\1\0\1\20\1\0"+
-    "\1\1\1\0\1\26\1\35\4\41\1\23\4\1\1\23\1\36\1\34"+
-    "\1\30\1\27\1\32\1\1\1\31\1\24\1\33\2\1\1\40\2\1"+
+    "\11\0\2\3\1\0\2\3\22\0\1\3\1\13\1\55\1\40\1\4"+
+    "\1\0\1\23\1\56\5\0\1\10\1\7\1\60\12\2\1\11\1\26"+
+    "\1\12\1\61\1\22\1\57\1\0\1\17\1\52\1\15\1\16\1\46"+
+    "\1\42\2\1\1\54\2\1\1\53\1\50\1\1\1\43\1\45\2\1"+
+    "\1\47\1\20\1\51\3\1\1\44\1\1\1\14\1\0\1\21\1\0"+
+    "\1\7\1\0\1\27\1\36\4\42\1\24\4\1\1\24\1\37\1\35"+
+    "\1\31\1\30\1\33\1\1\1\32\1\25\1\34\2\1\1\41\2\1"+
     "\1\5\1\0\1\6\54\0\1\1\12\0\1\1\4\0\1\1\5\0"+
     "\27\1\1\0\37\1\1\0\u013f\1\31\0\162\1\4\0\14\1\16\0"+
     "\5\1\11\0\1\1\213\0\1\1\13\0\1\1\1\0\3\1\1\0"+
@@ -112,20 +112,18 @@
   private static final int [] ZZ_ACTION = zzUnpackAction();
 
   private static final String ZZ_ACTION_PACKED_0 =
-    "\1\1\3\0\1\2\3\0\2\3\2\0\1\1\1\4"+
-    "\1\1\1\5\2\6\1\7\1\6\1\10\1\6\1\11"+
-    "\1\6\1\12\1\2\1\13\1\14\3\15\1\16\1\17"+
-    "\1\20\3\3\1\13\1\21\3\3\1\6\1\22\2\12"+
-    "\2\6\4\1\1\0\1\23\1\24\7\0\1\25\1\26"+
-    "\2\0\2\3\1\0\4\3\1\0\1\27\1\0\2\12"+
-    "\1\0\1\3\3\0\1\1\1\30\3\0\1\31\10\0"+
-    "\1\32\1\33\4\3\2\12\1\34\1\30\1\35\2\0"+
-    "\1\36\2\0\1\35\1\3\1\35\1\3\2\12\2\0"+
-    "\2\3\2\12\2\0\2\3\1\37\1\40\2\0\2\3"+
-    "\2\0\2\3\1\41\1\42\2\41";
+    "\1\1\3\0\1\2\7\0\1\1\1\3\1\1\1\4"+
+    "\2\5\1\6\1\5\1\7\1\5\1\10\1\5\1\11"+
+    "\1\2\1\12\1\13\3\14\1\15\1\16\1\17\3\20"+
+    "\1\12\1\21\1\20\1\5\1\22\2\11\2\5\4\1"+
+    "\1\0\1\23\1\24\10\0\1\25\1\0\1\26\7\0"+
+    "\1\27\1\0\2\11\4\0\1\1\1\30\4\0\1\31"+
+    "\7\0\1\6\1\10\1\11\1\0\1\32\1\13\1\33"+
+    "\2\11\1\34\1\30\1\35\3\0\1\36\2\0\2\11"+
+    "\2\0\2\11\2\0\1\37\1\40\4\0\1\41\1\42";
 
   private static int [] zzUnpackAction() {
-    int [] result = new int[143];
+    int [] result = new int[127];
     int offset = 0;
     offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
     return result;
@@ -150,27 +148,25 @@
   private static final int [] ZZ_ROWMAP = zzUnpackRowMap();
 
   private static final String ZZ_ROWMAP_PACKED_0 =
-    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
-    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
-    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\u0341\0\u03d4\0\u0405\0\u0436"+
-    "\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u0341\0\u03a3\0\u0310\0\u0341"+
-    "\0\u0341\0\u0341\0\u052b\0\u055c\0\u058d\0\u0310\0\u0341\0\u05be"+
-    "\0\u05ef\0\u0620\0\u0651\0\u0341\0\u0682\0\u06b3\0\u06e4\0\u0715"+
-    "\0\u0341\0\u0746\0\u0777\0\u07a8\0\u07d9\0\u0341\0\u0341\0\u080a"+
-    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0341\0\u0341"+
-    "\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8"+
-    "\0\u0ae9\0\u0651\0\u0341\0\u0b1a\0\u0b4b\0\u0b7c\0\u06e4\0\u0341"+
-    "\0\u0715\0\u0bad\0\u0bde\0\u0c0f\0\u024c\0\u0c40\0\u0c71\0\u0ca2"+
-    "\0\u0341\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9"+
-    "\0\u0e2a\0\u0341\0\u0341\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f"+
-    "\0\u0f50\0\u0341\0\u0341\0\u0341\0\u0f81\0\u0fb2\0\u0341\0\u0fe3"+
-    "\0\u1014\0\u052b\0\u1045\0\u05be\0\u1076\0\u10a7\0\u10d8\0\u1109"+
-    "\0\u113a\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291"+
-    "\0\u12c2\0\u0467\0\u0467\0\u12f3\0\u1324\0\u1355\0\u1386\0\u13b7"+
-    "\0\u13e8\0\u1419\0\u144a\0\u0341\0\u0341\0\u052b\0\u05be";
+    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
+    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
+    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u0352\0\u03e8\0\u041a\0\u044c"+
+    "\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0352\0\u03b6\0\u0320\0\u0352"+
+    "\0\u0352\0\u0352\0\u0352\0\u0546\0\u03b6\0\u0320\0\u0352\0\u0578"+
+    "\0\u05aa\0\u0352\0\u05dc\0\u060e\0\u0640\0\u0672\0\u0352\0\u06a4"+
+    "\0\u06d6\0\u0708\0\u073a\0\u0352\0\u0352\0\u076c\0\u079e\0\u07d0"+
+    "\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca\0\u0352\0\u08fc\0\u0352"+
+    "\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u05aa\0\u0352"+
+    "\0\u0a5a\0\u0a8c\0\u0abe\0\u0640\0\u0672\0\u0af0\0\u0b22\0\u0b54"+
+    "\0\u0258\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0352\0\u0c4e\0\u0c80"+
+    "\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10"+
+    "\0\u0e42\0\u0352\0\u0e74\0\u0352\0\u0ea6\0\u0ed8\0\u0352\0\u0352"+
+    "\0\u0352\0\u0f0a\0\u0f3c\0\u0f6e\0\u0352\0\u0fa0\0\u0fd2\0\u1004"+
+    "\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162\0\u047e"+
+    "\0\u047e\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u0352\0\u0352";
 
   private static int [] zzUnpackRowMap() {
-    int [] result = new int[143];
+    int [] result = new int[127];
     int offset = 0;
     offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
     return result;
@@ -193,120 +189,111 @@
   private static final int [] ZZ_TRANS = zzUnpackTrans();
 
   private static final String ZZ_TRANS_PACKED_0 =
-    "\3\15\1\16\1\17\4\15\1\20\10\15\1\21\36\15"+
-    "\1\22\1\23\1\22\1\16\5\22\1\24\2\22\4\23"+
+    "\3\15\1\16\1\17\5\15\1\20\10\15\1\21\36\15"+
+    "\1\22\1\23\1\22\1\16\6\22\1\24\2\22\4\23"+
     "\1\22\1\25\1\21\2\23\1\22\11\23\1\22\14\23"+
-    "\3\22\1\26\2\22\1\27\7\22\1\24\2\22\4\27"+
+    "\3\22\1\26\2\22\1\27\10\22\1\24\2\22\4\27"+
     "\2\22\1\21\2\27\1\22\11\27\1\22\14\27\2\22"+
-    "\1\30\3\22\1\31\1\22\1\16\5\22\1\24\2\22"+
+    "\1\30\3\22\1\31\1\22\1\16\6\22\1\24\2\22"+
     "\4\31\1\22\1\25\1\21\2\31\1\22\11\31\1\22"+
-    "\14\31\5\22\10\32\1\33\50\32\1\22\1\34\1\22"+
-    "\1\16\5\22\1\24\2\22\4\34\2\22\1\21\2\34"+
-    "\1\22\11\34\1\22\14\34\5\22\3\35\1\16\5\35"+
+    "\14\31\5\22\10\32\1\33\51\32\1\22\1\34\1\22"+
+    "\1\16\6\22\1\24\2\22\4\34\2\22\1\21\2\34"+
+    "\1\22\11\34\1\22\14\34\5\22\3\35\1\16\6\35"+
     "\1\36\10\35\1\37\31\35\1\40\1\41\2\35\1\42"+
-    "\11\22\1\24\10\22\1\21\36\22\4\43\1\44\4\43"+
-    "\1\45\10\43\1\46\31\43\1\47\4\43\4\50\1\51"+
-    "\4\50\1\52\10\50\1\46\32\50\1\47\3\50\1\22"+
-    "\1\31\1\22\1\16\5\22\1\24\1\22\1\53\4\31"+
-    "\1\22\1\54\1\21\2\31\1\22\11\31\1\22\4\31"+
-    "\1\55\1\31\1\56\5\31\1\57\1\60\3\22\20\61"+
-    "\1\62\40\61\3\15\1\0\1\63\4\15\1\0\10\15"+
-    "\1\0\36\15\3\0\1\16\55\0\4\15\1\63\1\64"+
-    "\3\15\1\0\10\15\1\0\36\15\12\0\1\65\43\0"+
-    "\1\66\1\67\2\0\1\70\12\0\4\70\3\0\1\71"+
-    "\1\70\1\0\1\72\3\70\1\73\1\70\1\74\2\70"+
-    "\1\75\14\70\67\0\2\23\4\0\2\23\3\0\4\23"+
-    "\3\0\2\23\1\0\11\23\1\0\14\23\17\0\1\76"+
-    "\67\0\1\77\40\0\2\27\4\0\2\27\3\0\4\27"+
-    "\3\0\2\27\1\0\11\27\1\0\14\27\26\0\1\100"+
-    "\40\0\2\31\4\0\2\31\3\0\4\31\3\0\2\31"+
-    "\1\0\11\31\1\0\14\31\5\0\10\32\1\101\60\32"+
-    "\1\102\50\32\1\0\2\34\4\0\2\34\3\0\4\34"+
-    "\3\0\2\34\1\0\11\34\1\0\14\34\5\0\4\43"+
-    "\1\0\15\43\1\0\31\43\1\0\4\43\4\103\1\104"+
-    "\1\105\14\103\1\0\31\103\1\0\4\103\4\43\1\0"+
-    "\5\43\1\106\7\43\1\0\31\43\1\0\4\43\4\50"+
-    "\1\0\15\50\1\0\32\50\1\0\3\50\4\107\1\110"+
-    "\1\105\14\107\1\0\32\107\1\0\3\107\4\50\1\0"+
-    "\5\50\1\111\7\50\1\0\32\50\1\0\3\50\20\112"+
-    "\1\113\33\112\1\114\4\112\1\0\2\31\4\0\2\31"+
+    "\12\22\1\24\10\22\1\21\36\22\4\43\1\44\5\43"+
+    "\1\45\10\43\1\46\31\43\1\47\10\43\1\50\5\43"+
+    "\1\45\10\43\1\46\32\43\1\47\3\43\1\22\1\31"+
+    "\1\22\1\16\6\22\1\24\1\22\1\51\4\31\1\22"+
+    "\1\52\1\21\2\31\1\22\11\31\1\22\4\31\1\53"+
+    "\1\31\1\54\5\31\1\55\1\56\3\22\21\57\1\60"+
+    "\40\57\3\15\1\0\1\61\5\15\1\0\10\15\1\0"+
+    "\36\15\3\0\1\16\56\0\4\15\1\61\1\62\4\15"+
+    "\1\0\10\15\1\0\36\15\13\0\1\63\43\0\1\64"+
+    "\1\65\2\0\1\66\13\0\4\66\3\0\1\67\1\66"+
+    "\1\0\1\70\3\66\1\71\1\66\1\72\2\66\1\73"+
+    "\14\66\70\0\2\23\4\0\2\23\1\74\3\0\4\23"+
+    "\3\0\2\23\1\0\11\23\1\0\14\23\20\0\1\75"+
+    "\70\0\1\76\40\0\2\27\4\0\2\27\1\77\3\0"+
+    "\4\27\3\0\2\27\1\0\11\27\1\0\14\27\27\0"+
+    "\1\100\40\0\2\31\4\0\2\31\1\101\3\0\4\31"+
+    "\3\0\2\31\1\0\11\31\1\0\14\31\5\0\10\32"+
+    "\1\102\61\32\1\103\51\32\1\0\2\34\4\0\2\34"+
+    "\1\104\3\0\4\34\3\0\2\34\1\0\11\34\1\0"+
+    "\14\34\12\0\1\105\61\0\1\106\54\0\21\107\1\110"+
+    "\33\107\1\111\4\107\1\0\2\31\4\0\2\31\1\101"+
     "\3\0\4\31\3\0\2\31\1\0\11\31\1\0\10\31"+
-    "\1\115\3\31\6\0\2\31\4\0\2\31\3\0\4\31"+
-    "\3\0\2\31\1\0\11\31\1\0\3\31\1\116\10\31"+
-    "\5\0\54\117\1\120\4\117\55\121\1\120\3\121\20\0"+
-    "\1\122\40\0\4\15\1\63\4\15\1\0\10\15\1\0"+
-    "\36\15\3\64\1\123\1\124\1\64\1\125\2\64\1\123"+
-    "\10\64\1\123\36\64\10\0\1\126\2\0\1\127\1\0"+
-    "\1\130\44\0\2\70\4\0\2\70\3\0\4\70\3\0"+
-    "\2\70\1\131\11\70\1\0\14\70\6\0\2\70\4\0"+
-    "\2\70\3\0\4\70\3\0\1\70\1\132\1\131\11\70"+
-    "\1\0\14\70\6\0\2\70\4\0\2\70\3\0\4\70"+
-    "\3\0\2\70\1\131\1\70\1\133\6\70\1\134\1\0"+
-    "\14\70\6\0\2\70\4\0\2\70\3\0\4\70\3\0"+
-    "\2\70\1\131\5\70\1\135\3\70\1\0\14\70\6\0"+
-    "\2\70\4\0\2\70\3\0\4\70\3\0\2\70\1\131"+
-    "\7\70\1\136\1\70\1\0\14\70\7\0\1\137\35\0"+
-    "\1\140\30\0\1\126\2\0\1\127\45\0\10\32\1\141"+
-    "\71\32\1\142\37\32\4\0\1\104\54\0\4\103\1\104"+
-    "\1\0\14\103\1\0\31\103\1\0\4\103\6\105\1\143"+
-    "\52\105\4\43\1\0\3\43\1\144\2\43\1\145\6\43"+
-    "\1\0\31\43\1\0\4\43\4\0\1\110\54\0\4\107"+
-    "\1\110\1\0\14\107\1\0\32\107\1\0\3\107\4\50"+
-    "\1\0\3\50\1\146\2\50\1\147\6\50\1\0\32\50"+
-    "\1\0\3\50\54\114\1\112\4\114\1\0\2\31\4\0"+
-    "\2\31\3\0\4\31\3\0\2\31\1\0\11\31\1\0"+
-    "\11\31\1\150\2\31\6\0\2\31\4\0\2\31\3\0"+
-    "\4\31\3\0\2\31\1\0\11\31\1\0\6\31\1\151"+
-    "\5\31\26\0\1\152\37\0\6\123\1\153\52\123\4\64"+
-    "\1\124\1\64\1\125\2\64\1\123\10\64\1\123\36\64"+
-    "\10\0\1\154\64\0\1\155\106\0\1\156\17\0\2\70"+
-    "\4\0\2\70\3\0\4\70\3\0\2\70\1\157\11\70"+
-    "\1\0\14\70\6\0\2\70\4\0\2\70\3\0\4\70"+
-    "\3\0\2\70\1\131\2\70\1\160\6\70\1\0\14\70"+
-    "\6\0\2\70\4\0\2\70\3\0\4\70\3\0\2\70"+
-    "\1\131\1\70\1\132\7\70\1\0\14\70\6\0\2\70"+
-    "\4\0\2\70\3\0\4\70\3\0\2\70\1\131\2\70"+
-    "\1\71\6\70\1\0\14\70\6\0\2\70\4\0\2\70"+
-    "\3\0\4\70\3\0\2\70\1\131\3\70\1\134\5\70"+
-    "\1\0\14\70\7\0\1\137\22\0\1\157\35\0\1\161"+
-    "\11\0\3\161\7\0\1\161\6\0\1\161\3\0\1\161"+
-    "\3\0\1\161\3\0\1\161\7\0\21\32\1\0\37\32"+
-    "\4\43\1\0\3\43\1\162\11\43\1\0\31\43\1\0"+
-    "\10\43\1\0\7\43\1\163\5\43\1\0\31\43\1\0"+
-    "\4\43\4\50\1\0\3\50\1\164\11\50\1\0\32\50"+
-    "\1\0\7\50\1\0\7\50\1\165\5\50\1\0\32\50"+
-    "\1\0\3\50\1\0\2\31\4\0\2\31\3\0\4\31"+
-    "\3\0\2\31\1\0\11\31\1\0\12\31\1\166\1\31"+
-    "\6\0\2\31\4\0\2\31\3\0\3\31\1\167\3\0"+
-    "\2\31\1\0\11\31\1\0\14\31\22\0\1\170\57\0"+
-    "\1\171\45\0\2\70\4\0\2\70\3\0\4\70\3\0"+
-    "\2\70\1\131\3\70\1\132\5\70\1\0\14\70\7\0"+
-    "\1\161\11\0\3\161\6\0\1\157\1\161\6\0\1\161"+
-    "\3\0\1\161\3\0\1\161\3\0\1\161\7\0\4\43"+
-    "\1\0\10\43\1\172\4\43\1\0\31\43\1\0\4\43"+
-    "\4\50\1\0\10\50\1\173\4\50\1\0\32\50\1\0"+
-    "\3\50\1\0\2\31\4\0\2\31\3\0\4\31\3\0"+
-    "\2\31\1\0\11\31\1\0\13\31\1\174\6\0\2\31"+
-    "\4\0\2\31\3\0\4\31\3\0\2\31\1\0\11\31"+
-    "\1\0\5\31\1\175\6\31\23\0\1\176\61\0\1\177"+
-    "\41\0\4\43\1\0\11\43\1\200\3\43\1\0\31\43"+
-    "\1\0\4\43\4\50\1\0\11\50\1\201\3\50\1\0"+
-    "\32\50\1\0\3\50\1\0\2\31\4\0\2\31\3\0"+
-    "\1\202\3\31\3\0\2\31\1\0\11\31\1\0\14\31"+
-    "\6\0\2\31\4\0\2\31\3\0\4\31\3\0\2\31"+
-    "\1\0\11\31\1\0\7\31\1\203\4\31\24\0\1\204"+
-    "\104\0\1\205\15\0\4\43\1\0\12\43\1\206\2\43"+
-    "\1\0\31\43\1\0\4\43\4\50\1\0\12\50\1\207"+
-    "\2\50\1\0\32\50\1\0\3\50\16\0\1\210\106\0"+
-    "\1\211\14\0\4\43\1\0\11\43\1\212\3\43\1\0"+
-    "\31\43\1\0\4\43\4\50\1\0\11\50\1\213\3\50"+
-    "\1\0\32\50\1\0\3\50\13\0\1\214\112\0\1\215"+
-    "\13\0\4\43\1\0\6\43\1\216\6\43\1\0\31\43"+
-    "\1\0\4\43\4\50\1\0\6\50\1\217\6\50\1\0"+
-    "\32\50\1\0\3\50";
+    "\1\112\3\31\6\0\2\31\4\0\2\31\1\101\3\0"+
+    "\4\31\3\0\2\31\1\0\11\31\1\0\3\31\1\113"+
+    "\10\31\5\0\55\114\1\43\4\114\56\115\1\43\3\115"+
+    "\21\0\1\116\40\0\4\15\1\61\5\15\1\0\10\15"+
+    "\1\0\36\15\3\62\1\117\1\120\1\62\1\121\3\62"+
+    "\1\117\10\62\1\117\36\62\10\0\1\122\3\0\1\123"+
+    "\1\0\1\124\44\0\2\66\4\0\2\66\1\125\3\0"+
+    "\4\66\3\0\2\66\1\126\11\66\1\0\14\66\6\0"+
+    "\2\66\4\0\2\66\1\125\3\0\4\66\3\0\1\66"+
+    "\1\127\1\126\11\66\1\0\14\66\6\0\2\66\4\0"+
+    "\2\66\1\125\3\0\4\66\3\0\2\66\1\126\1\66"+
+    "\1\130\6\66\1\131\1\0\14\66\6\0\2\66\4\0"+
+    "\2\66\1\125\3\0\4\66\3\0\2\66\1\126\5\66"+
+    "\1\132\3\66\1\0\14\66\6\0\2\66\4\0\2\66"+
+    "\1\125\3\0\4\66\3\0\2\66\1\126\7\66\1\133"+
+    "\1\66\1\0\14\66\7\0\1\134\36\0\1\135\21\0"+
+    "\1\136\13\0\4\136\3\0\2\136\1\0\11\136\1\0"+
+    "\14\136\15\0\1\122\3\0\1\123\46\0\1\137\13\0"+
+    "\4\137\3\0\2\137\1\0\11\137\1\0\14\137\6\0"+
+    "\1\140\13\0\4\140\3\0\2\140\1\0\11\140\1\0"+
+    "\14\140\5\0\10\32\1\141\73\32\1\142\37\32\1\0"+
+    "\1\143\13\0\4\143\3\0\2\143\1\0\11\143\1\0"+
+    "\14\143\5\0\6\105\1\144\46\105\1\0\4\105\6\106"+
+    "\1\144\47\106\1\0\3\106\55\111\1\107\4\111\1\0"+
+    "\2\31\4\0\2\31\1\101\3\0\4\31\3\0\2\31"+
+    "\1\0\11\31\1\0\11\31\1\145\2\31\6\0\2\31"+
+    "\4\0\2\31\1\101\3\0\4\31\3\0\2\31\1\0"+
+    "\11\31\1\0\6\31\1\146\5\31\27\0\1\147\37\0"+
+    "\6\117\1\150\53\117\4\62\1\120\1\62\1\121\3\62"+
+    "\1\117\10\62\1\117\36\62\10\0\1\151\66\0\1\152"+
+    "\107\0\1\153\17\0\1\154\13\0\4\154\3\0\2\154"+
+    "\1\0\11\154\1\0\14\154\6\0\2\66\4\0\2\66"+
+    "\1\125\3\0\4\66\3\0\2\66\1\155\11\66\1\0"+
+    "\14\66\6\0\2\66\4\0\2\66\1\125\3\0\4\66"+
+    "\3\0\2\66\1\126\2\66\1\156\6\66\1\0\14\66"+
+    "\6\0\2\66\4\0\2\66\1\125\3\0\4\66\3\0"+
+    "\2\66\1\126\1\66\1\127\7\66\1\0\14\66\6\0"+
+    "\2\66\4\0\2\66\1\125\3\0\4\66\3\0\2\66"+
+    "\1\126\2\66\1\67\6\66\1\0\14\66\6\0\2\66"+
+    "\4\0\2\66\1\125\3\0\4\66\3\0\2\66\1\126"+
+    "\3\66\1\131\5\66\1\0\14\66\7\0\1\134\23\0"+
+    "\1\155\35\0\1\157\12\0\3\157\7\0\1\157\6\0"+
+    "\1\157\3\0\1\157\3\0\1\157\3\0\1\157\10\0"+
+    "\2\136\4\0\2\136\4\0\4\136\3\0\2\136\1\0"+
+    "\11\136\1\0\14\136\6\0\2\137\4\0\2\137\4\0"+
+    "\4\137\3\0\2\137\1\0\11\137\1\0\14\137\6\0"+
+    "\2\140\4\0\2\140\4\0\4\140\3\0\2\140\1\0"+
+    "\11\140\1\0\14\140\5\0\22\32\1\0\37\32\1\0"+
+    "\2\143\4\0\2\143\4\0\4\143\3\0\2\143\1\0"+
+    "\11\143\1\0\14\143\6\0\2\31\4\0\2\31\1\101"+
+    "\3\0\4\31\3\0\2\31\1\0\11\31\1\0\12\31"+
+    "\1\160\1\31\6\0\2\31\4\0\2\31\1\101\3\0"+
+    "\3\31\1\161\3\0\2\31\1\0\11\31\1\0\14\31"+
+    "\23\0\1\162\60\0\1\163\45\0\2\154\4\0\2\154"+
+    "\4\0\4\154\3\0\2\154\1\126\11\154\1\0\14\154"+
+    "\6\0\2\66\4\0\2\66\1\125\3\0\4\66\3\0"+
+    "\2\66\1\126\3\66\1\127\5\66\1\0\14\66\7\0"+
+    "\1\157\12\0\3\157\6\0\1\155\1\157\6\0\1\157"+
+    "\3\0\1\157\3\0\1\157\3\0\1\157\10\0\2\31"+
+    "\4\0\2\31\1\101\3\0\4\31\3\0\2\31\1\0"+
+    "\11\31\1\0\13\31\1\164\6\0\2\31\4\0\2\31"+
+    "\1\101\3\0\4\31\3\0\2\31\1\0\11\31\1\0"+
+    "\5\31\1\165\6\31\24\0\1\166\62\0\1\167\42\0"+
+    "\2\31\4\0\2\31\1\101\3\0\1\170\3\31\3\0"+
+    "\2\31\1\0\11\31\1\0\14\31\6\0\2\31\4\0"+
+    "\2\31\1\101\3\0\4\31\3\0\2\31\1\0\11\31"+
+    "\1\0\7\31\1\171\4\31\25\0\1\172\105\0\1\173"+
+    "\34\0\1\174\107\0\1\175\30\0\1\176\113\0\1\177"+
+    "\13\0";
 
   private static int [] zzUnpackTrans() {
-    int [] result = new int[5243];
+    int [] result = new int[4700];
     int offset = 0;
     offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
     return result;
@@ -347,17 +334,16 @@
   private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();
 
   private static final String ZZ_ATTRIBUTE_PACKED_0 =
-    "\1\1\3\0\1\1\3\0\2\1\2\0\5\1\1\11"+
-    "\2\1\1\11\7\1\1\11\2\1\3\11\4\1\1\11"+
-    "\4\1\1\11\4\1\1\11\3\1\1\0\2\11\7\0"+
-    "\2\11\2\0\2\1\1\0\4\1\1\0\1\11\1\0"+
-    "\2\1\1\0\1\11\3\0\2\1\3\0\1\11\10\0"+
-    "\2\11\6\1\3\11\2\0\1\11\2\0\6\1\2\0"+
-    "\4\1\2\0\4\1\2\0\2\1\2\0\2\1\2\11"+
-    "\2\1";
+    "\1\1\3\0\1\1\7\0\5\1\1\11\2\1\1\11"+
+    "\7\1\1\11\2\1\4\11\3\1\1\11\2\1\1\11"+
+    "\4\1\1\11\3\1\1\0\2\11\10\0\1\11\1\0"+
+    "\1\11\7\0\1\11\1\0\2\1\4\0\2\1\4\0"+
+    "\1\11\7\0\3\1\1\0\1\11\1\1\1\11\2\1"+
+    "\3\11\3\0\1\11\2\0\2\1\2\0\2\1\2\0"+
+    "\2\1\4\0\2\11";
 
   private static int [] zzUnpackAttribute() {
-    int [] result = new int[143];
+    int [] result = new int[127];
     int offset = 0;
     offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
     return result;
@@ -681,11 +667,11 @@
       zzMarkedPos = zzMarkedPosL;
 
       switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
-        case 3: 
+        case 16: 
           { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
           }
         case 35: break;
-        case 11: 
+        case 10: 
           { return XmlTokenType.XML_BAD_CHARACTER;
           }
         case 36: break;
@@ -697,7 +683,7 @@
           { return elTokenType2;
           }
         case 38: break;
-        case 15: 
+        case 14: 
           { yybegin(ATTR_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
           }
         case 39: break;
@@ -713,7 +699,7 @@
           { return XmlTokenType.XML_CHAR_ENTITY_REF;
           }
         case 42: break;
-        case 5: 
+        case 4: 
           { yybegin(TAG); return XmlTokenType.XML_START_TAG_START;
           }
         case 43: break;
@@ -721,14 +707,14 @@
           { yybegin(END_TAG); return XmlTokenType.XML_END_TAG_START;
           }
         case 44: break;
-        case 6: 
+        case 5: 
           { if(yystate() == YYINITIAL){
         return XmlTokenType.XML_BAD_CHARACTER;
       }
       else yybegin(popState()); yypushback(yylength());
           }
         case 45: break;
-        case 7: 
+        case 6: 
           { yybegin(ATTR_LIST); pushState(TAG); return XmlTokenType.XML_NAME;
           }
         case 46: break;
@@ -756,7 +742,7 @@
           { return XmlTokenType.XML_COMMENT_CHARACTERS;
           }
         case 52: break;
-        case 9: 
+        case 8: 
           { yybegin(ATTR_LIST); pushState(PROCESSING_INSTRUCTION); return XmlTokenType.XML_NAME;
           }
         case 53: break;
@@ -764,23 +750,23 @@
           { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
           }
         case 54: break;
-        case 14: 
+        case 13: 
           { yybegin(ATTR_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
           }
         case 55: break;
-        case 16: 
+        case 15: 
           { return XmlTokenType.XML_EQ;
           }
         case 56: break;
-        case 13: 
+        case 12: 
           { yybegin(ATTR_LIST); yypushback(yylength());
           }
         case 57: break;
-        case 10: 
+        case 9: 
           { return XmlTokenType.XML_NAME;
           }
         case 58: break;
-        case 8: 
+        case 7: 
           { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
           }
         case 59: break;
@@ -792,7 +778,7 @@
           { return XmlElementType.XML_MARKUP;
           }
         case 61: break;
-        case 12: 
+        case 11: 
           { yybegin(ATTR); return XmlTokenType.XML_NAME;
           }
         case 62: break;
@@ -812,7 +798,7 @@
           { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
           }
         case 66: break;
-        case 4: 
+        case 3: 
           { return XmlTokenType.XML_WHITE_SPACE;
           }
         case 67: break;
@@ -821,7 +807,7 @@
           }
         case 68: break;
         default:
-          if (zzInput == YYEOF && zzStartRead <= zzCurrentPos) {
+          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
             zzAtEOF = true;
             zzDoEOF();
             return null;
