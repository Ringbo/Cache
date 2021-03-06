diff --git a/source/com/intellij/lexer/__XmlLexer.java b/source/com/intellij/lexer/__XmlLexer.java
index 77fd368..a762a35 100644
--- a/source/com/intellij/lexer/__XmlLexer.java
+++ b/source/com/intellij/lexer/__XmlLexer.java
@@ -1,4 +1,4 @@
-/* The following code was generated by JFlex 1.4 on 5/25/05 6:47 PM */
+/* The following code was generated by JFlex 1.4 on 6/3/05 5:06 PM */
 
  /* It's an automatically generated code. Do not modify it. */
 package com.intellij.lexer;
@@ -11,7 +11,7 @@
 /**
  * This class is a scanner generated by 
  * <a href="http://www.jflex.de/">JFlex</a> 1.4
- * on 5/25/05 6:47 PM from the specification file
+ * on 6/3/05 5:06 PM from the specification file
  * <tt>C:/Irida/tools/lexer/_XmlLexer.flex</tt>
  */
 public class __XmlLexer implements FlexLexer,ELHostLexer {
@@ -114,8 +114,8 @@
   private static final String ZZ_ACTION_PACKED_0 =
     "\1\1\3\0\1\2\3\0\2\3\2\0\1\1\1\4"+
     "\1\1\1\5\2\6\1\7\1\6\1\10\1\6\1\11"+
-    "\1\6\1\12\1\2\1\0\1\13\3\14\1\15\1\16"+
-    "\1\17\3\3\1\20\1\21\3\3\1\6\1\22\2\12"+
+    "\1\6\1\12\1\2\1\13\1\14\3\15\1\16\1\17"+
+    "\1\20\3\3\1\13\1\21\3\3\1\6\1\22\2\12"+
     "\2\6\4\1\1\0\1\23\1\24\7\0\1\25\1\26"+
     "\2\0\2\3\1\0\4\3\1\0\1\27\1\0\2\12"+
     "\1\0\1\3\3\0\1\1\1\30\3\0\1\31\10\0"+
@@ -348,13 +348,13 @@
 
   private static final String ZZ_ATTRIBUTE_PACKED_0 =
     "\1\1\3\0\1\1\3\0\2\1\2\0\5\1\1\11"+
-    "\2\1\1\11\5\1\1\0\1\1\1\11\2\1\3\11"+
-    "\4\1\1\11\4\1\1\11\4\1\1\11\3\1\1\0"+
-    "\2\11\7\0\2\11\2\0\2\1\1\0\4\1\1\0"+
-    "\1\11\1\0\2\1\1\0\1\11\3\0\2\1\3\0"+
-    "\1\11\10\0\2\11\6\1\3\11\2\0\1\11\2\0"+
-    "\6\1\2\0\4\1\2\0\4\1\2\0\2\1\2\0"+
-    "\2\1\2\11\2\1";
+    "\2\1\1\11\7\1\1\11\2\1\3\11\4\1\1\11"+
+    "\4\1\1\11\4\1\1\11\3\1\1\0\2\11\7\0"+
+    "\2\11\2\0\2\1\1\0\4\1\1\0\1\11\1\0"+
+    "\2\1\1\0\1\11\3\0\2\1\3\0\1\11\10\0"+
+    "\2\11\6\1\3\11\2\0\1\11\2\0\6\1\2\0"+
+    "\4\1\2\0\4\1\2\0\2\1\2\0\2\1\2\11"+
+    "\2\1";
 
   private static int [] zzUnpackAttribute() {
     int [] result = new int[143];
@@ -685,7 +685,7 @@
           { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
           }
         case 35: break;
-        case 16: 
+        case 11: 
           { return XmlTokenType.XML_BAD_CHARACTER;
           }
         case 36: break;
@@ -697,7 +697,7 @@
           { return elTokenType2;
           }
         case 38: break;
-        case 14: 
+        case 15: 
           { yybegin(ATTR_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
           }
         case 39: break;
@@ -764,15 +764,15 @@
           { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
           }
         case 54: break;
-        case 13: 
+        case 14: 
           { yybegin(ATTR_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
           }
         case 55: break;
-        case 15: 
+        case 16: 
           { return XmlTokenType.XML_EQ;
           }
         case 56: break;
-        case 12: 
+        case 13: 
           { yybegin(ATTR_LIST); yypushback(yylength());
           }
         case 57: break;
@@ -792,7 +792,7 @@
           { return XmlElementType.XML_MARKUP;
           }
         case 61: break;
-        case 11: 
+        case 12: 
           { yybegin(ATTR); return XmlTokenType.XML_NAME;
           }
         case 62: break;
@@ -821,7 +821,7 @@
           }
         case 68: break;
         default:
-          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
+          if (zzInput == YYEOF && zzStartRead <= zzCurrentPos) {
             zzAtEOF = true;
             zzDoEOF();
             return null;
