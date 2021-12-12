diff --git a/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppConfiguration.java b/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppConfiguration.java
index ec77a04..5756025 100644
--- a/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppConfiguration.java
+++ b/components/camel-smpp/src/main/java/org/apache/camel/component/smpp/SmppConfiguration.java
@@ -127,7 +127,7 @@
     }
 
     public void setDataCoding(byte dataCoding) {
-        this.alphabet = dataCoding;
+        this.dataCoding = dataCoding;
     }
     
     public byte getAlphabet() {
