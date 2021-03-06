diff --git a/python/src/com/jetbrains/python/psi/types/PyTypeLexer.java b/python/src/com/jetbrains/python/psi/types/PyTypeLexer.java
index 9d786f5..d1fcd03 100644
--- a/python/src/com/jetbrains/python/psi/types/PyTypeLexer.java
+++ b/python/src/com/jetbrains/python/psi/types/PyTypeLexer.java
@@ -1,4 +1,4 @@
-/* The following code was generated by JFlex 1.4.3 on 7/19/13 2:41 PM */
+/* The following code was generated by JFlex 1.4.3 on 7/22/13 3:52 PM */
 
 package com.jetbrains.python.psi.types;
 
@@ -11,7 +11,7 @@
 /**
  * This class is a scanner generated by 
  * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
- * on 7/19/13 2:41 PM from the specification file
+ * on 7/22/13 3:52 PM from the specification file
  * <tt>/home/user/src/idea/tools/lexer/../../python/src/com/jetbrains/python/psi/types/PyType.flex</tt>
  */
 public class PyTypeLexer implements FlexLexer {
@@ -35,11 +35,12 @@
    * Translates characters to character classes
    */
   private static final String ZZ_CMAP_PACKED = 
-    "\11\0\1\2\1\1\2\0\1\1\22\0\1\2\1\13\6\0\2\24"+
-    "\2\0\1\24\1\0\1\24\1\0\12\27\1\3\6\0\23\14\7\25"+
-    "\1\24\1\0\1\24\1\0\1\26\1\12\1\10\1\26\1\6\2\26"+
-    "\1\21\5\26\1\7\1\22\1\26\1\17\1\4\1\26\1\20\1\11"+
-    "\1\23\4\26\1\5\1\26\1\15\1\24\1\16\1\13\uff81\0";
+    "\11\0\1\2\1\1\2\0\1\1\22\0\1\2\1\13\6\0\2\26"+
+    "\2\0\1\26\1\0\1\26\1\0\12\31\1\3\1\0\1\24\1\25"+
+    "\3\0\23\14\7\27\1\26\1\0\1\26\1\0\1\30\1\12\1\10"+
+    "\1\30\1\6\2\30\1\21\5\30\1\7\1\22\1\30\1\17\1\4"+
+    "\1\30\1\20\1\11\1\23\4\30\1\5\1\30\1\15\1\26\1\16"+
+    "\1\13\uff81\0";
 
   /** 
    * Translates characters to character classes
@@ -52,11 +53,12 @@
   private static final int [] ZZ_ACTION = zzUnpackAction();
 
   private static final String ZZ_ACTION_PACKED_0 =
-    "\1\0\1\1\1\2\1\0\1\3\1\4\4\3\1\5"+
-    "\1\6\2\0\1\5\1\3\2\0\1\3\5\0\1\4";
+    "\1\0\1\1\1\2\1\0\1\3\1\4\4\3\1\0"+
+    "\1\5\1\6\2\0\1\5\1\3\2\0\1\3\5\0"+
+    "\1\4";
 
   private static int [] zzUnpackAction() {
-    int [] result = new int[25];
+    int [] result = new int[26];
     int offset = 0;
     offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
     return result;
@@ -81,13 +83,13 @@
   private static final int [] ZZ_ROWMAP = zzUnpackRowMap();
 
   private static final String ZZ_ROWMAP_PACKED_0 =
-    "\0\0\0\30\0\60\0\110\0\140\0\60\0\170\0\220"+
-    "\0\250\0\300\0\60\0\170\0\330\0\360\0\140\0\u0108"+
-    "\0\u0120\0\u0138\0\u0150\0\u0168\0\u0180\0\u0198\0\u01b0\0\u01c8"+
-    "\0\u01e0";
+    "\0\0\0\32\0\64\0\116\0\150\0\64\0\202\0\234"+
+    "\0\266\0\320\0\352\0\64\0\202\0\u0104\0\u011e\0\150"+
+    "\0\u0138\0\u0152\0\u016c\0\u0186\0\u01a0\0\u01ba\0\u01d4\0\u01ee"+
+    "\0\u0208\0\u0222";
 
   private static int [] zzUnpackRowMap() {
-    int [] result = new int[25];
+    int [] result = new int[26];
     int offset = 0;
     offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
     return result;
@@ -112,21 +114,22 @@
   private static final String ZZ_TRANS_PACKED_0 =
     "\1\0\1\2\1\3\1\4\6\5\1\6\1\0\1\7"+
     "\1\0\1\6\1\10\1\5\1\11\1\5\1\12\1\13"+
-    "\1\14\1\5\2\0\1\2\62\0\1\15\1\0\1\16"+
-    "\25\0\6\5\2\0\1\5\2\0\5\5\1\0\3\5"+
-    "\4\0\6\5\2\0\1\5\1\6\1\0\5\5\1\0"+
-    "\3\5\4\0\6\5\2\0\1\5\2\0\1\5\2\17"+
-    "\2\5\1\0\3\5\4\0\6\5\2\0\1\5\2\0"+
-    "\1\5\1\20\3\5\1\0\3\5\4\0\6\5\2\0"+
-    "\1\5\2\0\1\17\4\5\1\0\3\5\5\0\1\21"+
-    "\31\0\1\22\24\0\6\5\2\0\1\5\2\0\1\23"+
-    "\4\5\1\0\3\5\3\0\1\24\34\0\1\25\23\0"+
-    "\6\5\2\0\1\5\2\0\3\5\1\17\1\5\1\0"+
-    "\3\5\6\0\1\16\32\0\1\26\27\0\1\27\21\0"+
-    "\1\30\36\0\1\31\30\0\1\6\14\0";
+    "\1\0\1\14\1\15\1\5\2\0\1\2\66\0\1\16"+
+    "\1\0\1\17\27\0\6\5\2\0\1\5\2\0\5\5"+
+    "\3\0\3\5\4\0\6\5\2\0\1\5\1\6\1\0"+
+    "\5\5\3\0\3\5\4\0\6\5\2\0\1\5\2\0"+
+    "\1\5\2\20\2\5\3\0\3\5\4\0\6\5\2\0"+
+    "\1\5\2\0\1\5\1\21\3\5\3\0\3\5\4\0"+
+    "\6\5\2\0\1\5\2\0\1\20\4\5\3\0\3\5"+
+    "\25\0\1\14\11\0\1\22\33\0\1\23\26\0\6\5"+
+    "\2\0\1\5\2\0\1\24\4\5\3\0\3\5\3\0"+
+    "\1\25\36\0\1\26\25\0\6\5\2\0\1\5\2\0"+
+    "\3\5\1\20\1\5\3\0\3\5\6\0\1\17\34\0"+
+    "\1\27\31\0\1\30\23\0\1\31\40\0\1\32\32\0"+
+    "\1\6\16\0";
 
   private static int [] zzUnpackTrans() {
-    int [] result = new int[504];
+    int [] result = new int[572];
     int offset = 0;
     offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
     return result;
@@ -167,11 +170,11 @@
   private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();
 
   private static final String ZZ_ATTRIBUTE_PACKED_0 =
-    "\1\0\1\1\1\11\1\0\1\1\1\11\4\1\1\11"+
-    "\1\1\2\0\2\1\2\0\1\1\5\0\1\1";
+    "\1\0\1\1\1\11\1\0\1\1\1\11\4\1\1\0"+
+    "\1\11\1\1\2\0\2\1\2\0\1\1\5\0\1\1";
 
   private static int [] zzUnpackAttribute() {
-    int [] result = new int[25];
+    int [] result = new int[26];
     int offset = 0;
     offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
     return result;
@@ -254,7 +257,7 @@
     char [] map = new char[0x10000];
     int i = 0;  /* index in packed string  */
     int j = 0;  /* index in unpacked array */
-    while (i < 98) {
+    while (i < 104) {
       int  count = packed.charAt(i++);
       char value = packed.charAt(i++);
       do map[j++] = value; while (--count > 0);
