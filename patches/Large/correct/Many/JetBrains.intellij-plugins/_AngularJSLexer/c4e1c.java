diff --git a/AngularJS/src/org/angularjs/lang/lexer/_AngularJSLexer.java b/AngularJS/src/org/angularjs/lang/lexer/_AngularJSLexer.java
index 5f55d50..4e0ba03 100644
--- a/AngularJS/src/org/angularjs/lang/lexer/_AngularJSLexer.java
+++ b/AngularJS/src/org/angularjs/lang/lexer/_AngularJSLexer.java
@@ -1,4 +1,4 @@
-/* The following code was generated by JFlex 1.4.3 on 2/27/14 6:59 PM */
+/* The following code was generated by JFlex 1.4.3 on 3/3/14 1:15 PM */
 
 package org.angularjs.lang.lexer;
 
@@ -13,7 +13,7 @@
 /**
  * This class is a scanner generated by 
  * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
- * on 2/27/14 6:59 PM from the specification file
+ * on 3/3/14 1:15 PM from the specification file
  * <tt>/Users/denofevil/Code/IDEA/tools/lexer/../../contrib/AngularJS/src/org/angularjs/lang/lexer/angular.flex</tt>
  */
 class _AngularJSLexer implements FlexLexer {
@@ -38,13 +38,13 @@
    * Translates characters to character classes
    */
   private static final String ZZ_CMAP_PACKED = 
-    "\11\0\1\1\1\3\1\1\1\0\1\60\22\0\1\30\1\41\1\10"+
-    "\1\0\1\12\1\36\1\44\1\10\1\46\1\47\1\34\1\33\1\54"+
-    "\1\7\1\5\1\35\12\4\1\56\1\55\1\42\1\40\1\43\1\57"+
-    "\1\0\4\61\1\6\1\61\24\12\1\52\1\2\1\53\1\37\1\11"+
-    "\1\0\1\20\1\31\1\26\1\24\1\16\1\17\2\12\1\25\1\12"+
-    "\1\27\1\21\1\12\1\23\3\12\1\14\1\22\1\13\1\15\3\12"+
-    "\1\32\1\12\1\50\1\45\1\51\42\0\1\1\uff5f\0";
+    "\11\0\1\1\1\3\1\1\1\0\1\57\22\0\1\27\1\40\1\10"+
+    "\1\0\1\11\1\35\1\43\1\10\1\45\1\46\1\33\1\32\1\53"+
+    "\1\7\1\5\1\34\12\4\1\55\1\54\1\41\1\37\1\42\1\56"+
+    "\1\0\4\60\1\6\1\60\24\11\1\51\1\2\1\52\1\36\1\11"+
+    "\1\0\1\17\1\30\1\25\1\23\1\15\1\16\2\11\1\24\1\11"+
+    "\1\26\1\20\1\11\1\22\3\11\1\13\1\21\1\12\1\14\3\11"+
+    "\1\31\1\11\1\47\1\44\1\50\42\0\1\1\uff5f\0";
 
   /** 
    * Translates characters to character classes
@@ -93,17 +93,17 @@
   private static final int [] ZZ_ROWMAP = zzUnpackRowMap();
 
   private static final String ZZ_ROWMAP_PACKED_0 =
-    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
-    "\0\144\0\144\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a"+
-    "\0\144\0\144\0\144\0\144\0\144\0\u02bc\0\u02ee\0\u0320"+
-    "\0\u0352\0\u0384\0\u03b6\0\144\0\144\0\144\0\144\0\144"+
-    "\0\144\0\144\0\144\0\144\0\144\0\u03e8\0\u041a\0\144"+
-    "\0\144\0\310\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u015e"+
-    "\0\u0546\0\u015e\0\u0578\0\u05aa\0\144\0\144\0\144\0\144"+
-    "\0\144\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708"+
-    "\0\144\0\144\0\144\0\u073a\0\u015e\0\u076c\0\u079e\0\u07d0"+
-    "\0\u015e\0\u0802\0\u0834\0\u0866\0\u015e\0\u0898\0\u08ca\0\u08fc"+
-    "\0\u092e\0\u0960\0\144\0\u0992\0\u015e";
+    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
+    "\0\142\0\142\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d"+
+    "\0\142\0\142\0\142\0\142\0\142\0\u02ae\0\u02df\0\u0310"+
+    "\0\u0341\0\u0372\0\u03a3\0\142\0\142\0\142\0\142\0\142"+
+    "\0\142\0\142\0\142\0\142\0\142\0\u03d4\0\u0405\0\142"+
+    "\0\142\0\304\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u0157"+
+    "\0\u052b\0\u0157\0\u055c\0\u058d\0\142\0\142\0\142\0\142"+
+    "\0\142\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4"+
+    "\0\142\0\142\0\142\0\u0715\0\u0157\0\u0746\0\u0777\0\u07a8"+
+    "\0\u0157\0\u07d9\0\u080a\0\u083b\0\u0157\0\u086c\0\u089d\0\u08ce"+
+    "\0\u08ff\0\u0930\0\142\0\u0961\0\u0157";
 
   private static int [] zzUnpackRowMap() {
     int [] result = new int[85];
@@ -130,66 +130,66 @@
 
   private static final String ZZ_TRANS_PACKED_0 =
     "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
-    "\1\12\2\10\1\13\1\10\1\14\1\10\1\15\1\16"+
+    "\1\12\1\10\1\13\1\10\1\14\1\10\1\15\1\16"+
     "\2\10\1\17\1\10\1\20\2\10\1\4\2\10\1\21"+
     "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
     "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
     "\1\42\1\43\1\44\1\45\1\4\1\10\2\46\1\47"+
-    "\1\50\4\46\1\51\47\46\1\50\1\46\63\0\1\4"+
-    "\1\52\1\4\24\0\1\4\27\0\1\4\4\0\1\4"+
-    "\62\0\1\6\1\53\1\54\7\0\1\54\47\0\1\53"+
-    "\61\0\1\10\1\0\1\10\3\0\16\10\1\0\2\10"+
-    "\26\0\1\10\4\0\1\10\1\0\1\10\3\0\2\10"+
+    "\1\50\4\46\1\51\46\46\1\50\1\46\62\0\1\4"+
+    "\1\52\1\4\23\0\1\4\27\0\1\4\4\0\1\4"+
+    "\61\0\1\6\1\53\1\54\6\0\1\54\47\0\1\53"+
+    "\60\0\1\10\1\0\1\10\2\0\16\10\1\0\2\10"+
+    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\2\10"+
     "\1\55\13\10\1\0\2\10\26\0\1\10\4\0\1\10"+
-    "\1\0\1\10\3\0\11\10\1\56\4\10\1\0\2\10"+
-    "\26\0\1\10\4\0\1\10\1\0\1\10\3\0\6\10"+
+    "\1\0\1\10\2\0\11\10\1\56\4\10\1\0\2\10"+
+    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\6\10"+
     "\1\57\7\10\1\0\2\10\26\0\1\10\4\0\1\10"+
-    "\1\0\1\10\3\0\10\10\1\60\5\10\1\0\2\10"+
-    "\26\0\1\10\4\0\1\10\1\0\1\10\3\0\3\10"+
+    "\1\0\1\10\2\0\10\10\1\60\5\10\1\0\2\10"+
+    "\26\0\1\10\4\0\1\10\1\0\1\10\2\0\3\10"+
     "\1\61\12\10\1\0\2\10\26\0\1\10\4\0\1\10"+
-    "\1\0\1\10\3\0\11\10\1\62\4\10\1\0\2\10"+
-    "\26\0\1\10\40\0\1\63\61\0\1\64\61\0\1\65"+
-    "\61\0\1\66\65\0\1\67\62\0\1\70\14\0\2\46"+
-    "\2\0\4\46\1\0\47\46\1\0\1\46\3\71\1\0"+
-    "\11\71\1\72\42\71\1\0\1\71\4\0\1\53\1\0"+
-    "\1\54\7\0\1\54\47\0\1\73\2\0\1\73\23\0"+
-    "\1\73\32\0\1\10\1\0\1\10\3\0\3\10\1\74"+
+    "\1\0\1\10\2\0\11\10\1\62\4\10\1\0\2\10"+
+    "\26\0\1\10\37\0\1\63\60\0\1\64\60\0\1\65"+
+    "\60\0\1\66\64\0\1\67\61\0\1\70\14\0\2\46"+
+    "\2\0\4\46\1\0\46\46\1\0\1\46\3\71\1\0"+
+    "\10\71\1\72\42\71\1\0\1\71\4\0\1\53\1\0"+
+    "\1\54\6\0\1\54\47\0\1\73\2\0\1\73\22\0"+
+    "\1\73\32\0\1\10\1\0\1\10\2\0\3\10\1\74"+
     "\2\10\1\75\7\10\1\0\2\10\26\0\1\10\4\0"+
-    "\1\10\1\0\1\10\3\0\12\10\1\76\3\10\1\0"+
-    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\3\0"+
+    "\1\10\1\0\1\10\2\0\12\10\1\76\3\10\1\0"+
+    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\2\0"+
     "\7\10\1\77\6\10\1\0\2\10\26\0\1\10\4\0"+
-    "\1\10\1\0\1\10\3\0\7\10\1\100\6\10\1\0"+
-    "\2\10\26\0\1\10\40\0\1\101\61\0\1\102\21\0"+
-    "\4\103\1\104\1\103\1\104\7\103\3\104\3\103\1\104"+
+    "\1\10\1\0\1\10\2\0\7\10\1\100\6\10\1\0"+
+    "\2\10\26\0\1\10\37\0\1\101\60\0\1\102\21\0"+
+    "\4\103\1\104\1\103\1\104\6\103\3\104\3\103\1\104"+
     "\1\103\1\104\2\103\1\104\27\103\1\104\4\0\1\73"+
-    "\61\0\1\10\1\0\1\10\3\0\4\10\1\105\11\10"+
+    "\60\0\1\10\1\0\1\10\2\0\4\10\1\105\11\10"+
     "\1\0\2\10\26\0\1\10\4\0\1\10\1\0\1\10"+
-    "\3\0\14\10\1\106\1\10\1\0\2\10\26\0\1\10"+
-    "\4\0\1\10\1\0\1\10\3\0\4\10\1\107\11\10"+
+    "\2\0\14\10\1\106\1\10\1\0\2\10\26\0\1\10"+
+    "\4\0\1\10\1\0\1\10\2\0\4\10\1\107\11\10"+
     "\1\0\2\10\26\0\1\10\4\0\1\10\1\0\1\10"+
-    "\3\0\10\10\1\110\5\10\1\0\2\10\26\0\1\10"+
-    "\4\0\1\10\1\0\1\10\3\0\7\10\1\111\6\10"+
+    "\2\0\10\10\1\110\5\10\1\0\2\10\26\0\1\10"+
+    "\4\0\1\10\1\0\1\10\2\0\7\10\1\111\6\10"+
     "\1\0\2\10\26\0\1\10\4\0\1\112\1\0\1\112"+
-    "\7\0\3\112\3\0\1\112\1\0\1\112\2\0\1\112"+
-    "\27\0\1\112\4\0\1\10\1\0\1\10\3\0\15\10"+
+    "\6\0\3\112\3\0\1\112\1\0\1\112\2\0\1\112"+
+    "\27\0\1\112\4\0\1\10\1\0\1\10\2\0\15\10"+
     "\1\113\1\0\2\10\26\0\1\10\4\0\1\10\1\0"+
-    "\1\10\3\0\5\10\1\114\10\10\1\0\2\10\26\0"+
-    "\1\10\4\0\1\10\1\0\1\10\3\0\4\10\1\115"+
+    "\1\10\2\0\5\10\1\114\10\10\1\0\2\10\26\0"+
+    "\1\10\4\0\1\10\1\0\1\10\2\0\4\10\1\115"+
     "\11\10\1\0\2\10\26\0\1\10\4\0\1\116\1\0"+
-    "\1\116\7\0\3\116\3\0\1\116\1\0\1\116\2\0"+
-    "\1\116\27\0\1\116\4\0\1\10\1\0\1\10\3\0"+
+    "\1\116\6\0\3\116\3\0\1\116\1\0\1\116\2\0"+
+    "\1\116\27\0\1\116\4\0\1\10\1\0\1\10\2\0"+
     "\16\10\1\117\2\10\26\0\1\10\4\0\1\10\1\0"+
-    "\1\10\3\0\13\10\1\120\2\10\1\0\2\10\26\0"+
-    "\1\10\4\0\1\71\1\0\1\71\7\0\3\71\3\0"+
-    "\1\71\1\0\1\71\2\0\1\71\27\0\1\71\31\0"+
-    "\1\121\34\0\1\10\1\0\1\10\3\0\11\10\1\122"+
-    "\4\10\1\0\2\10\26\0\1\10\32\0\1\123\33\0"+
-    "\1\10\1\0\1\10\3\0\4\10\1\124\11\10\1\0"+
-    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\3\0"+
+    "\1\10\2\0\13\10\1\120\2\10\1\0\2\10\26\0"+
+    "\1\10\4\0\1\71\1\0\1\71\6\0\3\71\3\0"+
+    "\1\71\1\0\1\71\2\0\1\71\27\0\1\71\30\0"+
+    "\1\121\34\0\1\10\1\0\1\10\2\0\11\10\1\122"+
+    "\4\10\1\0\2\10\26\0\1\10\31\0\1\123\33\0"+
+    "\1\10\1\0\1\10\2\0\4\10\1\124\11\10\1\0"+
+    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\2\0"+
     "\12\10\1\125\3\10\1\0\2\10\26\0\1\10";
 
   private static int [] zzUnpackTrans() {
-    int [] result = new int[2500];
+    int [] result = new int[2450];
     int offset = 0;
     offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
     return result;
