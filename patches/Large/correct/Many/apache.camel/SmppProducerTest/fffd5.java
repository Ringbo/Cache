diff --git a/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppProducerTest.java b/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppProducerTest.java
index ce063b2..9b7152d 100644
--- a/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppProducerTest.java
+++ b/components/camel-smpp/src/test/java/org/apache/camel/component/smpp/SmppProducerTest.java
@@ -184,7 +184,7 @@
                 eq((byte) 0),
                 eq(new GeneralDataCoding(
                         false,
-                        false,
+                        true,
                         MessageClass.CLASS1,
                         Alphabet.ALPHA_DEFAULT)),
                 eq((byte) 0),
@@ -231,7 +231,7 @@
                 eq((byte) 0),
                 eq(new GeneralDataCoding(
                         false,
-                        false,
+                        true,
                         MessageClass.CLASS1,
                         Alphabet.ALPHA_DEFAULT)),
                 eq((byte) 0),
@@ -295,7 +295,7 @@
                 eq((byte) 0),
                 eq(new GeneralDataCoding(
                         false,
-                        false,
+                        true,
                         MessageClass.CLASS1,
                         Alphabet.ALPHA_8_BIT)),
                 eq((byte) 0),
