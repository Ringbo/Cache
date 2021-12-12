diff --git a/src/com/fsck/k9/mail/internet/Iso2022JpToShiftJisInputStream.java b/src/com/fsck/k9/mail/internet/Iso2022JpToShiftJisInputStream.java
index 707e2b2..b558589 100644
--- a/src/com/fsck/k9/mail/internet/Iso2022JpToShiftJisInputStream.java
+++ b/src/com/fsck/k9/mail/internet/Iso2022JpToShiftJisInputStream.java
@@ -60,7 +60,7 @@
         if (in1 == '\n' || in1 == '\r')
             charset = Charset.ASCII;
 
-        if (in1 < 0x21 || in1 >= 0x7e)
+        if (in1 < 0x21 || in1 >= 0x7f)
             return in1;
 
         switch (charset)
@@ -71,7 +71,7 @@
                 return in1 + 0x80;
             case JISX0208:
                 int in2 = mIn.read();
-                if (in2 < 0x21 || in2 >= 0x7e)
+                if (in2 < 0x21 || in2 >= 0x7f)
                     throw new MalformedInputException(0);
 
                 int out1 = (in1 + 1) / 2 + (in1 < 0x5f ? 0x70 : 0xb0);
