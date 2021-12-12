diff --git a/src/be/ibridge/kettle/core/value/Value.java b/src/be/ibridge/kettle/core/value/Value.java
index fb9badb..a202956 100644
--- a/src/be/ibridge/kettle/core/value/Value.java
+++ b/src/be/ibridge/kettle/core/value/Value.java
@@ -1645,7 +1645,7 @@
                         // read this as a buffer not character by character
                         byte chars[] = new byte[stringLength];
                         int n = dis.read(chars);
-                        if (n == stringLength)
+                        if (n == stringLength || n==-1)
                         {
                             setValue(new String(chars, Const.XML_ENCODING));
                         }
