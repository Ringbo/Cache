diff --git a/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java b/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java
index 28cddae..5c1d596 100644
--- a/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java
+++ b/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java
@@ -65,7 +65,7 @@
          *  Low WORD.
          */
         public WORD getLow() {
-            return new WORD(longValue() & 0xFF);
+            return new WORD(longValue() & 0xFFFF);
         }
 				
         /**
@@ -74,7 +74,7 @@
          *  High WORD.
          */
         public WORD getHigh() {
-            return new WORD((longValue() >> 16) & 0xFF);
+            return new WORD((longValue() >> 16) & 0xFFFF);
         }
     }
 
