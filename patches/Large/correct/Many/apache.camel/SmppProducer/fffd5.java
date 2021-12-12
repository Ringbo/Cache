diff --git a/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppProducer.java b/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppProducer.java
index 4d8771e..7ecfbbe 100644
--- a/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppProducer.java
+++ b/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppProducer.java
@@ -143,7 +143,7 @@
                 submitSm.getReplaceIfPresent(),
                 new GeneralDataCoding(
                         false,
-                        false,
+                        true,
                         MessageClass.CLASS1,
                         Alphabet.valueOf(submitSm.getDataCoding())),
                 (byte) 0,
